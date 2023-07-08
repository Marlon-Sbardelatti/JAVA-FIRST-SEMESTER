import java.util.Scanner;

	public class Uni5Exe26 {    

	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

		System.out.println("Qual valor Astolfo se nega a pagar?");
		double valor = kb.nextInt();

		System.out.println("Qual o custo do pedágio?");		
		double pedagio = kb.nextDouble();
		int acima = 0;
		int trechos = 0;
		int acima150 = 0;
		while (pedagio >= 0) {
			trechos++;
			if(pedagio > valor){
				acima++;
			}
		System.out.println("Qual a distância do trecho?");
		double dist = kb.nextDouble();
			if(dist > 150 && pedagio < valor){
				acima150++;
			}
		System.out.println("Qual o custo do pedágio?");		
		pedagio = kb.nextDouble();
		}
		System.out.println("trechos com o valor acima do qual ele nega-se a pagar: " + acima);
		System.out.println("quantidade de trechos informados: " + trechos);
		System.out.println("trechos acima de 150km com o valor aceito por ele: " + acima150);

		kb.close();
    		}
	}
