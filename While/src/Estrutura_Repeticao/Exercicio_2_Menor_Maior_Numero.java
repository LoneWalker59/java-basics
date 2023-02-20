/*
 2 - Crie um algoritmo usando While que solicite ao usuário a entrada de N números inteiros e positivos, no final exiba o menor e o maior número digitado.
 
  obs: para encerrar o programa, o usuário deve digitar um número menor que 0.
*/

package Estrutura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_2_Menor_Maior_Numero {
	
	public static void main(String[] args) {
		
		int num, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		
		while (true) {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro positivo", "LEIA COM ATENÇÃO!", JOptionPane.QUESTION_MESSAGE));
			
			if (num < 0) {
				break;
			}
			
			if (num > maior) {
				maior = num;
			}
			
			if (num < menor) {
				menor = num;
			}
			System.out.println(num);
		}
		
		System.out.println("O menor número digitado é: " + menor + "\n" + "O maior número digitado é: " + maior);
	}
}