import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe28 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Informe o código da banda, (1,2,3 e 4): ");
		int codigo = kb.nextInt();
		int nenhum = 0;
		int cpm = 0;
		int skank = 0;
		int jota = 0;
		double total = 0;
		int maiorNenhumCpm = 0;
		int maiorJotaSkank = 0;
		int maiorTodos = 0;
		while (codigo > 0) {
			switch (codigo) {
				case 1:
					nenhum++;
					total++;
					break;
				case 2:
					cpm++;
					total++;
					break;
				case 3:
					skank++;
					total++;
					break;
				case 4:
					jota++;
					total++;
					break;
				default:
					break;
			}
			System.out.println("Mais um voto: s(SIM) / n(NÃO)?");
			String res = kb.next().toLowerCase();
			if (res.equals("n")) {
				break;
			}
			maiorNenhumCpm = Math.max(nenhum, cpm);
			maiorJotaSkank = Math.max(jota, skank);
			maiorTodos = Math.max(maiorNenhumCpm, maiorJotaSkank);
			System.out.println("Informe o código da banda, (1,2,3 e 4): ");
			codigo = kb.nextInt();
		}
		System.out.println("O total de votos para a banda Nenhum de nós foi: " + nenhum);
		System.out.println("O total de votos para a banda CPM 22: " + cpm);
		System.out.println("O total de votos para a banda Skank: " + skank);
		System.out.println("O total de votos para a banda Jota Quest: " + jota);
		System.out.println("");
		System.out.println("A banda Nenhum de nós obteve " + df.format((nenhum / total) * 100) + "% dos votos");
		System.out.println("A banda CPM 22 obteve " + df.format((cpm / total) * 100) + "% dos votos");
		System.out.println("A banda Skank obteve " + df.format((skank / total) * 100) + "% dos votos");
		System.out.println("A banda Jota Quest obteve " + df.format((jota / total) * 100) + "% dos votos");
		if (nenhum == cpm && nenhum == skank && nenhum == jota) {
			System.out.println("Empate");
		} else if (maiorTodos == nenhum) {
			System.out.println("A banda vencedora foi: Nenhum de nós");
		} else if (maiorTodos == cpm) {
			System.out.println("A banda vencedora foi: CPM 22");
		} else if (maiorTodos == skank) {
			System.out.println("A banda vencedora foi: Skank");
		} else {
			System.out.println("A banda vencedora foi: Jota Quest");
		}
		kb.close();
	}
}