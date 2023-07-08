import java.util.Scanner;

public class Uni5Exe3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double calc = 0.0;

		for (double i = 1.0; i <= 100; i++) {
			double fracao = 1.0 / i;
			calc = calc + fracao;
		}

		System.out.println(calc);
		kb.close();
	}
}
