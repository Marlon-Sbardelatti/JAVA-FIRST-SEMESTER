import java.util.Scanner;

public class Uni5Exe32 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe em que dia da semana cai o primeiro dia do mês: ");
		int primeiroDia = kb.nextInt();
		while (primeiroDia != 0) {
			while (primeiroDia > 7) {
				System.out.println("Informe um dia válido");
				primeiroDia = kb.nextInt();
			}
			System.out.println("Informe quantos dias possui o mês: ");
			int totalDias = kb.nextInt();

			System.out.println("D   S   T   Q   Q   S   S");
			int dia = 1;

			for (int i = 1; i <= 6; i++) {
				for (int j = 1; j <= 7; j++) {
					switch (primeiroDia) {
						case 1:
							i++;
							primeiroDia = 0;
							break;
						case 2:
							System.out.print("    ");
							j++;
							i++;
							primeiroDia = 0;
							break;
						case 3:
							System.out.print("        ");
							j = 3;
							i++;
							primeiroDia = 0;
							break;
						case 4:
							System.out.print("            ");
							j = 4;
							i++;
							primeiroDia = 0;
							break;
						case 5:
							System.out.print("                ");
							j = 5;
							i++;
							primeiroDia = 0;
							break;
						case 6:
							System.out.print("                    ");
							j = 6;
							primeiroDia = 0;
							break;
						case 7:
							System.out.print("                        ");
							j = 7;
							primeiroDia = 0;
							break;
						default:
							break;
					}
					if (dia < 10) {
						System.out.print(dia + "   ");
					} else {
						System.out.print(dia + "  ");
					}
					if (dia == totalDias) {
						break;
					}
					dia++;
				}
				System.out.print('\n');
			}
			System.out.println("Informe em que dia da semana cai o primeiro dia do mês: ");
			primeiroDia = kb.nextInt();
		}
		kb.close();
	}
}
