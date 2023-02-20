/*
 4 - Crie um algoritmo que solicite um número inteiro positivo ao usuário e na sequência, calcule e exiba o número
 do fatorial. 
 
 Obs: O fatorial é por exemplo, se digitar 5:
 1 * 2 * 3 * 4 * 5 = 120 
*/

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_4 {
	
	public static void main(String[] args) {
		
		int num, fatorial;
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número positivo para o cálculo fatorial", "Exercício 4", JOptionPane.QUESTION_MESSAGE));
		
		fatorial = 1;
		for(int valor = num; valor >= 1; valor--) {
			fatorial = fatorial * valor;
		}
		System.out.println("O fatorial de " + num + " é " + fatorial);
	}

}
