import java.util.Scanner;

public class Uni5Exe30 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe o valor de n: ");
		int n = kb.nextInt();

		System.out.println("Informe o valor de k: ");
		int k = kb.nextInt();

		System.out.println("Informe o valor de m: ");
		int m = kb.nextInt();
		System.out.println(" ");
		int mochila = m;
		String elementos = "";
		String elementosColocados = "";
		String elementosFora = "";
		int somaColocados = 0;
		int somaFora = 0;

		while (n > 0) {
			elementos = elementos + " " + n;
			if (mochila - n >= 0) {
				somaColocados += n;
				elementosColocados = elementosColocados + " " + n;
				mochila -= n;
			} else {
				somaFora += n;
				elementosFora = elementosFora + " " + n;
			}
			n -= k;
		}
		System.out.println("Os elementos a serem colocados na mochila são:" + elementos);
		System.out.println("Os elementos que entraram na mochila são:" + elementosColocados);
		System.out.println("Os elementos que ficaram de fora da mochila são:" + elementosFora);
		System.out.println("A soma dos elementos que entraram na mochila é: " + somaColocados);
		System.out.println("A soma dos elementos que não entraram na mochila é: " + somaFora);

		kb.close();
	}
}
