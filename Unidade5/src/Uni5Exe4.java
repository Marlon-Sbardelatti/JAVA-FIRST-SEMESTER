import java.util.Scanner;

public class Uni5Exe4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double numerador = 3;
		double denominador = 2;
		double termo = 4;
		double soma = 0;
		for (int i = 0; i < 20; i++) {
			double frac = numerador / denominador;	
			soma += frac;
			numerador += 2;
			denominador += termo;
			termo += 2;

		}
		System.out.println(soma);
		kb.close();
	}
}
