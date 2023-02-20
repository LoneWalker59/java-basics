/*
 1 - Crie um algoritmo que solicite ao usuário a entrada de 3 números inteiros e imprima na tela os valores na ordem em que foram digitados, depois
 imprima também os números na ordem crescente.  
*/

package ArrayJava;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exercicio_1_Ordem_Crescente {
	
	public static void main(String[] args) {
		
		int qtdVezes = 3;
		int[] arrayNum = new int[qtdVezes];
		
		for(int i = 0; i < qtdVezes; i++) {
			arrayNum[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		}
		
		System.out.println("Números na ordem digitada \n");
		
		for(int i:arrayNum) {
			System.out.println(i);
		}
		
		System.out.println("\nNúmeros na ordem Crescente \n");
		
		//sort - Método para organizar os números em ordem crescente
		Arrays.sort(arrayNum);
		
		for(int i:arrayNum) {
			System.out.println(i);
		}
	}

}
