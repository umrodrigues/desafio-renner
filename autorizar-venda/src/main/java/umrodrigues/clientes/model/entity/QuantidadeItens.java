package umrodrigues.clientes.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class QuantidadeItens {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" )
    private Long id;

    @Column(name = "totalItens" )
    private Integer totalItens;

    @Column(name = "quantidadeItens" )
    private Integer quantidadeItens;
}
