package dio.gof.strategy;

public class Robo {
	
	private Comportamento comportamento; // nossa strategy
	
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public void mover() {
		comportamento.mover();
	}

}
