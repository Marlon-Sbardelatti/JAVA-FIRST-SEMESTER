import java.util.Scanner;

public class Uni6Exe7 {

	public static void main(String[] args) {
		new Uni6Exe7();
	}

	public Uni6Exe7() {
		Scanner kb = new Scanner(System.in);
		int[] array = input(kb);
		bubbleSort(array);
		output(array);
		kb.close();
	}

	private static int[] input(Scanner kb) {
		System.out.println("Informe um valor inteiro entre 1 e 20 que irá determinar o tamanho do array: ");
		int n = kb.nextInt();
		while (n < 1 || n > 20) {
			System.out.println("Informe um valor válido: ");
			n = kb.nextInt();
		}
		int[] array = new int[n];
		System.out.println("Popule o array com valores inteiros: ");
		// linear Sort
		for (int i = 0; i < array.length; i++) {
			int value = kb.nextInt();
			for (int j = 0; j < array.length; j++) {
				while (array[j] == value) {
					System.out.println("Valor já existe no array, informe outro valor: ");
					value = kb.nextInt();
				}
			}
			array[i] = value;

		}
		return array;
	}

	private static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	private static void output(int[] array) {
		System.out.println("Array ordernado com bubble sort: ");
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i] + "]");
			} else {
				System.out.print(array[i] + ",");
			}
		}
	}
	}