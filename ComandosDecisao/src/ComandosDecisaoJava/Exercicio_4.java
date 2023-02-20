/*
 4 - Crie um algoritmo que solicite ao usuário o nome e a senha, na sequência, verifique se o nome é Roger e se a senha
 é 123, se for, exiba a mensagem "Logado com sucesso!" 
*/

package ComandosDecisaoJava;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main(String[] args) {
		
		Scanner objetoLogin = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = objetoLogin.nextLine();
		
		System.out.println("Digite sua senha: ");
		String senha = objetoLogin.nextLine();
		
		if(nome.equals("Roger") && senha.equals("123")) {
			System.out.printf("Usuário %s logado com sucesso!", nome);
		}else {
			System.out.println("Usuário ou senha inválido!");
		}
	}

}
