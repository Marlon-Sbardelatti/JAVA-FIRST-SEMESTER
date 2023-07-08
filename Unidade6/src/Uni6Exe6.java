import java.util.Scanner;

public class Uni6Exe6 {

	public static void main(String[] args) {
		new Uni6Exe6();
	}

	public Uni6Exe6() {
		Scanner kb = new Scanner(System.in);
		double[] array = input(kb);
		checkELem(kb, array);
		kb.close();
	}

	private double[] input(Scanner kb) {
		System.out.println("Informe um valor inteiro que represente o tamanho do array: ");
		int n = kb.nextInt();
		double[] array = new double[n];
		System.out.println("Informe os elementos do array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = kb.nextDouble();
		}
		return array;
	}

	private boolean checkELem(Scanner kb, double[] array) {
		System.out.println("Informe um número real: ");
		double num = kb.nextDouble();
		boolean isInArray = false;
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				isInArray = true;
			}
		}
		if (isInArray) {
			System.out.println("O número informado esta presente no array!");
		} else {
			System.out.println("O número informado não esta presente no array :(");
		}
		return isInArray;
	}
}
