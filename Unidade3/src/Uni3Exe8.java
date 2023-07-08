import java.util.Scanner;
import java.text.DecimalFormat;
public class Uni3Exe8 {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("Digite o valor em dólares: ");
        double valueDolar = keyboard.nextDouble();

        while (valueDolar < 0) {
            System.out.println("Insira um valor válido");
            valueDolar = keyboard.nextDouble();
        }

        double cotacao = 5.26;

        double result = valueDolar * cotacao;
        System.out.println("O valor a ser devolvido será de: " + df_2.format(result) + " reais");

        keyboard.close();
    }
}
