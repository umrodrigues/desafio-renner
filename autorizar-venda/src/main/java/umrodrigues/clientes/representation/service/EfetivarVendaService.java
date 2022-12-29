package umrodrigues.clientes.representation.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umrodrigues.clientes.infra.mqeue.solicitacaoEfetivarPublisher;
import umrodrigues.clientes.representation.EfetivarRequest;
import umrodrigues.clientes.rest.exception.ErroenvioPublisher;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class EfetivarVendaService {

    private final solicitacaoEfetivarPublisher efetivarPublisher;


    @Transactional
    public EfetivarRequest savepedido(EfetivarRequest efetivacaoPedido){
        return new EfetivarRequest();
    }

    public Object solicitarPublisher(EfetivarRequest solicitaPublisher){
        try{
            solicitacaoEfetivarPublisher.efetivarVenda(solicitaPublisher);
            return new EfetivarRequest();
        }catch (Exception e){
            throw new ErroenvioPublisher(e.getMessage());
        }

    }

}
