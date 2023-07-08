import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        new Uni6Exe10();
    }

    private Uni6Exe10() {
        Scanner kb = new Scanner(System.in);
        int[] array = new int[50];
        menu(kb, array);
        kb.close();
    }

    private void menu(Scanner kb, int[] array) {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Incluir valor ");
        System.out.println("2 - Pesquisar valor ");
        System.out.println("3 - Alterar valor ");
        System.out.println("4 - Excluir valor");
        System.out.println("5 - Mostrar valores");
        System.out.println("6 - Ordenar valores ");
        System.out.println("7 - Inverter valores");
        System.out.println("8 - Sair do sistema");
        int choice = kb.nextInt();
        int index = 0;
        while (choice != 8) {
            switch (choice) {
                case 1:
                    add(kb, array, index);
                    if (index != array.length) {
                        index++;
                    }
                    break;
                case 2:
                    search(kb, array);
                    break;
                case 3:
                    change(kb, array);
                    break;
                case 4:
                    delete(kb, array, index);
                    index--;
                    break;
                case 5:
                    show(array, index);
                    break;
                case 6:
                    order(array, index);
                    break;
                case 7:
                    invert(array, index);
                    break;

                default:
                    break;
            }
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Incluir valor ");
            System.out.println("2 - Pesquisar valor ");
            System.out.println("3 - Alterar valor ");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores ");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            choice = kb.nextInt();
        }
    }

    private void add(Scanner kb, int[] array, int index) {
        System.out.println("Informe o valor a ser adicionado: ");
        int value = kb.nextInt();
        if (index != array.length) {
            array[index] = value;
            System.out.println("Valor adicionado!");
        } else {
            System.out.println("Array cheio.");
        }
    }

    private void search(Scanner kb, int[] array) {
        System.out.println("Informe o valor a ser pesquisado: ");
        boolean found = false;
        int value = kb.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Valor encontrado no array!");
        } else {
            System.out.println("Valor não encontrado no array :(");
        }
    }

    private void change(Scanner kb, int[] array) {
        System.out.println("Informe o valor que será trocado:");
        int value = kb.nextInt();
        System.out.println("Informe o novo valor: ");
        int newValue = kb.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                found = true;
                array[i] = newValue;
                break;
            }
        }
        if (found) {
            System.out.println("Valor alterado!");
        } else {
            System.out.println("Valor não alterado");
        }
    }

    private void delete(Scanner kb, int[] array, int index) {
        System.out.println("Informe o valor que será deletado: ");
        int value = kb.nextInt();
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                found = true;
                for (int j = i; j < index - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        if (found) {
            System.out.println("Valor encontrado e deletado!");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    private void show(int[] array, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println(" ");
    }

    private void order(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Array ordenado!");
    }
	private void invert(int[] array, int index) {
		int size = index;
		for (int i = 0; i < size / 2; i++) {
			int temp = array[i];
			array[i] = array[size - 1 - i];
			array[size - 1 - i] = temp;
		}
		System.out.println("Valores invertidos!");
	}

}
