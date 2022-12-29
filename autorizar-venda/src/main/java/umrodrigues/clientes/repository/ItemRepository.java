package umrodrigues.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umrodrigues.clientes.model.entity.Itens;

public interface ItemRepository extends JpaRepository<Itens, Integer> {
}
