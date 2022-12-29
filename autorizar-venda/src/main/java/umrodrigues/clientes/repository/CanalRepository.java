package umrodrigues.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umrodrigues.clientes.model.entity.Canal;
public interface CanalRepository extends JpaRepository<Canal, Integer> {

}
