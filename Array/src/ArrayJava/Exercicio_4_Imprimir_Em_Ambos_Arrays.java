/*
 4 - Crie um algoritmo que percorra os itens de 2 Array de String/Texto e imprima todos os valores que constam em ambos os Arrays. 
*/

package ArrayJava;

import java.util.Scanner;

public class Exercicio_4_Imprimir_Em_Ambos_Arrays {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o tamanho do primeiro Array:");
		
		int tamanho1 = scan.nextInt();
		String[] array1 = new String[tamanho1];
		System.out.println("Informe os elementos do primeiro Array:");
		
		for (int i = 0; i < tamanho1; i++) {
			array1[i] = scan.next();
		}
		
		System.out.println("Informe o tamanho do segundo Array:");
		int tamanho2 = scan.nextInt();
		String[] array2 = new String[tamanho2];
		
		System.out.println("Informe os elementos do segundo Array:");
		
		for (int i = 0; i < tamanho2; i++) {
			array2[i] = scan.next();
		}
		
		System.out.println("Valores que constam em ambos os Arrays:");
		for (int i = 0; i < tamanho1; i++) {
			for (int j = 0; j < tamanho2; j++) {
				if (array1[i].equals(array2[j])) {
					System.out.println(array1[i]);
				}
			}
		}
	}

}
