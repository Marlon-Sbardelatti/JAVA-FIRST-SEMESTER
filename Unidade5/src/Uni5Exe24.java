import java.util.Scanner;

public class Uni5Exe24 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe o limite diário em kgs: ");
		double limite = kb.nextDouble();
		System.out.println("Informe o peso em gramas do peixe: ");
		double pesoPeixe = (kb.nextDouble() / 1000);
		double pesoTotal = pesoPeixe;
			if (pesoTotal > limite) {
				System.out.println("Limite excedido");
			}
		while (limite > pesoTotal) {
			System.out.println("Peso total da pesca: " + pesoTotal + " kgs");

			System.out.println("Deseja informar o peso de mais um peixe? s(SIM) / n(NÃO)");
			String res = kb.next().toLowerCase();
			if (res.equals("n")) {
				break;
			} else {
				System.out.println("Informe o peso em gramas do peixe: ");
				pesoPeixe = (kb.nextDouble() / 1000);
				pesoTotal += pesoPeixe;
				if (pesoTotal > limite) {
					System.out.println("Limite excedido");
				}
			}
		}

		kb.close();
	}
}
