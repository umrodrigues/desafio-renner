package umrodrigues.clientes.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mqconfig {

    @Value("${mq.queues.autorizar-venda-queue}")
    private String efetivarSolicitacao;
    public Queue queueSolicitacaoEfetivar(){
        return new Queue(efetivarSolicitacao, true);
    }
}
