import java.util.Scanner;

	public class Uni5Exe19 {    

	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

		System.out.println("Informe o valor da compra: ");
		double valor = kb.nextDouble();
		double total = 0;
		double desc20 = 0;
		double desc15 = 0;
		while (valor != 0) {
		while(valor < 0){
			System.out.println("Informe um valor válido");
			valor = kb.nextDouble();
		}
		if(valor > 500){
			desc20 = 0.20 * valor;
			double total20 = (valor - desc20);
			System.out.println("Você recebeu um desconto de 20%, você pagará : " + total20);	
			total += total20;
		}else{
			desc15 = 0.15 * valor;
			double total15 = (valor - desc15);
			System.out.println("Você recebeu um desconto de 15%, você pagará : " + total15);	
			total += total15;
		}
		System.out.println("Informe o valor da compra: ");
		valor = kb.nextDouble();

		}
		System.out.println("O total recebido pela loja foi: " + total);
		kb.close();
    		}
	}
