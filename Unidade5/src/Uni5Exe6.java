import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double total = 0;
		for (int i = 1; i <= 20; i++) {
			System.out.println("Insira a sua altura: ");
			double altura = kb.nextDouble();
			total += altura;
		}
		System.out.println("A média de altura das 20 pessoas é de: " + df.format(total / 20) + " metros");
		kb.close();
	}
}
