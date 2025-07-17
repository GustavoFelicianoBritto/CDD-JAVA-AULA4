package Acabou;

public class Ciclista extends Atleta{
	public Ciclista(String name,int age)
	{
		super(name,age);
	}
	
	public void Pedalar()
	{
		System.out.printf("%s está correndo\n",nome);
	}
	public void PararPedalar()
	{
		System.out.printf("%s parou de correr\n",nome);
	}

}
