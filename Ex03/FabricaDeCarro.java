public class FabricaDeCarro {
	
	private static FabricaDeCarro instance;
	
	static {
		//inicialização da classe
	}

	private FabricaDeCarro() {
		//construtor privado
	}

	public static FabricaDeCarro getInstance() {
		if (instance == null)
			inicializaInstancia();
		
		return instance;
	}

	private static synchronized void inicializaInstancia() {
		if (instance == null)
			instance = new FabricaDeCarro();
	}
}