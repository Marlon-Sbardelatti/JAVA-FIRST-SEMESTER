import java.util.Scanner;

public class Uni5Exe5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int x = 8;
		int y = 10;
		System.out.println(' ');
		System.out.println(8);
		System.out.println(10);
		for (int i = 0; i < n; i++) {
			y = y + x;
			x = x + x;
			System.out.println(x);
			System.out.println(y);
		}

		kb.close();
	}
}
