import java.util.Scanner;

public class Uni6Exe5 {

	public static void main(String[] args) {
		new Uni6Exe5();
	}

	public Uni6Exe5() {
		Scanner kb = new Scanner(System.in);
		String[] arrayMan = new String[5];
		String[] arrayWoman = new String[5];

		System.out.println("Informe as respostas do rapaz: ");
		input(kb, arrayMan);
		System.out.println(" ");
		System.out.println("Informe as respostas da moça: ");
		input(kb, arrayWoman);
		System.out.println(" ");

		calcMatch(arrayMan, arrayWoman);
		kb.close();
	}

	private void input(Scanner kb, String array[]) {
		for (int i = 0; i < array.length; i++) {
			switch (i) {
				case 0:
					System.out.println("Gosta de música sertaneja?(SIM || NÃO || IND):  ");
					break;
				case 1:
					System.out.println("Gosta de futebol?(SIM || NÃO || IND):  ");
					break;
				case 2:
					System.out.println("Gosta de seriados?(SIM || NÃO || IND):  ");
					break;
				case 3:
					System.out.println("Gosta de redes sociais?(SIM || NÃO || IND):  ");
					break;
				case 4:
					System.out.println("Gosta da Oktoberfest?(SIM || NÃO || IND):  ");
					break;

				default:
					break;
			}
			array[i] = kb.next().toUpperCase();
		}

	}
	// debugging tests
	/*
	 * private void output(String[] array) {
	 * for (int i = 0; i < array.length; i++) {
	 * System.out.println(array[i]);
	 * }
	 * }
	 */

	private void calcMatch(String[] arrayMan, String[] arrayWoman) {
		int total = 0;
		for (int i = 0; i < arrayWoman.length; i++) {
			if (arrayMan[i].equals(arrayWoman[i])) {
				total += 3;
			} else if (arrayMan[i].equals("IND") && arrayWoman[i].equals("SIM")
					|| arrayMan[i].equals("IND") && arrayWoman[i].equals("NÃO")
					|| arrayWoman[i].equals("IND") && arrayMan[i].equals("SIM")
					|| arrayWoman[i].equals("IND") && arrayMan[i].equals("NÃO")) {
				total++;
			} else if (arrayMan[i].equals("SIM") && arrayWoman[i].equals("NÃO")) {
				total -= 2;
			}
		}
		if (total == 15) {
			System.out.println("Afinidade = " + total + "! Casem!");
		} else if (total >= 10 && total <= 14) {
			System.out.println("Afinidade = " + total + "! Vocês têm muita coisa em comum!");
		} else if (total >= 5 && total <= 9) {
			System.out.println("Afinidade = " + total + "! Talvez não dê certo :(");
		} else if (total >= 0 && total <= 4) {
			System.out.println("Afinidade = " + total + "! Vale um encontro");
		} else if (total <= -1 && total >= -9) {
			System.out.println("Afinidade = " + total + "! Melhor não perder tempo");
		} else if (total <= -10) {
			System.out.println("Afinidade = " + total + "! Vocês se odeiam!");
		}
		

	}

}
