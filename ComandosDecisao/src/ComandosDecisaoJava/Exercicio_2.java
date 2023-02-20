/*
 2 - Crie um algoritmo que leia dois números e apresente a diferença entre eles. 
*/

package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exercicio_2 {
	
	public static void main(String[] args) {
		
		int num1, num2, diferenca;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		
		if(num1 >= num2) {
			diferenca = num1 - num2;
		}else {
			diferenca = num2 - num1;
		}
		
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		System.out.println("Diferença: " + diferenca);
	}

}
