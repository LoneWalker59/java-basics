/*
 2 - Crie um algoritmo usando DoWhile que solicite ao usuário a entrada de N números inteiros e mostre na tela se este número é positivo 
 ou negativo e só encerre o programa quando o usuário digitar o número 0. 
*/

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_2_Numero_Positivo_Negativo {
	
	public static void main(String[] args) {
		
		int num;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
			
			if (num > 0) {
				System.out.println("Você digitou o número: " + num + " que é um número POSITIVO!");
			}else if (num < 0){
				System.out.println("Você digitou o número: " + num + " que é um número NEGATIVO!");
			}
			
			
		}while(num != 0);
		
		System.out.println("Programa encerrado!");
	}

}
