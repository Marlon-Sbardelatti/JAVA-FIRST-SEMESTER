import java.util.Scanner;

public class Uni5Exe22 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double salario = 2000;
		double pct = 0.015;
		double aumento = 0;
		int ano = 1996;

		while (ano <= 2023) {
			salario += aumento;
			aumento = pct * salario;
			pct *= 2;
			ano++;

		}
			System.out.println("O salário do funcionario no ano de 2023 é de: " + salario);
		kb.close();
	}
}
