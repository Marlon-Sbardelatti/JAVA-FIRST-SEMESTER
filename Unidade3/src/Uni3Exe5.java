import java.util.Scanner;
import java.text.DecimalFormat;
public class Uni3Exe5 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df_02 = new DecimalFormat("0.00");

        double anel1 = 4.00;
        double anel2 = 3.50 * 2;
        System.out.println("Insira a quantidade de frangos: ");
        double qtdFrango = keyboard.nextDouble();

        while(qtdFrango < 0 ){
            System.out.println("Insira um valor válido");
            qtdFrango = keyboard.nextDouble();
        }

        double calc = (anel1 + anel2) * qtdFrango;

        System.out.println("O valor a ser gasto pela granja será de: " + df_02.format(calc));

        keyboard.close();
    }
}
