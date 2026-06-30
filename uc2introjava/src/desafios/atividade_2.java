package desafios; 
import java.util.Scanner;

public class atividade_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome,cargo;
		double salario;
		int tempoEmpresa;
		boolean ativo;
		
		System.out.println("DIGITE O NOME:");
		nome = entrada.nextLine();
		
		System.out.println("DIGITE O CARGO:");
		cargo= entrada.nextLine();
		
		System.out.println("DIGITE SALARIO:");
		salario= entrada.nextDouble();
		
		System.out.println("DIGITE TEMPO DE EMPRESA:");
		tempoEmpresa=entrada.nextInt();
		entrada.nextLine();
		System.out.println();
		entrada.close();
	}
}
