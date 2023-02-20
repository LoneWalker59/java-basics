/*
 3 - Crie um algoritmo usando DoWhile, Switch Case e If que receba o nome de 3 candidatos e em seguida solicite N votos
 a esses candidatos. Só encerre o programa quando digitar 0 e em seguida, imprima o total de votos que cada candidato recebeu e
 apresente quem venceu a eleição.  
*/

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_3_Urna_Eletronica {
	
	public static void main(String[] args) {
		
		String candidato1 = JOptionPane.showInputDialog("Digite o nome do primeiro candidato:");
		String candidato2 = JOptionPane.showInputDialog("Digite o nome do segundo candidato:");
		String candidato3 = JOptionPane.showInputDialog("Digite o nome do terceiro candidato:");
		
		int votosCandidato1 = 0;
		int votosCandidato2 = 0;
		int votosCandidato3 = 0;
		
		int voto;
		do {
			voto = Integer.parseInt(JOptionPane.showInputDialog("Escolha o número do candidato:\n1 - " + candidato1 + "\n2 - " + candidato2 + "\n3 - " + candidato3 + "\n0 - Encerrar votação"));
			
			switch (voto) {
			case 1:
				votosCandidato1++;
				break;
			case 2:
				votosCandidato2++;
				break;
			case 3:
				votosCandidato3++;
				break;
			}
		}while (voto != 0);
		
		System.out.println("Total de votos do candidato 1: " + votosCandidato1);
		System.out.println("Total de votos do candidato 2: " + votosCandidato2);
		System.out.println("Total de votos do candidato 3: " + votosCandidato3);
		
		if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
			System.out.println("O vencedor da eleição é o candidato 1: " + candidato1);
		} else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
			System.out.println("O vencedor da eleição é o candidato 2: " + candidato2);
		} else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
			System.out.println("O vencedor da eleição é o candidato 3: " + candidato3);
		} else {
			System.out.println("Houve empate entre os candidatos!");
		}
	}
}
