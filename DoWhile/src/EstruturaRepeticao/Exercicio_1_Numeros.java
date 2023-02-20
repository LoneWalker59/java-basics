/*
 1 - Crie um algoritmo usando DoWhile que solicite ao usuário a entrada de N números e só encerre o programa quando o usuário
 digitar um número entre 1 e 5. 
*/

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_1_Numeros {
	
	public static void main(String[] args) {
		
		int num;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
			System.out.println("Você digitou o número: " + num);
		}while(num < 1 || num > 5);
		
		System.out.println("Programa encerrado!");
	}

}
