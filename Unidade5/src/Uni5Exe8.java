import java.util.Scanner;

public class Uni5Exe8 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Informe a quantidade de números: ");
		int n = kb.nextInt();
		int positivos = 0;
		int negativos = 0;
		int qtdPositivos = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Insira um valor inteiro: ");
			int valor = kb.nextInt();
			if (valor >= 0) {
				qtdPositivos++;
				positivos += valor;
			} else {
				if (valor < negativos) {
					negativos = valor;
				}
			}
		}
		System.out.println("O menor valor negativo é: " + negativos);
		int media = positivos / qtdPositivos;
		System.out.println("A média dos números positivos é: " + media);
		kb.close();
	}
}