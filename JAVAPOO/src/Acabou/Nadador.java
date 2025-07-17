package Acabou;

public class Nadador extends Atleta{
	public Nadador(String name, int age)
	{
		super(name,age);
	}
	
	public void Nadar()
	{
		System.out.printf("%s está nadando\n",nome);
	}
	public void PararNadar()
	{
		System.out.printf("%s parou de nadar\n",nome);
	}

}
