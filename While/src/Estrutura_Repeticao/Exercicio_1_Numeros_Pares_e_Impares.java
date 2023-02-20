/*
 1 - Crie um algoritmo usando While que solicite ao usuário a entrada de N números inteiros e positivos, no final exiba o total de números pares e o total
 de números ímpares.
 
  Obs: Encerre o programa quando o usuário digitar um número negativo. 
*/

package Estrutura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_1_Numeros_Pares_e_Impares {
	
	public static void main(String[] args) {
		
		int num, qtdPar, qtdImpar;
		
		num = 0;
		qtdPar = 0;
		qtdImpar = 0;
		
		while(num >= 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Leia com atenção!", JOptionPane.QUESTION_MESSAGE));
			
			if(num >= 0) {	
				if(num %2 == 0) {
					qtdPar++;
				}else {
					qtdImpar++;
				}
				System.out.println("Número digitado: " + num);
			}
		}
		System.out.println("Quantidade Par: " + qtdPar);
		System.out.println("Quantidade Ímpar: " + qtdImpar);
	}
}
