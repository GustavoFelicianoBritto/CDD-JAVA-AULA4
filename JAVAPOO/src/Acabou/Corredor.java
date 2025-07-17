package Acabou;

public class Corredor extends Atleta {

	public Corredor(String name, int age)
	{
		super(name, age);

	}
	
	public void Correr()
	{
		System.out.printf("%s está correndo\n",nome);
	}
	public void PararCorrer()
	{
		System.out.printf("%s parou de correr\n",nome);
	}
	
	
	

	
}
