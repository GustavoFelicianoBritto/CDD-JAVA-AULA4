package javaAula4;

public class ExercicioTexto6 {

	
	public static void main(String[] args) {
	
		
		String texto1[]={"a", "vida", "é","bela"};
		String texto[]= new String[texto1.length];
		
		for(int i=0;i<=texto1.length-1;i++)
		{
			texto[i]=texto1[texto1.length-(1+i)];
		}
		
		StringBuilder frase= new StringBuilder();
		
		for(String word:texto)
		{
			frase.append(word).append(" ");
		}
		
		String FraseFinal = frase.toString().trim();
		
		System.out.println(FraseFinal);
		
	}
		
}
