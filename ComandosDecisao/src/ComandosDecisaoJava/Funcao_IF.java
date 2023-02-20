package ComandosDecisaoJava;

public class Funcao_IF {
	
	public static void main(String[] args) {
		
		int numero = 5;
		String nome = "Ana";
		
		/*
	 	 == - Igual
	 	 != - Diferente
	 	 > - Maior
	 	 < - Menor
	 	 >= - Maior ou igual
	 	 <= - Menor ou igual
		*/
		
		if(numero >= 10) {
			System.out.println("O número é maior que 10");
		}else {
			System.out.println("O número é menor que 10");
		}
		
		if(nome.equals("Ana")) {
			System.out.println("O nome é: " + nome);
		}else {
			System.out.println("Nome inválido");
		}
	}
}
