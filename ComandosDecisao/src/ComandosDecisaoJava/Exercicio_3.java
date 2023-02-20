/*
 3 - Crie um algoritmo que leia dois números e imprima-os em ordem decrescente. 
*/

package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		//Recebe os números e armazena as variáveis
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		
		if(num1 >= num2) {
			System.out.println(num1 + "\n" + num2);
		}else {
			System.out.println(num2 + "\n" + num1);
		}
	}

}
