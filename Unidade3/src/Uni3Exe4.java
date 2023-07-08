import java.util.Scanner;

public class Uni3Exe4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Insira a nota 1: ");
        double nota1 = keyboard.nextDouble();
        System.out.print("Insira a nota 2: ");
        double nota2 = keyboard.nextDouble();
        System.out.print("Insira a nota 3: ");
        double nota3 = keyboard.nextDouble();

        double media = ((nota1 * 5) + (nota2  * 3) + (nota3 * 2)) / 10;
        System.out.println("Media: " + media);

        keyboard.close();
    }
}
