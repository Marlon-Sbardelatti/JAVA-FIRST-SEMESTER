import java.util.Scanner;

public class Uni6Exe4 {

	public static void main(String[] args) {
		new Uni6Exe4();
	}

	public Uni6Exe4() {
		Scanner kb = new Scanner(System.in);

		int first[] = new int[10];
		int second[] = new int[10];
		int third[] = new int[10];

		System.out.println("Informe 10 números inteiros para o primeiro array: ");
		input(kb, first);
		System.out.println("Informe 10 números inteiros para o segundo array: ");
		input(kb, second);
		third = sum(first, second, third);

		System.out.print("Array 1 = [ ");
		output(first);
		System.out.print("]\n");

		System.out.print("Array 2 = [ ");
		output(second);
		System.out.print("]\n");

		System.out.print("Array 3 = [ ");
		output(third);
		System.out.print("]\n");


		kb.close();
	}

	private void input(Scanner kb, int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = kb.nextInt();
		}
	}

	private int[] sum(int array1[], int array2[], int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array1[i] + array2[i];
		}
		return array;
	}

	private void output(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if(i == array.length - 1){
				System.out.print(array[i]);
			}else{
			System.out.print(array[i] + ", ");
			}
		}
	}
}
