package umrodrigues.clientes.representation.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umrodrigues.clientes.model.entity.Canal;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CanalService {

    @Transactional
    public Canal savecanal(Canal canal){
        return new Canal();
    }
}
