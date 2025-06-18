package javaAula4;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args)
	{
		double notas[]= new double[5];
		Scanner input = new Scanner(System.in);
		double soma=0;
		
		for(int i=0;i<notas.length;i++)
		{
			System.out.printf("Digite a %dª nota: ",i+1);
			notas[i]=input.nextDouble();
		}
		for(int j=0;j<notas.length;j++)
		{
			soma+=notas[j];
		}
		double media = soma/(notas.length);
		
		System.out.printf("A média da turma é: %.1f",media);
		
	}

}
