package Aula_4;
import java.util.Scanner;
public class condicionalif {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
System.out.println("DIGITE A NOTA DO ALUNO:");
		double media,bim1,bim2,bim3,bim4;
				input.nextDouble();
		
		
		
		if(media>= 6.5) {
			System.out.println("Aluno aprovado");
			
		}else if (media <=4){
			System.out.println("Aluno Reprovado");
			
		} else {
			System.out.println("Auno em Recuperação");
		}

		input.close();
		
	}

}
