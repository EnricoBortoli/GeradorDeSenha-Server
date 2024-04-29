package Mobile.GeradorDeSenha.repository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.data.jpa.repository.query;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    
}
