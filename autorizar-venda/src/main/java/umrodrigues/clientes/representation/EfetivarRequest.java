package umrodrigues.clientes.representation;


import lombok.Data;
import umrodrigues.clientes.model.entity.Canal;
import umrodrigues.clientes.model.entity.Cliente;
import umrodrigues.clientes.model.entity.Itens;

import java.util.Date;

@Data
public class EfetivarRequest {
    private String nome;
    private Integer documento;

    private String tipoPessoa;

    private String tipoDocumento;

    private String endereco;

    private Integer numeroEndereco;

    private String complementoEndereco;

    private String bairro;

    private String cidade;

    private String pais;

    private Integer cep;

    private Integer codigoIBGE;

    private Integer telefone;

    private String email;

    public Cliente toModel(){
        return new Cliente();

    }

    public void salvarSale(EfetivarRequest efetivarpedido) {
    }

    @Data
    public class CanalSaveRequest {

        private String canal;

        private Integer empresa;

        private Integer loja;

        private Integer pdv;

        public Canal toModelcanal() {
            return new Canal();

        }
    }
    @Data
    public class ItensSaveRequest {

        private Integer sku;

        private Integer quantidade;



        private Integer valor;


        public Itens toModelitens(){
            return new Itens();

        }

    }
    @Data
    public class OrderPedidoRequest {

        private Integer numeroPedido;

        private Integer numeroOrdemExterno;

        private Date dataAutorizacao;

    }
    @Data
    public class QuantidadeItensSaveRequest {

        private Integer totalItens;
        private Integer quantidadeItens;
    }
}

