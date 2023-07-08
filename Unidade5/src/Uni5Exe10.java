import java.util.Scanner;

public class Uni5Exe10 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		for (double i = 0; i < Integer.MAX_VALUE; i++) {
			double num = i / 100;
			String stringNum = Double.toString(num);
			String[] splitNum = stringNum.split("\\.");

			int split1 = Integer.parseInt(splitNum[0]);
			int split2 = Integer.parseInt(splitNum[1]);
			int calc = (split1 + split2);
			calc *= calc;
			if (calc == i) {
				System.out.println(calc);
			}
		}
		kb.close();

	}
}
