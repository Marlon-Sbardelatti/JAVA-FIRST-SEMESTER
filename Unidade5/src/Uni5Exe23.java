import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe23 {

	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Deseja digitar os dados de mais um vendedor? s(SIM) / n(NÃO):");
		String res = kb.next().toLowerCase();

		while (res.equals("s")) {
		System.out.println("Informe o nome do vendedor: ");	
		String nome = kb.next();

		System.out.println("Informe a quantidade de produtos vendidos por " + nome + " no mês: ");
		int n = kb.nextInt();

		double totalProdutos = 0;
			for (int i = 0; i < n; i++) {
				System.out.println("Informe o preço do produto: ");	
				double precoUnitario = kb.nextDouble();

				System.out.println("Informe quantas unidades foram vendidas: ");
				int qtdProduto = kb.nextInt();

				double total = precoUnitario * qtdProduto;
				totalProdutos += total;
			}
		double salario = 0.3 * totalProdutos;

		System.out.println("O vendedor " + nome + " obteve um total de vendas de " + df.format(totalProdutos)+ " reais, assim recebendo um salário de " + df.format(salario)+ " reais");
		System.out.println("Deseja digitar os dados de mais um vendedor? s(SIM) / n(NÃO):");
		res = kb.next().toLowerCase();
		}

		kb.close();
    		}
}
