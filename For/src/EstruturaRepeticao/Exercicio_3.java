/*
 3 - Crie um algoritmo que solicite um número inteiro positivo ao usuário e no final imprima os números ímpares do 1 até o número
 que o usuário digitou.  
*/

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número positivo maior que 1", "Leia com atenção!", JOptionPane.QUESTION_MESSAGE));
		
		for(int contador = 1; contador <= num; contador++) {
			
			// % - retorna o resto
			if(contador %2 == 1) {
				System.out.println(contador);
			}
		}
	}

}
