import java.util.Scanner;

public class Uni6Exe9 {

	public static void main(String[] args) {
		new Uni6Exe9();
	}

	public Uni6Exe9() {
		Scanner kb = new Scanner(System.in);
		int[][] array = input(kb);
		mansAverageGrade(array);
		yougestWoman(array, averageGrades(array));
		kb.close();
	}

	private int[][] input(Scanner kb) {
		int array[][] = new int[3][30];
		for (int i = 0; i < 30; i++) {
			System.out.println("Qual o sexo do cliente? (1)Feminino || (2)Masculino ");
			int sex = kb.nextInt();
			while (sex < 1 || sex > 2) {
				System.out.println("Informe um número válido: ");
				sex = kb.nextInt();
			}
			System.out.println("Qual nota o cliente deu para o cinema: ");
			int grade = kb.nextInt();
			while (grade < 0 || grade > 10) {
				System.out.println("Informe um número válido: ");
				grade = kb.nextInt();
			}
			System.out.println("Qual a idade do cliente: ");
			int age = kb.nextInt();
			while (age < 1) {
				System.out.println("Informe uma idade válida: ");
				age = kb.nextInt();
			}

			array[0][i] = sex;
			array[1][i] = grade;
			array[2][i] = age;
		}
		return array;

	}

	private int averageGrades(int[][] array) {
		int sumGrades = 0;
		int totalGrades = 0;
		for (int i = 0; i < 30; i++) {
			sumGrades += array[1][i];
			totalGrades++;
		}
		int averageGrades = sumGrades / totalGrades;
		System.out.println("A nota média recebida pelo cinema foi: " + averageGrades);
		return averageGrades;
	}

	private void mansAverageGrade(int[][] array) {
		int sumGrades = 0;
		int totalGrades = 0;
		int totalMans = 0;
		for (int i = 0; i < 30; i++) {
			if (array[0][i] == 2) {
				totalMans++;
			}

		}
		if (totalMans != 0) {
			for (int i = 0; i < 30; i++) {
				if (array[0][i] == 2) {
					sumGrades += array[1][i];
					totalGrades++;
				}
			}
			int averageGrades = sumGrades / totalGrades;

			System.out.println("A nota média atribuida pelos homens foi: " + averageGrades);
		} else {
			System.out.println("Nenhum homem participou da votação.");
		}
	}

	private void yougestWoman(int array[][], int average) {
		int totalWomans = 0;
		int womanAbove50 = 0;

		for (int i = 0; i < 30; i++) {
			if (array[0][i] == 1) {
				totalWomans++;
				if (array[2][i] > 50 && array[1][i] > average) {
					womanAbove50++;
				}
			}
		}
		if (totalWomans != 0) {
			int[] arrayWomans = new int[totalWomans];
			int cont = 0;
			int[] arrayWomans2 = new int[totalWomans];
			int[] womanGrades = new int[totalWomans];
			for (int i = 0; i < 30; i++) {
				if (array[0][i] == 1) {
					arrayWomans[cont] = array[2][i];
					arrayWomans2[cont] = array[2][i];
					womanGrades[cont] = array[1][i];
					cont++;
				}
			}

			// bubble sort
			for (int i = 0; i < arrayWomans.length; i++) {
				for (int j = 0; j < arrayWomans.length - 1 - i; j++) {
					if (arrayWomans[j] > arrayWomans[j + 1]) {
						int temp = arrayWomans[j];
						arrayWomans[j] = arrayWomans[j + 1];
						arrayWomans[j + 1] = temp;
					}

				}
			}
			int smallestNum = arrayWomans[0];
			int indexSmallestNum = 0;
			for (int i = 0; i < arrayWomans2.length; i++) {
				if (arrayWomans2[i] == smallestNum) {
					indexSmallestNum = i;
				}
			}
			int finalNum = womanGrades[indexSmallestNum];
			System.out.println("A nota atribuida pela mulher mais jovem foi: " + finalNum);
			System.out.println("Mulheres que deram nota superior a media: " + womanAbove50);
		} else {
			System.out.println("Nenhuma mulher participou da votação.");
		}

	}
}