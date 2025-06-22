package javaAula4;
import java.util.Scanner;

public class ExercicioTexto2 {
	
	public static void main(String[] args) {
		
		/*
		 * 3. Faça um programa que, a partir de um texto digitado pelo usuário, conte o número de
		palavras (palavra é definida por qualquer sequência de caracteres delimitada por espaços em branco) e exiba o resultado.
		 */
		String texto;
		int qtd;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o texto que deseja contar os caracteres: ");
		texto = input.next();
		
		qtd = texto.length();
		
		System.out.printf("O texto inserido tem %d caracteres",qtd);
		
		
		input.close();
		
		
		
		
	}

}
