import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[]args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Insira o valor da compra: ");
        double valor = kb.nextDouble();
        while(valor < 0){
            System.out.println("Insira um valor valido");
            valor = kb.nextDouble();
        }
        double cem = (valor / 100);
        double dez = (valor % 100)/10;
        double um = (valor % 10)/1;
        double total = cem + dez + um;
        System.out.println(Math.floor(total) +  " notas serão devolvidas");
        System.out.println(Math.floor(cem) + " notas de 100 reais");
        System.out.println(Math.floor(dez) + " notas de 10 reais");
        System.out.println(Math.floor(um) + " notas de 1 real");
        kb.close();
    }
}
