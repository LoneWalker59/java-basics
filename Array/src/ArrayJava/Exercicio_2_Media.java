/*
 2 - Crie um algoritmo que some todos os itens de um Array e no final calcule a média desses itens.  
*/

package ArrayJava;

import javax.swing.JOptionPane;

public class Exercicio_2_Media {
	
	public static void main(String[] args) {
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do array:"));
		int[] numeros = new int[tamanho];
		
		// Preenchimento do array
		for (int i = 0; i < tamanho; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
			System.out.println(numeros[i]);
		}
		
		// Cálculo da soma
		int soma = 0;
		for (int i = 0; i < tamanho; i++) {
			soma += numeros[i];
		}
		
		// Cálculo da média
		double media = (double) soma / tamanho;
		
		// Exibição dos resultados
		System.out.println("A soma dos números é: " + soma + "\nA média dos números é: " + media);
	}

}
