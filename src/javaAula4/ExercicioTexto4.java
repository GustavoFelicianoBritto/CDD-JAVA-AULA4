package javaAula4;
import java.util.Scanner;

public class ExercicioTexto4 {

	public static void main(String[] args) {
		/*
		 * 5. Faça um programa que receba de umu suário, um texto e exiba esse texto em letras maiúsculas.
		 */
		String texto, converted;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu texto: ");
		texto = input.nextLine();
		converted=texto.toUpperCase();
		
		System.out.println(converted);
		
		
		input.close();
		
	}

}
