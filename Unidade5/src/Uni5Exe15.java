import java.util.Scanner;

public class Uni5Exe15 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Insira o nome do aluno: ");
		String nome = kb.next();
		while (!nome.equals("fim")) {
			System.out.println("Insira a primera nota:");
			double nota1 = kb.nextDouble();
			System.out.println("Insira a segunda nota: ");
			double nota2 = kb.nextDouble();
			double calc = (nota1 + nota2) / 2;
			System.out.println("A média do aluno: " + nome + " é: " + calc);
			System.out.println("Insira o nome do aluno: ");
			nome = kb.next();
		}
		kb.close();
	}
}