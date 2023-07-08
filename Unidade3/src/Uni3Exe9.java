import java.util.Scanner;

public class Uni3Exe9 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        final double pi = 3.14159;

        System.out.println("Insira o valor do raio:");
        double raio = keyboard.nextDouble();
        while (raio < 0 ) {
            System.out.println("Insira um valor valido");
            raio = keyboard.nextDouble();
        }


        System.out.println("Insira o valor da altura:");
        double altura = keyboard.nextDouble();
        while (altura < 0 ) {
            System.out.println("Insira um valor valido");
            altura = keyboard.nextDouble();
        }


        double volume = pi * ( raio * raio) * altura;
        System.out.println("Volume: " + volume);


        keyboard.close();
    }
}
