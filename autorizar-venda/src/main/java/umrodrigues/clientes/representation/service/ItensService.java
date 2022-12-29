package umrodrigues.clientes.representation.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umrodrigues.clientes.model.entity.Itens;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ItensService {


    @Transactional
    public Itens saveitens(Itens itens){
        return new Itens();
    }
}
