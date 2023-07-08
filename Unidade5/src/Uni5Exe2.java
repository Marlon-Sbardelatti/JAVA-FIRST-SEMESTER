import java.util.Scanner;

	public class Uni5Exe2 {    

	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		 
		int somaPares = 0;
		int somaImpares = 0;
			for (int i = 1; i <= 100; i++) {
				if(i % 2 == 0){
					somaPares = somaPares + i;
				}else{
					somaImpares = somaImpares + i;
				}	
			}

			System.out.println("A soma dos números pares entre 1 e 100 é = " + somaPares);
			System.out.println("A soma dos números ímpares entre 1 e 100 é = " + somaImpares);
		kb.close();
    		}
	}
