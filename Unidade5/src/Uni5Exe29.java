import java.util.Scanner;

public class Uni5Exe29 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Informe o valor pago: ");
		int valor = kb.nextInt();

		while (valor > 0) {
			int vinte = valor / 20;
			int dez = (valor % 20) / 10; 
			int cinco = (valor % 10) / 5;
			int dois = (valor % 5) / 2;
			int um = valor - ((vinte * 20) + (dez * 10) + (cinco * 5) + (dois * 2)); 
			System.out.println(vinte + " nota(s) de 20 reais");
			System.out.println(dez + " nota(s) de 10 reais");
			System.out.println(cinco + " nota(s) de 5 reais");
			System.out.println(dois + " nota(s) de 2 reais");
			System.out.println(um + " moeda(s) de 1 real");
			System.out.println("Informe o valor pago: ");
			valor = kb.nextInt();
		}

		kb.close();
	}
}
