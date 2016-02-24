public class Carro {

	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	private boolean ligado;

	public Carro(String cor, String modelo, int velocidadeMaxima) {
		this(cor, modelo, 0, velocidadeMaxima);
	}

	public Carro(String cor, String modelo, int velocidadeAtual, int velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
		if (velocidadeAtual > 0){
			this.ligado = true;
		}
	}
	
	public void ligar(){
		this.ligado = true;
	}

	public void acelarar(int velocidade) {
		if (ligado){
			if (this.velocidadeMaxima > this.velocidadeAtual + velocidade){
				this.velocidadeAtual += velocidade;
			}else{
				System.out.println("Velocidade máxima de " +this.velocidadeMaxima+ " km/h atingida!");
				this.velocidadeAtual = this.velocidadeMaxima;
			}
		}else System.out.println("Carro desligado");
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public String getModelo(){
		return this.modelo;
	}

	public int getVelocidadeAtual() {
		return this.velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return this.velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

}