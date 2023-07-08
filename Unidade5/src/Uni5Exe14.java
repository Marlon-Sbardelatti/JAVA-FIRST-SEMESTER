import java.util.Scanner;

public class Uni5Exe14 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {
			System.out.println("Insira o nome da mercadoria: ");
			String nome = kb.next();

			System.out.println("Insira o preço de compra da mercadoria: ");
			double pc = kb.nextDouble();

			System.out.println("Insira o preço de venda da mercadoria: ");
			double pv = kb.nextDouble();

			double lucro = (pv - pc) / pc * 100;

			if (lucro < 10) {
				System.out.println("A mercadoria: " + nome + " foi comprada por: " + pc + " e foi vendida por: " + pv
						+ " obtendo um lucro de: " + lucro + "%");
			} else if (lucro >= 10 && lucro <= 20) {
				System.out.println("A mercadoria: " + nome + " foi comprada por: " + pc + " e foi vendida por: " + pv
						+ " obtendo um lucro de: " + lucro + "%");
			} else if (lucro > 20) {
				System.out.println("A mercadoria: " + nome + " foi comprada por: " + pc + " e foi vendida por: " + pv
						+ " obtendo um lucro de: " + lucro + "%");

			}
		}

		kb.close();
	}
}