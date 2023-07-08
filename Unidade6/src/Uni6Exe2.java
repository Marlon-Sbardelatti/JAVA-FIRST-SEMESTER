import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni6Exe2 {

	public static void main(String[] args) {
		new Uni6Exe2();
	}

	public Uni6Exe2() {
		Scanner kb = new Scanner(System.in);
		double nums[] = new double[12];

		System.out.println("Informe 12 números reais: ");

		input(kb, nums);

		double average = average(nums);
		System.out.println("Média:" + average);

		biggerAverage(nums, average);
		kb.close();
	}

	public static void input(Scanner kb, double array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = kb.nextDouble();
		}
	}

	private static double average(double array[]) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		double calc = total / 12;
		return calc;
	}

	private static void biggerAverage(double array[], double average) {
		DecimalFormat df = new DecimalFormat("0.00");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > average) {
				System.out.println(array[i] + " é maior que a média: " + df.format(average));
			}
		}
	}
}
