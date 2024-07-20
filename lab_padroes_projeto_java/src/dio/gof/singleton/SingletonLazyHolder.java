package dio.gof.singleton;

/**
 * 
 * Singleton "LAzyHolder",
 * @author Lucas
 *
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instancia;
	}
}
