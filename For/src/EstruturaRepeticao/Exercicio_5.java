/*
 5 - Crie um algoritmo que solicite ao usuário que digite 3 nomes e no final imprima o total de nomes que começam com uma vogal e o total de nomes
 que começam com uma consoante.  
*/

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_5 {
	
	public static void main(String[] args) {
		
		String nome;
		int nomesComVogal = 0;
		int nomesComConsoante = 0;
		
		for(int i = 1; i <= 3; i++) {
			nome = JOptionPane.showInputDialog(null, "Digite o nome: " + i, "Exercício 5", JOptionPane.QUESTION_MESSAGE);
			
			//trim - remove os espaços em branco no início do nome
			//toLowerCase - deixa as letras em minúsculas
			//charAt(0) - primeira letra da variável nome
			if(nome.trim().toLowerCase().charAt(0) == 'a' ||
				nome.trim().toLowerCase().charAt(0) == 'e' ||
				nome.trim().toLowerCase().charAt(0) == 'i' ||
				nome.trim().toLowerCase().charAt(0) == 'o' ||
				nome.trim().toLowerCase().charAt(0) == 'u') {
				
				nomesComVogal++;
			}
		}
		nomesComConsoante = 3 - nomesComVogal;
		
		System.out.println("Total com vogal: " + nomesComVogal);
		System.out.println("Total com consoante: " + nomesComConsoante);
	}

}
