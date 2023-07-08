import java.util.Scanner;

public class Uni5Exe18 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe o número do canal (4,5,9 ou 12): ");
		int canal = kb.nextInt();
		int total = 0;
		int pessoasQuatro = 0;
		int pessoasCinco = 0;
		int pessoasNove = 0;
		int pessoasDoze = 0;
		while (canal != 0) {
			System.out.println("Informe o número de pessoas: ");
			int pessoas = kb.nextInt();
			System.out.println("");
			switch (canal) {
				case 4:
					total += pessoas;
					pessoasQuatro += pessoas;
					break;
				case 5:
					pessoasCinco += pessoas;
					total += pessoas;

					break;
				case 9:
					pessoasNove += pessoas;
					total += pessoas;
					break;
				case 12:
					pessoasDoze += pessoas;
					total += pessoas;
					break;

				default:
					System.out.println("Canal inválido, informe um canal válido (4,5,9 ou 12)" + '\n');
					break;
			}

			System.out.println("Informe o número do canal: ");
			canal = kb.nextInt();
		}
		double pctQuatro = ((double) pessoasQuatro / (double) total) * 100;
		double pctCinco = ((double) pessoasCinco / (double) total) * 100;
		double pctNove = ((double) pessoasNove / (double) total) * 100;
		double pctDoze = ((double) pessoasDoze / (double) total) * 100;

		System.out.println("A porcetagem de pessoas que assistem ao canal 4 é de: " + pctQuatro + "%");
		System.out.println("A porcetagem de pessoas que assistem ao canal 5 é de: " + pctCinco + "%");
		System.out.println("A porcetagem de pessoas que assistem ao canal 9 é de: " + pctNove + "%");
		System.out.println("A porcetagem de pessoas que assistem ao canal 12 é de: " + pctDoze + "%");
		kb.close();
	}
}
