import java.util.Scanner;

public class Uni6Exe3 {

	public static void main(String[] args) {
		new Uni6Exe3();
	}

	public Uni6Exe3() {
		Scanner kb = new Scanner(System.in);
		double nums[] = new double[12];

		System.out.println("Informe 12 números reais: ");
		input(kb, nums);

		incrementNums(nums);

		output(nums);
		kb.close();
	}

	 private static void input(Scanner kb, double array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] = kb.nextDouble();
		}

	}

	private static void incrementNums(double array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = (array[i] * 0.02) + array[i];
			} else {
				array[i] = (array[i] * 0.05) + array[i];
			}
		}
	}

	private static void output(double array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
