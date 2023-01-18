package springproject.apispring.repository;

import org.springframework.data.repository.CrudRepository;
import springproject.apispring.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
