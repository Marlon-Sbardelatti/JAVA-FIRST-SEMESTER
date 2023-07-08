import java.util.Scanner;

public class Uni5Exe25 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Quem marcou o ponto?");
		String ponto = kb.next().toLowerCase();
		int pontosD = 0;
		int pontosE = 0;
		int dif = 0;
		while (dif < 22) {
			if (ponto.equals("d")) {
				pontosD++;
			} else if (ponto.equals("e")) {
				pontosE++;
			}
			dif = Math.abs(pontosD - pontosE);
			System.out.println("PLACAR: " + '\n' + "Jogador da direita: " + pontosD + '\n' + "Jogador da esquerda: " + pontosE);
				if(pontosD == 21 && dif >= 2 || pontosD > 21 && dif >= 2){
					System.out.println("O vencedor foi o jogador da direita");
					break;
				}
				if(pontosE == 21 && dif >= 2 || pontosE > 21 && dif >= 2){
					System.out.println("O vencedor foi o jogador da esquerda");
					break;
				}
			System.out.println("Quem marcou o ponto?");
			ponto = kb.next().toLowerCase();
		}

		kb.close();
	}
}
