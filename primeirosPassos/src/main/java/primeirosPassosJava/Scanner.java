package primeirosPassosJava;

import java.util.Scanner;

public class Scanner {
	
	public static void main(String[] args) {
		
		//new Scanner - Instancia um objeto da classe
		//System.in - Lê as informações do teclado
		//Scanner - Objeto da classe Scanner
		java.util.Scanner objetoNome = new java.util.Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		
		//Ler o que o usuário digitar e armazenar na variável nome
		//nextLine - Armazena os dados
		String nome = objetoNome.nextLine();
		
		System.out.println("Nome digitado: " + nome);
		
		System.out.println("Digite sua idade: ");
		
		int idade = objetoNome.nextInt();
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Idade: " + idade);
		
		/*
		 int numeroInteiro = scanner.nextInt();
		 byte numeroByte = scanner.nextByte();
		 long numeroLong = scanner.nextLong();
		 boolean numeroBoolean = scanner.nextBoolean();
		 float numeroFloat = scanner.nextFloat();
		 double numeroDouble = scanner.nextDouble();
		*/
	}
}
