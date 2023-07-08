import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insira a medidade do primeiro cateto");
        double cateto1 = keyboard.nextDouble();
        System.out.println("Insira a medidade do segundo cateto");
        double cateto2 = keyboard.nextDouble();
        double hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        System.out.println("A hipotenusa é igual a: " + Math.sqrt(hipotenusa));
        keyboard.close();
    }
}
