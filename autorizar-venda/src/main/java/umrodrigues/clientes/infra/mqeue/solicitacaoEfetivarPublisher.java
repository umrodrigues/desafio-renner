package umrodrigues.clientes.infra.mqeue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import umrodrigues.clientes.representation.EfetivarRequest;
import umrodrigues.clientes.representation.SaleRequest;

@RequiredArgsConstructor
@Component
public class solicitacaoEfetivarPublisher {

   // @RabbitListener(queues = "${mq.queues.autorizar-venda-queue}")
    //public void enviarSolicitacaoEfetivar(@Payload String payload){
       // System.out.println(payload);
   // }

    private final RabbitTemplate rabbitTemplate;
    private final Queue queueSolicitacaoEfetivar;

    public static void efetivarVenda(EfetivarRequest saleRequest) throws JsonProcessingException {
        var json = convertIntoJson(saleRequest);
        rabbitTemplate.convertAndSend(queueSolicitacaoEfetivar.getName(), json);
    }

    private String convertIntoJson(SaleRequest saleRequest) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        var json = mapper.writeValueAsString(saleRequest);
        return json;
    }

}
