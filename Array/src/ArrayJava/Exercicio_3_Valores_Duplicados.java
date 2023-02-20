/*
 3 - Crie um algoritmo que percorra os itens de um array de números inteiros e imprima todos os valores duplicados.  
*/

package ArrayJava;

import java.util.HashSet;

public class Exercicio_3_Valores_Duplicados {
	
	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8};
		HashSet<Integer> numerosUnicos = new HashSet<>();
		HashSet<Integer> numerosDuplicados = new HashSet<>();
		
		for (int num : numeros) {
			if (!numerosUnicos.add(num)) {
				numerosDuplicados.add(num);
			}
		}
		
		System.out.println("Valores duplicados:");
		for (int numDuplicado : numerosDuplicados) {
			System.out.println(numDuplicado);
		}
	}

}
