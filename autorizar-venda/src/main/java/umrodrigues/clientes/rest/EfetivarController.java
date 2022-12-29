package umrodrigues.clientes.rest;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import umrodrigues.clientes.model.entity.Canal;
import umrodrigues.clientes.model.entity.Cliente;
import umrodrigues.clientes.model.entity.Itens;
import umrodrigues.clientes.repository.CanalRepository;
import umrodrigues.clientes.repository.ClienteRepository;
import umrodrigues.clientes.repository.ItemRepository;
import umrodrigues.clientes.representation.SaleRequest;
import umrodrigues.clientes.representation.service.CanalService;
import umrodrigues.clientes.representation.service.ClienteService;
import umrodrigues.clientes.representation.service.EfetivarVendaService;
import umrodrigues.clientes.representation.service.ItensService;

import javax.validation.Valid;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("autorizacao-venda")
@RequiredArgsConstructor
@Slf4j
public class EfetivarController {
    private ClienteRepository repository;

    private ItemRepository itemRepository;

    private CanalRepository canalRepository;


    private final ItensService itensService;

    private final CanalService canalService;

    private final ClienteService clienteService;

    private final EfetivarVendaService efetivarVendaService;


    @Autowired
    public void setRepository(ClienteRepository clienteRespository){
        this.repository = clienteRespository;
    }

    @Autowired
    public void setRepository(ItemRepository itemRepository){
        this.itemRepository = itemRepository;

    }

    @Autowired
    public void setRepository(CanalRepository canalRepository){
        this.canalRepository = canalRepository;
    }




    //consulta se o serviço esta no ar

    @GetMapping
    public String status(){
        log.info("Serviço UP");
        return "ok";
    }

    //Cadastra um cliente
    @PostMapping(value = "/cliente")
    @ResponseStatus(HttpStatus.CREATED)
   public Cliente save(@RequestBody @Valid Cliente cliente){
        return repository.save(cliente);
   }

    //Consulta cliente

    @GetMapping("{id}")
   public Cliente localizarPorId( @PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
   }

   //salvar item
    @PostMapping(value = "/saveitens")
    @ResponseStatus(HttpStatus.CREATED)
    public Itens salvarItem(@RequestBody @Valid Itens itens){
        return itemRepository.save(itens);
    }

    //salvar canal de atendimento

    @PostMapping(value = "/savecanal")
    @ResponseStatus(HttpStatus.CREATED)
    public Canal salvarCanal(@RequestBody @Valid Canal canal){
        return canalRepository.save(canal);
    }

    //formatação de hora
    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

    //autorizar-venda

    @PostMapping(value = "/autorizar-venda")
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody SaleRequest saleRequest) {
        var efetivarpedido  = saleRequest.toModelefetivar();
        efetivarVendaService.savepedido(efetivarpedido);
        URI headerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("numeroPedido={numeroPedido}")
                .buildAndExpand(efetivarpedido.getClass())
                .toUri();

        return "Status: Em processamento | Data resposta: " + data + " " + hora;

    }


}
