package JavaP;

public class Pessoa {
	
	String nome;
	int idade;
	double altura;
	String genero;
	
	public void comer(String comida)
	{
		System.out.printf("%s está comendo %s",nome, comida);
	}

	public void ShowAtributes()
	{
		System.out.printf("\n%s tem %d anos, %.2fm de altura e é do gênero %s",nome,idade,altura,genero);
	}
	
	
	
}
