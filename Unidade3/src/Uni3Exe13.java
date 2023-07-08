import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        System.out.printf("Digite a altura: ");
        double altura = kb.nextDouble();
        while(altura <= 0){
            System.out.println("Digite uma altura válida!");
            altura = kb.nextDouble();
        }
        
        System.out.printf("Digite a largura: ");
        double largura = kb.nextDouble();
        while(largura <= 0){
            System.out.println("Digite uma largura válida!");
            largura = kb.nextDouble();
        }

        double area = altura * largura;
        double total = area * (12.50 * 9);
        System.out.println("O valor gasto na compra dos azulejos foi de: " + total);

        kb.close();
    }
}
