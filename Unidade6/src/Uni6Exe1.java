import java.util.Scanner;

public class Uni6Exe1 {

    public static void main(String[] args) {
        new Uni6Exe1();
    }

    public Uni6Exe1() {
        Scanner kb = new Scanner(System.in);

        int nums[] = new int[10];

        System.out.println("Informe 10 números reais inteiros: ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = kb.nextInt();
        }
        System.out.println(" ");

        invertedNums(nums);

        output(nums);

        kb.close();

    }

    private void invertedNums(int array[]) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
    }

    private static void output(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
