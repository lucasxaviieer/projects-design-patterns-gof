package dio.gof.application;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.Comportamento;
import dio.gof.strategy.ComportamentoAgressivo;
import dio.gof.strategy.ComportamentoDefensivo;
import dio.gof.strategy.ComportamentoNormal;
import dio.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy); // retorna endereço de memoria
		lazy = SingletonLazy.getInstance(); // nova isntancia para cheacr se o endereço de memoria muda
		System.out.println(lazy); // checando o endereço de memria novamente
		
		// ------------------
		
		System.out.println("Eager");
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager); // retorna endereço de memoria
		eager = SingletonEager.getInstance(); // nova isntancia para cheacr se o endereço de memoria muda
		System.out.println(eager); // checando o endereço de memria novamente
		
		// ------------------
		
		System.out.println("LazyHolder");
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder); // retorna endereço de memoria
		lazyHolder = SingletonLazyHolder.getInstance(); // nova isntancia para cheacr se o endereço de memoria muda
		System.out.println(lazyHolder); // checando o endereço de memria novamente
		
		//--------------
		
		// Strategy
		
		Comportamento comportamentoNormal = new ComportamentoNormal();
		Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
		Comportamento comportamentoAgressivo = new ComportamentoAgressivo();
		
		// mover normalmente
		Robo robo = new Robo();
		robo.setComportamento(comportamentoNormal);
		
		robo.mover();
		robo.mover();
		
		// mover defensivo
		robo.setComportamento(comportamentoDefensivo);
		robo.mover();
		
		// mover agressivamente
		robo.setComportamento(comportamentoAgressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Lucas", "69054-733"); 
		/* resultado deve ser o facade abstrair a complexidade da implememntnaçao de nossos
		 * subsistemas de retornam para a gente a cidade e om estado no nosso CEP, conseguindo assim
		 * migrar o nosso clinete "Lucas", com seu CEP para a nossa nova base de dados com os dados
		 * complementares de Cidade e estado
		*/
		
	}

}
