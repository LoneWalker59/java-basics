package ArrayJava;

public class Array {
	
	public static void main(String[] args) {
		
		int n1, n2, n3, n4, n5;
		
		n1 = 10;
		n2 = 18;
		n3 = 31;
		n4 = 45;
		n5 = 52;
		
		System.out.println("Exemplo com variáveis");
		System.out.println("Número 1: " + n1);
		System.out.println("Número 2: " + n2);
		System.out.println("Número 3: " + n3);
		System.out.println("Número 4: " + n4);
		System.out.println("Número 5: " + n5);
		
		/*
		Array é semelhante a criação de várias variáveis, ele faz a mesma função.
		
		[] - Significa que estou criando um Array
		new - Significa que vou instanciar a classe int
		*/
		
		int[] numeros = new int[5];
		
		numeros[0] = 19;
		numeros[1] = 25;
		numeros[2] = 39;
		numeros[3] = 43;
		numeros[4] = 90;
		
		System.out.println("\nImprimindo o Array\n");
		System.out.println("Posição 0: " + numeros[0]);
		System.out.println("Posição 1: " + numeros[1]);
		System.out.println("Posição 2: " + numeros[2]);
		System.out.println("Posição 3: " + numeros[3]);
		System.out.println("Posição 4: " + numeros[4]);
		
		String[] letras = {"A", "B", "C", "D", "E"};
		
		System.out.println("\nImprimindo o Array de Letras\n");
		System.out.println("Posição 0: " + letras[0]);
		System.out.println("Posição 1: " + letras[1]);
		System.out.println("Posição 2: " + letras[2]);
		System.out.println("Posição 3: " + letras[3]);
		System.out.println("Posição 4: " + letras[4]);
		
		String[] animais = {"Ave", "Macaco", "Girafa", "Cachorro"};
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Animal posição: " + i + " : " + animais[i]);
		}
		
	}

}
