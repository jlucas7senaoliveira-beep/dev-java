package revisao;

import java.util.Scanner;
public class ScannerAplicacao {

	public static void main(String[] args) {
		
		String nome;
		
		Scanner input = new Scanner(System.in);
		// atribuindo o scanner à variável
		
		System.out.println("DIGITE SEU NOME:");
		
		nome = input.nextLine();
		
		System.out.println("O NOME DIGITADO FOI:" + nome );
		
		input.close(); //fecha a aplicação no scanner 

	}

}
