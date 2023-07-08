import java.util.Scanner;

	public class Uni5Exe21 {    

	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

		double chico = 1.50 * 100;
		double ze = 1.10 * 100;
		int ano = 0;
		while (ze <= chico) {
			chico += 2;
			ze += 3;	
			ano += 1;
		}
		System.out.println("Para que Zé seja maior que Chico serão necessarios " + ano + " anos" + " quando Zé tera a altura de " + (ze / 100) + " metros" + " e Chico " + (chico / 100) + " metros");
		kb.close();
    		}
	}
