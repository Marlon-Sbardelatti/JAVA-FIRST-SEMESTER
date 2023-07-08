import java.util.Scanner;

public class Uni5Exe20 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe a massa do elemento radioativo em kgs: ");
		double massa = kb.nextDouble();
		double massaGramas = massa * 1000;

		double tempo = 0;
		while (massaGramas >= 0.5) {
			massaGramas = massaGramas / 2;
			tempo += 50;
		}
			System.out.println("A massa inicial de " + massa + " kg(s)" + " foi reduzida a " + massaGramas + " grama(s)"
					+ " em um intervalo de " + tempo + " segundo(s)");
		kb.close();
	}
}
