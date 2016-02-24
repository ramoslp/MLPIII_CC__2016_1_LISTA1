public class Fatura {

	private String numero;
	private String descricao;
	private int qtd;
	private double preco;
	
	public Fatura(){
		
	}

	public Fatura(String numero, String descricao, int qtd, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.qtd = qtd;
		this.preco = preco;
	}

	public double getValorFatura() {
		double valor = this.preco * this.qtd;
		if (valor < 0)
			return 0;
		return valor;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public int getQtd(){
		return this.qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double getPreco(){
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}