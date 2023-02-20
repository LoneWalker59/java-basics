/*
 1 - Crie um algoritmo que leia um número e verifique se ele é PAR ou IMPAR. 
*/

package ComandosDecisaoJava;

import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro");
		numero = objetoNumero.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("Número " + numero + ", PAR");
		}else {
			System.out.println("Número " + numero + ", IMPAR");
		}
	}

}
