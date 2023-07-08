import java.util.Scanner;

public class Uni5Exe16 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Insira a altura: ");
		double altura = kb.nextDouble();

		int qtdHomens = 0;
		int qtdMulheres = 0;
		double alturaHomens = 0;
		double alturaMulheres = 0;
		while (altura != 0) {
			System.out.println("Insira o sexo");
			String sexo = kb.next().toUpperCase();

			switch (sexo) {
				case "F":
					qtdMulheres++;
					alturaMulheres += altura;
					break;
				case "M":
					qtdHomens++;
					alturaHomens += altura;
					break;
				default:
					break;
			}
			System.out.println("Insira a altura: ");
			altura = kb.nextDouble();
		}
		double mediaMulheres = alturaMulheres / qtdMulheres;
		System.out.println("A média de altura das mulheres é de: " + mediaMulheres);
		double mediaGrupo = (alturaHomens + alturaMulheres) / (qtdHomens + qtdMulheres);
		System.out.println("A média de altura do grupo é de: " + mediaGrupo);
		kb.close();
	}
}
