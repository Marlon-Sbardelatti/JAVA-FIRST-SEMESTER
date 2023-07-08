import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe27 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Informe o dia do mês de abril: ");
		int dia = kb.nextInt();
		double diaProdutivo = 0;
		int melhorDia = 0;
		while (dia == (int)dia) {
			if(dia < 1 || dia > 30){
				break;
			}
			System.out.println("Informe quantas peças o funcionario produziu no periodo matutino:");
			double pecasManha = kb.nextInt();
			System.out.println("Informe quantas peças o funcionario produziu no periodo vespertino:");
			double pecasTarde = kb.nextInt();
			double total = pecasManha + pecasTarde;
			if (total > diaProdutivo) {
				diaProdutivo = total;
				melhorDia = dia;
			}
			if (dia >= 1 && dia <= 15 && total > 100) {
				if (pecasManha >= 30 && pecasTarde >= 30) {
					total = total * 0.80;
				} else {
					total = total * 0.50;
				}
			} else if (dia >= 16 && dia <= 30) {
				total = (pecasManha * 0.40) + (pecasTarde * 0.30);
			}

			System.out.println("R$" + df.format(total) + " (valor recebido)");
			if (pecasTarde > pecasManha) {
				System.out.println(
						"O funcionario teve maior produtividade pela tarde produzindo " + pecasTarde + " peças");
			} else {
				System.out.println(
						"O funcionario teve maior produtividade pela manhã produzindo " + pecasManha + " peças");
			}
			System.out.println("Novo funcionario? 1(sim) / 2(não)");
			int res = kb.nextInt();
			boolean shouldBreak = false;
			switch (res) {
				case 1:
					System.out.println("Informe o dia do mês de abril: ");
					dia = kb.nextInt();
					break;
				case 2:
				shouldBreak = true;
					break;
				default:
					break;
			}
			if(shouldBreak){
				break;
			}
		}
		System.out.println("O dia mais produtivo foi " + melhorDia + " de abril");

		kb.close();
	}
}
