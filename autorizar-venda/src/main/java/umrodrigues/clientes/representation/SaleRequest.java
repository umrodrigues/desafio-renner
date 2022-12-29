package umrodrigues.clientes.representation;

import lombok.Data;

import java.util.List;
@Data

public class SaleRequest {
        private String canal;

        private Integer empresa;

        private Integer loja;

        private Integer pdv;

        private EfetivarRequest ordemPedido;

        private EfetivarRequest cliente;


        private Integer totalItens;

        private Integer quantidadeItens;

        private List<EfetivarRequest> itens;

        public EfetivarRequest toModelefetivar(){
            return new EfetivarRequest();

        }

    }


