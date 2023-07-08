import java.util.Scanner;

public class Uni5Exe31 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe um número inteiro positivo: ");
		int valor = kb.nextInt();

		while (valor > 0) {
			int count;

			for (int i = 2; i <= valor; i++) {
				count = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}

				if (count == 0) {
					if (valor % i == 0) {
						if (valor > 9 && valor < 100) {
							System.out.println(valor + "   " + i);
						} else if (valor > 99) {
							System.out.println(valor + "  " + i);
						} else {
							System.out.println(valor + "    " + i);
						}
						valor = valor / i;
						if (valor % i == 0) {
							i--;
						}
					}
				}

			}
			System.out.println(valor);
			System.out.println("Informe um número inteiro positivo: ");
			valor = kb.nextInt();
		}

		kb.close();
	}
}
