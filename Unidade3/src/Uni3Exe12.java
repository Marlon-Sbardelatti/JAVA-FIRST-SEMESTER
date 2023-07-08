import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Insira o nome do funcionario: ");
        String nome = keyboard.nextLine();

        System.out.println("Insira a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = keyboard.nextDouble();
        while (horasTrabalhadas < 0 ) {
            System.out.println("Insira uma valor valido");
            horasTrabalhadas = keyboard.nextDouble();
        }

        System.out.println("Insira o numero de dependentes: ");
        int dependentes = keyboard.nextInt();

        double salario = (horasTrabalhadas * 10 + (dependentes * 60));

        double inss = (salario * 8.5) / 100;
        double impostoDeRenda = (salario * 5) / 100;
        
        double liquido = salario - inss - impostoDeRenda;
        System.out.println("O salario bruto de " + nome + " é de " + salario + " reais");
        System.out.println("O salario liquido de " + nome + " é de " + liquido + " reais");

        keyboard.close();
    }
}
