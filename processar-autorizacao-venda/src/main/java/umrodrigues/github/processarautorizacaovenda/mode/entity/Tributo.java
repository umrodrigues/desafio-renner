package umrodrigues.github.processarautorizacaovenda.mode.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Tributo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" )
    private Long id;

    @Column(name = "sku" )
    private Integer sku;

    @Column(name = "valorIcms" )
    private Integer valorIcms;

    @Column(name = "valorPis" )
    private Integer valorPis;

    @Column(name = "valorDifaul" )
    private Integer valorDifaul;

    @Column(name = "valorFcpIcms" )
    private Integer valorFcpIcms;

}
