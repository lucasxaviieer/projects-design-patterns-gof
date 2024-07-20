package lucas.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lucas.gof.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws") // urlbase do cliente
public interface ViaCepService {
	
	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);

}
