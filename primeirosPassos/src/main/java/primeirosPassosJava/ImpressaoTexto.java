package primeirosPassosJava;

public class ImpressaoTexto {
	
	public static void main(String[] args) {
		
		//\n - É um caracter de escape que faz a quebra de linha
		System.out.println("Olá, Mundo!\n");
		
		//ln - posiciona o curso na linha de baixo
		System.out.println("Texto simples");
		System.out.println("Texto simples 2");
		
		/*
		 f - Formatted, formato que permite fazer impressão personalizada
		 %s - String
		 %d - Inteiro
		 %f - Float
		 %b - Boleano TRUE ou FALSE
		*/
		System.out.printf("%s", "Nome: Ana Paula\n");
		System.out.printf("%s - %d", "Nome: Ana Paula", 25);
		
		//%n - No printf indica uma quebra de linha
		System.out.printf("%n%nNome: %s %nIdade: %d", "Ana Paula", 30);
		
		//Variável - Espaço para armazenamento temporário
		int numero1 = 5;
		int numero2 = 10;
		
		System.out.printf("\n\nSoma dos números: %d", (numero1 + numero2));
	}
}
