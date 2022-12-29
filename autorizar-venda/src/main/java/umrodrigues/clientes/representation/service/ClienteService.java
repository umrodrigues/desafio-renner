package umrodrigues.clientes.representation.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umrodrigues.clientes.model.entity.Cliente;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    @Transactional
    public Cliente save(Cliente cliente){
        return new Cliente();
    }

}
