import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        System.out.printf("Insira o valor da distância percorrida em kms: ");
        double distancia = kb.nextDouble();
        while (distancia < 0) {
            System.out.println("Insira uma distância valida.");
            distancia = kb.nextDouble();
        }
        System.out.printf("Insira o tempo em que a distância foi percorrida em horas: ");
        double tempo = kb.nextDouble();
        while (tempo < 0) {
            System.out.println("Insira um valor de tempo valido.");
            tempo = kb.nextDouble();
        }
        double media = distancia / tempo;
        double litros = distancia / 12;
        System.out.println("A velocidade media da viajem foi de: " + media + " km/h");
        System.out.println("Foram gastos " + litros + " litro(s) na viajem");
        kb.close();

    }
}
