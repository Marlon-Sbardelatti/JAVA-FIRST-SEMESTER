import java.util.Scanner;
import java.text.DecimalFormat;

	public class Uni5Exe34 {    

	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("(1)Encerrar a conta de um hóspede" + '\n' + "(2)Verificar o número de contas encerradas" + '\n' + "(3)Sair");
		int option = kb.nextInt();
		int contasEncerradas = 0;
		do {
		switch (option) {
			case 1:
			System.out.println("Informe o nome do hóspede: ");	
			String nome = kb.next();
			System.out.println("Informe o número de diárias do hóspede: ");
			int diarias = kb.nextInt();
			double valor = 50;
			if(diarias < 15){
				valor = valor + (diarias * 7.5);
			}else if( diarias == 15){
				valor = valor + (diarias * 6.50);
			}else{
				valor = valor + (diarias * 5);
			}
			System.out.println("O hóspede " + nome + " irá pagar " + df.format(valor) + " reais");
			contasEncerradas++;
				break;
			case 2:
			System.out.println("O número de hóspedes que deixaram o hotel é de: " + contasEncerradas);
			default:
				break;
		}	
		System.out.println('\n'+"(1)Encerrar a conta de um hóspede" + '\n' + "(2)Verificar o número de contas encerradas" + '\n' + "(3)Sair");
		option = kb.nextInt();
		} while (option != 3);

		kb.close();
    		}
	}