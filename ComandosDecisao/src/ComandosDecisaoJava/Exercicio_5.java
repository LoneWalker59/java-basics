/*
 5 - Crie um algoritmo com Swtich que exiba as seguintes opções e realize a operação de dois números
 conforme a escolha do usuário: 
  	1 - Adição
  	2 - Subtração
  	3 - Multiplicação
  	4 - Divisão
*/

package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exercicio_5 {
	
	public static void main(String[] args) {
		
		int num1, num2, resultado, opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite uma das opções a seguir: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão\n", "Leia com atenção!", JOptionPane.QUESTION_MESSAGE));
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: ", "Exercício Java", JOptionPane.QUESTION_MESSAGE));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: ", "Exercício Java", JOptionPane.QUESTION_MESSAGE));
		
		switch(opcao) {
		
		case 1: {
			resultado = num1 + num2;
			System.out.printf("%d + %d = %d", num1, num2, resultado);
			break;
		}
		
		case 2: {
			resultado = num1 - num2;
			System.out.printf("%d - %d = %d", num1, num2, resultado);
			break;
		}
		
		case 3: {
			resultado = num1 * num2;
			System.out.printf("%d * %d = %d", num1, num2, resultado);
			break;
		}
		
		case 4: {
			resultado = num1 / num2;
			System.out.printf("%d / %d = %d", num1, num2, resultado);
			break;
		}
		
		default: {
			System.out.println("Opção inválida!");
		}
		}
	}

}
