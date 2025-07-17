package Encapsulamento;

public class testeRetangulo {
	
	public static void main(String[] args) {
		
		retangulo r1= new retangulo(2,4);
		
		r1.setAltura(5);
		r1.setBase(5);

		System.out.printf("A área do retangulo %d x %d é: %d",r1.getBase(),r1.getAltura(),r1.getBase()*r1.getAltura());
		
		
		
	}

}
