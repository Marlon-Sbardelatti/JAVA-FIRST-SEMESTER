import java.util.Scanner;

public class Uni5Exe13 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Quantas paradas ocorreram na viajem?");
		int paradas = kb.nextInt();
		double totalKms = 0;
		double totalCombustivel = 0;

		for (int i = 0; i < paradas; i++) {
			System.out.println("Informe o valor do odometro em kms: ");
			double odometro = kb.nextDouble();
			totalKms += odometro;

			System.out.println("Informe a quantidade de combustivel em litros comprado nesta parada: ");
			double combustivel = kb.nextDouble();
			totalCombustivel += combustivel;

			double kmPorLitro = odometro / combustivel;
			System.out.println(
					"A quilometragrem obtida por litro nesta parada foi de: " + kmPorLitro + " km/l");
		}
		double calc = totalKms / totalCombustivel;
		System.out.println("A média durante toda a viagem foi de: " + calc + " quilometros por litro");
		kb.close();
	}
}
