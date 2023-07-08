import java.util.Scanner;

public class Uni5Exe7 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe a quantidade de números");
		int num = kb.nextInt();
		double menor = Integer.MAX_VALUE;
		double maior = 0;
		for (int i = 0; i < num; i++) {
			double real = kb.nextDouble();

			menor = Math.min(menor, real);
			maior = Math.max(maior, real);
		}
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		kb.close();
	}
}
