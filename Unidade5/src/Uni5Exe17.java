import java.util.Scanner;

public class Uni5Exe17 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Insira o número de inscrição do atleta: ");
		int id = kb.nextInt();
		int totalAtletas = 0;
		double alturaTotal = 0;
		double maior = 0;
		int idMaior = 0;
		double menor = Integer.MAX_VALUE;
		int idMenor = 0;

		while (id != 0) {
			System.out.println("Insira a altura do atleta: ");
			double altura = kb.nextDouble();
			totalAtletas++;
			alturaTotal += altura;
			if(altura < menor){
				menor = altura;
				idMenor= id;
			}
			else if(altura > maior){
				maior = altura;
				idMaior = id;
			}
			System.out.println("Insira o número de inscrição do atleta: ");
			id = kb.nextInt();
		}
		double media = alturaTotal / totalAtletas;
		System.out.println("A altura média do grupo de atletas é de: " + media);
		System.out.println(idMaior + " é o maior atleta com " + maior + " metros de altura");
		System.out.println(idMenor + " é o menor atleta com " + menor + " metros de altura");
		kb.close();
	}
}
