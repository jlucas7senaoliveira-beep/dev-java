package revisao;
import java.util.Scanner;
public class atividade_1 {

	public static void main(String[] args) {
		
		String nome,profissao,email;
		
        int idade;

		Scanner input = new Scanner(System.in);
		
System.out.println("DIGITE SEU NOME:");
		nome = input.nextLine();
		
		System.out.println("O NOME DIGITADO FOI:" + nome );
		
		System.out.println("DIGITE SUA IDADE:");
		idade= input.nextInt('\n');
		
		
			System.out.println("A IDADE DIGITADA FOI:" + idade );
			
			
			System.out.println("DIGITE SUA PROFISSAO:");
			profissao = input.nextLine();
			
			System.out.println("A PROFISSO DIGITADA FOI:" + profissao );
			
		
		input.close();
	}

}
