package umrodrigues.clientes.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Itens {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" )
    private Long id;

    @Column(name = "itens" )
    private Integer itens;

    @Column(name = "sku" )
    private Integer sku;

    @Column(name = "quantidade" )
    private Integer quantidade;

    @Column(name = "valor" )
    private Integer valor;

}
