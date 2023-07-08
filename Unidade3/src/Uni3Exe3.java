import java.util.Scanner;

public class Uni3Exe3 {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insira o valor do litro:");
        double valorDoLitro = keyboard.nextDouble();
        System.out.println("Insira o valor a ser pago:");
        double valorPago = keyboard.nextDouble();
        double total = valorPago / valorDoLitro;
        System.out.println("O caro será abastecido com: " + total + " litros");

        keyboard.close();
    }
}
