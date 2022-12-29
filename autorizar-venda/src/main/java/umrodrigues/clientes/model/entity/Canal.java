package umrodrigues.clientes.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Canal {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" )
    private Long id;


    @Column(name = "canal" )
    private String canal;

    @Column(name = "empresa" )
    private Integer empresa;

    @Column(name = "loja" )
    private Integer loja;

    @Column(name = "pdv" )
    private Integer pdv;


}
