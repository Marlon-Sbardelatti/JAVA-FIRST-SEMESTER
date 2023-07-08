import java.util.Scanner;

public class Uni5Exe12 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe o número de linhas: ");
		int n = kb.nextInt();

		int k = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(k + "  ");

				k++;
			}

			System.out.println();
		}

			kb.close();
	}
}
