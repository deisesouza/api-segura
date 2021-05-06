package br.com.dgstascom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.dgstascom.model.Usuario;

public interface UsuarioRepository extends  JpaRepository<Usuario, Long>{
	
}
