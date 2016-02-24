public class TestaCarro {

	public static void main(String[] args){
		
		Carro c1 = new Carro("Vermelho", "Ferrari Enzo", 360);
		
		c1.ligar();
		c1.acelarar(400);
		c1.acelarar(-100);
		System.out.println("Velocidade atual da " +c1.getModelo()+ ": " +c1.getVelocidadeAtual()+ " km/h\n");
		
		
		Carro c2 = new Carro("Amarelo", "Ferrari F40", 300, 325);
		
		c2.acelarar(100);
		c2.acelarar(-120);
		System.out.println("Velocidade atual da " +c2.getModelo()+ ": " +c2.getVelocidadeAtual()+ " km/h\n");
		
	}

}