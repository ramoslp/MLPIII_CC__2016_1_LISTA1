public class TestaFatura {

	public static void main(String[] args) {

		Fatura f1 = new Fatura("68420", "Memória RAM 4GB 1600MHz DDR3", 2, 176.35);

		Fatura f2 = new Fatura("33159", "Conector RJ45", 10, 0.49);

		System.out.printf("R$ %.2f\n", f1.getValorFatura());
		System.out.printf("R$ %.2f\n", f2.getValorFatura());
	}

}