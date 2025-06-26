package Metodos;
public class Metodos
{
	public int idade()
	{
		return 25;
	}
	public double nota()
	{
		return 8.5;
	}
	public String nome()
	{
		return "Gustavo";
	}
	public boolean estado()
	{
		return true;
		
	}
	public void imprimir()
	{
		System.out.println("Print");
	}


	public static void main(String[] args) {
		
		CalcularMetodos md = new CalcularMetodos();
		
		int i = md.somar(2, 1);
		int j = md.somar(2, 3, 5);
		
		System.out.println(j);
		System.out.println(i);
		
	}
	
}
