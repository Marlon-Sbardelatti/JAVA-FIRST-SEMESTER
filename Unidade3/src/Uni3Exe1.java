import java.util.Scanner;

public class Uni3Exe1 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Insira a largura: ");
        double largura = keyboard.nextDouble();

        System.out.println("Insira a altura: ");
        double altura = keyboard.nextDouble();

        double area = largura * altura;
        System.out.println("Area: " + area);

        keyboard.close();
    }
}
