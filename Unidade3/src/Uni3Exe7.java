import java.util.Scanner;

public class Uni3Exe7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double lata = 350.00;
        double garrafa = 600.00;
        double litrao = 2;

        System.out.println("Insira a quantidade de latas: ");
        int qtdLatas = keyboard.nextInt();

        while(qtdLatas < 0){
            System.out.println("Insira um valor válido");
            qtdLatas = keyboard.nextInt();
        }

        System.out.println("Insira a quantidade de garrafas: ");
        int qtdGarrafas = keyboard.nextInt();

        while(qtdGarrafas < 0){
            System.out.println("Insira um valor válido");
            qtdGarrafas = keyboard.nextInt();
        }

        System.out.println("Insira a quantidade de litrãos: ");
        int qtdLitrao = keyboard.nextInt();

        while(qtdLitrao < 0){
            System.out.println("Insira um valor válido");
            qtdLitrao = keyboard.nextInt();
        }

        double total = (((qtdLatas * lata)/1000) + ((qtdGarrafas * garrafa) / 1000) + ((qtdLitrao * litrao)));
        System.out.println("O total será de: " + total + " litros");
        keyboard.close();
    }
}
