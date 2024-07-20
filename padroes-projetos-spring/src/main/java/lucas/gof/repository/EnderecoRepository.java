package lucas.gof.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lucas.gof.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
