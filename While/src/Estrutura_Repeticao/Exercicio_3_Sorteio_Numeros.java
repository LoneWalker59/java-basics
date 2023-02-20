/*
 3 - Crie um algoritmo usando While que sorteie um número de 0 a 100 e que permita que o usuário tente acertar o número
 que foi sorteado. Se o usuário não acertar, deve imprimir uma mensagem informando se o número sorteado é maior ou menor que a tentativa feita. 
 Quando o usuário acertar, imprima o total de tentativas feitas. 
*/

package Estrutura_Repeticao;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio_3_Sorteio_Numeros {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int numeroSorteado = random.nextInt(101);
		int tentativas = 0;
		int numeroTentativa = 0;
		
		while (numeroTentativa != numeroSorteado) {
			String strNumeroTentativa = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100:", "Advinhar Número", JOptionPane.QUESTION_MESSAGE);
			numeroTentativa = Integer.parseInt(strNumeroTentativa);
			
			if (numeroTentativa < 0) {
				break;
			}
			
			tentativas++;
			
			if (numeroTentativa > numeroSorteado) {
				JOptionPane.showMessageDialog(null, "O número sorteado é menor!", "Advinhar Número", JOptionPane.INFORMATION_MESSAGE);
			} else if (numeroTentativa < numeroSorteado) {
				JOptionPane.showMessageDialog(null, "O número sorteado é maior!", "Advinhar Número", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (numeroTentativa == numeroSorteado) {
			System.out.println("Parabéns! Você acertou o número sorteado em " + tentativas + " tentativas.");
		}
	}

}
