package AULA_3;
import java.text.DecimalFormat;

public class oficina {
	
public static void main(String[] args) {
	double
	v1,
	v2,
	soma,subtracao,multiplicacao,divisao,resto;
	
	v1=10000; v2=20;
	soma=v1+v2;
	System.out.println("Soma de:"+v1+" + "+v2+" = "+soma);
	DecimalFormat formatar = new DecimalFormat("#,##0.00");
	
	v1=800;v2=400;
	subtracao=v1-v2;
	System.out.println("Subtração de:"+v1+" - "+v2+" = "+subtracao);
	
	
	v1=300;v2=5;
	multiplicacao=v1*v2;
	System.out.println("Multiplicação de:"+v1+" * "+v2+" = "+multiplicacao);
	
	
	v1=700.50;v2=3;
	divisao= v1/v2;
	System.out.println("Divisão de:"+v1+" / "+v2+" = "+divisao);
	
	
	v1=10;v2=3;
	resto=v1%v2;
	System.out.println("Divisão de:"+v1+" % "+v2+" = "+resto);
	
	System.out.println("MUDANÇA DE SAIDA");
	System.out.printf("TOTAL SOMA: R$ %.2f%n", soma);
	System.out.printf("TOTAL SUBTRAÇÃO: R$ %.2f%n", subtracao);
	System.out.printf("TOTAL MULTIPLICAÇÃO: R$ %.2f%n", multiplicacao);
	System.out.printf("TOTAL DIVISÃO: R$ %.2f%n", divisao);
	System.out.println("SOMA R$: " + formatar.format(soma));
}
}
