package lucas.gof.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tab_cliente")
@Setter
@Getter
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // mudei de identity para auto
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;
	
}
