import java.util.Scanner;

public class Uni5Exe33 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe o número do seu voto: (1,2,3 e 4) = candidatos, 5 voto em branco e 6 voto nulo.");
		int voto = kb.nextInt();
		double um = 0;
		double dois = 0;
		double tres = 0;
		double quatro = 0;
		double branco = 0;
		double nulo = 0;
		double total = 0;
		

		do {
			switch (voto) {
				case 1:
					um++;
					total++;
					break;
				case 2:
					dois++;
					total++;
					break;
				case 3:
					tres++;
					total++;
					break;
				case 4:
					quatro++;
					total++;
					break;
				case 5:
					branco++;
					total++;
					break;
				case 6:
					nulo++;
					total++;
					break;

				default:
				System.out.println("Opção incorreta, informe um número válido:");
					break;
			}
		System.out.println("Informe o número do seu voto: (1,2,3 e 4) = candidatos, 5 voto em branco e 6 voto nulo.");
		voto = kb.nextInt();
		} while (voto != 0);
		System.out.println("O total de votos do primeiro candidato foi: " + um);
		System.out.println("O total de votos do segundo candidato foi: " + dois);
		System.out.println("O total de votos do terceiro candidato foi: " + tres);
		System.out.println("O total de votos do quarto candidato foi: " + quatro);
		System.out.println("O total de votos nulos foi: " + nulo);
		System.out.println("O total de votos brancos foi: " + branco);
		System.out.println("O percentual dos votos brancos e nulos foi: " + ((branco + nulo) / total) * 100 + "%");
		kb.close();
	}
}