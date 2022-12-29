package umrodrigues.clientes.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" )
    private Long id;

    @Column(name = "nome" )
    private String nome;
    @Column(name = "documento" )
    private Integer documento;

    @Column(name = "tipoPessoa" )
    private String tipoPessoa;

    @Column(name = "tipoDocumento" )
    private String tipoDocumento;

    @Column(name = "endereco" )
    private String endereco;

    @Column(name = "numeroEndereco" )
    private Integer numeroEndereco;

    @Column(name = "complementoEndereco" )
    private String complementoEndereco;

    @Column(name = "bairro" )
    private String bairro;

    @Column(name = "cidade" )
    private String cidade;

    @Column(name = "pais" )
    private String pais;

    @Column(name = "cep" )
    private Integer cep;

    @Column(name = "codigoIBGE" )
    private Integer codigoIBGE;

    @Column(name = "telefone" )
    private Integer telefone;

    @Column(name = "email" )
    private String email;


}
