import java.util.Scanner;

public class Uni3Exe2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the shoe value: ");
            double shoeValue = keyboard.nextDouble();
            double discount = (shoeValue * 12 )/ 100;
            double result = shoeValue - discount;
            System.out.println("O valor do desconto é de R$: " + discount);
            System.out.println("O preço do par de sapatos com desconto é R$: " + result);


        keyboard.close();
    }
}
