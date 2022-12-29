package umrodrigues.github.processarautorizacaovenda.rest;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("processar-autorizacao-venda")
@RequiredArgsConstructor
@Slf4j
public class ProcessarController {


    //consulta se o serviço esta no ar

    @GetMapping
    public String status(){
        log.info("Serviço UP");
        return "ok";
    }

}
