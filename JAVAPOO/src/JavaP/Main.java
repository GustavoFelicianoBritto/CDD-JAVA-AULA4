package JavaP;


public class Main
{
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.nome="Gustavo";
		p1.comer("Coxinha");
		p1.idade=26;
		p1.altura=1.74;
		p1.genero="masculino";
		p1.ShowAtributes();
		
		
		
		System.out.println(p1.nome);
	}

	
	
	
	
	
	
}
