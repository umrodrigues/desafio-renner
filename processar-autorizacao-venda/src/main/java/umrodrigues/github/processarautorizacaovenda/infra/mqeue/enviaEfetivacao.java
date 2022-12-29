package umrodrigues.github.processarautorizacaovenda.infra.mqeue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class enviaEfetivacao {

    @RabbitListener(queues = "${mq.queues.autorizar-venda-queue}")
    public void enviarSolicitacaoEfetivar(@Payload String payload){
        System.out.println(payload);
    }
}
