import java.util.Scanner;

public class Uni5Exe9 {

	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		System.out.println("Insira a quantidade de alunos: ");
		int n = kb.nextInt();
		String nomes = "";
		int total = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Insira o nome do aluno: ");	
			String nome = kb.next();
			System.out.println("Insira a idade do aluno: ");
			int idade = kb.nextInt();

			if(idade == 18){
				nomes = nomes + '\n' + nome;
			}else if(idade >= 20 ){
				total++;
			}
		}
		System.out.println("São alunos com 18 anos: " + nomes);
		System.out.println(total + " alunos tem 20 ou mais anos");
		kb.close();
    		}
}
