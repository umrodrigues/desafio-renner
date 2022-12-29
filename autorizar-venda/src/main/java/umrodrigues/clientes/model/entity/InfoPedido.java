package umrodrigues.clientes.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class InfoPedido {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" )
    private Long id;
    @Column(name = "numeroPedido" )
    private InfoPedido numeroPedido;

    @Column(name = "numeroOrdemExterno" )
    private Integer numeroOrdemExterno;

    @Column(name = "dataAutorizacao" )
    private Date dataAutorizacao;
}
