import java.util.Scanner;

public class Uni6Exe8 {

	public static void main(String[] args) {
		new Uni6Exe8();
	}

	public Uni6Exe8() {
		Scanner kb = new Scanner(System.in);

		double[] array = input(kb);
		output(array);
		kb.close();
	}

	private static double[] input(Scanner kb) {
		System.out.println("Informe o tamanho do array || 1 a 20: ");
		int size = kb.nextInt();
		while (size < 1 || size > 20) {
			System.out.println("Informe um valor válido: ");
			size = kb.nextInt();
		}
		double[] array = new double[size];
		System.out.println("Informe valores reais para popular o array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = kb.nextDouble();
		}
		return array;

	}

	private static void output(double[] array) {
		System.out.println(" ");
		System.out.println("VALOR" + "      " + "FREQUÊNCIA");
		for (int i = 0; i < array.length; i++) {
			boolean isUnique = false;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					isUnique = true;
					break;
				}
			}
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == array[i]) {
					count++;
				}
			}
			if (!isUnique) {
				if (array[i] < 0) {
					if (array[i] == (int) array[i]) {
						System.out.println(array[i] + "            " + count);
					}else{
						System.out.println(array[i] + "           " + count);
					}

				} else {
					if (array[i] == (int) array[i]) {
						System.out.println(array[i] + "             " + count);
					}else{
						System.out.println(array[i] + "            " + count);
					}

				}
			}
		}
		System.out.println(" ");
	}
}
