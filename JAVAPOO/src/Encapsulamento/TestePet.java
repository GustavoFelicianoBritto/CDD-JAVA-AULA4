package Encapsulamento;

public class TestePet {

	public static void main(String[] args)
	{	
		Pet p1 = new Pet();
		
		p1.setIdade(2);
		p1.setNome("Krypto");
		p1.setRaca("Pastor Suiço");
		p1.setTipo("Cão");
		
		System.out.printf("%s da raça %s chamado %s com %d anos",p1.getTipo(),p1.getRaca(),p1.getNome(),p1.getIdade());
		
		
	}
	
	
}
