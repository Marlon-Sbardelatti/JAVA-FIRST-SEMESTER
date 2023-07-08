import java.util.Scanner;

public class Uni5Exe11 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int y = 1;
		for (int i = 0; i < 16; i++) {
			
			System.out.println(y);
			y *=3;
		}

		kb.close();
	}
}