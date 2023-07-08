import java.util.Scanner;

	public class Uni5Exe1 {    

	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
			for (int i = 0; i < 20; i++) {
				int x = kb.nextInt();
				if(x % 2 == 0){
					System.out.println(x + " é par");
				}else{
					System.out.println(x + " é ímpar");
				}
			}

		kb.close();
    		}
	}
