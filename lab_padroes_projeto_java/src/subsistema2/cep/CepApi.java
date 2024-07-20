package subsistema2.cep;

public class CepApi {
	
	private static CepApi cepApi = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstance() {
		return cepApi;
	}
	
	public String recuperarCidade(String Cep) {
		return "Manaus";
	}
	
	public String recuperarEstado(String Cep) {
		return "Amazonas";
	}

}
