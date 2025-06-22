package javaAula4;

public class ExercicioTexto5 {

	public static void main(String[] args) {
		
		/*
		 * 6. dado o Array a seguir, {"a", "vida", "é","bela"}
		faça um programa que crie um string com o texto retirado do Array e imprima. no seguinte formato.
		A VIDA É BELA
		 */
		
		String texto[]={"a", "vida", "é","bela"};
		StringBuilder frase= new StringBuilder();
		
		for(String word:texto)
		{
			frase.append(word).append(" ");
		}
		
		String FraseFinal = frase.toString().trim();
		
		System.out.println(FraseFinal);
		

	}

}
