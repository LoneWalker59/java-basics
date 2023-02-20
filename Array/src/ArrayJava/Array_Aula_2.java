package ArrayJava;

import java.util.Arrays;

public class Array_Aula_2 {
	
	public static void main(String[] args) {
		
		//final é uma constante / fixo e pode ser usado em diversas partes
		final int tamanho = 3;
		
		int[] precos = new int[tamanho];
		
		precos[0] = 18;
		precos[1] = 45;
		precos[2] = 90;
		
		System.out.println("Imprimindo Array de Preços");
		
		//lenght - Atributo do Array que vai retornar o tamanho do array
		for(int i = 0; i < precos.length; i++) {
			System.out.println("Preço " + i + " : " + precos[i]);
		}
		
		String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		System.out.println("\n>>>> For Array Letras <<<<");
		
		for(String L:letras) {
			System.out.println(L);
		}
		
		int[] num = {18, 22, 37, 44, 51, 67, 78, 86, 91, 150};
		
		System.out.println("\n>>>> For Array Números <<<<");
		
		for(int L:num) {
			System.out.println(L);
		}
		
		//fill - Preenche os arrays com um valor pré-determinado
		Arrays.fill(num, 5);
		
		System.out.println("\n>>>> For Array Fill <<<<");
		
		for(int L:num) {
			System.out.println(L);
		}
	}

}
