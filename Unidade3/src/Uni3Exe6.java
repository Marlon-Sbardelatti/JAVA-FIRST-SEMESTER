import java.util.Scanner;

public class Uni3Exe6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Insira o peso do prato em quilos:");
        double quiloCliente = keyboard.nextDouble();
        double calc = (quiloCliente * 25) - 0.75;

        System.out.println("O valor a ser pago será de: " + calc);
        
        
        keyboard.close();
    }
}



