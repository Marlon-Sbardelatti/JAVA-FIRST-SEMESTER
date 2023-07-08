import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) throws Exception {
       Scanner kb = new Scanner(System.in);
       System.out.println("Insira um número inteiro com 3 digitos: ");
       int num = kb.nextInt();
       while(num > 999){
        System.out.println("Insira um valor valido: ");
        num = kb.nextInt();
       }

       double centenas = num / 100;
       double dezenas = (num % 100) / 10;
       double unidades = (num % 10) / 1;
       System.out.println(Math.floor(centenas) + " centena(s)");
       System.out.println(Math.floor(dezenas) + " dezena(s)");
       System.out.println(Math.floor(unidades) + " unidade(s)");
       kb.close();  
    }
}
