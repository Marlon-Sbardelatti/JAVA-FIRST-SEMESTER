import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insira o valor de graus celsius.");
        double celsius = keyboard.nextDouble();
        double f = ((9/5.0) * celsius + 32) ;
        System.out.println(f);
        keyboard.close();
    }
}
