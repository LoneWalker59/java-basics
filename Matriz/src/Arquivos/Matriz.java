package Arquivos;

public class Matriz {
	
	public static void main(String[] args) {
		
		// [][] - Matriz
		// [] - Array
		// Matriz - Linhas e colunas
		// Primeiro índice são as linhas
		// Segundo índice são as colunas
		// Cada matriz é um Array
		// Se tiver 8 linhas é 8 arrays
		int[][] numeros = new int[3][4];
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				numeros[linha][coluna] = 5;
			}
		}
		
		//Imprimindo a matriz
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.print(numeros[linha][coluna] + " ");
			}
			System.out.println("");
		}
		
		//-------------------------------------------------------------------------------------
		
		int linhas = 3;
		int colunas = 4;
		
		String[][] matrizLetras = new String[linhas][colunas];
		String[] array_1 = {"A", "B", "C", "D"};
		String[] array_2 = {"E", "F", "G", "H"};
		String[] array_3 = {"I", "J", "K", "L"};
		
		matrizLetras[0] = array_1;
		matrizLetras[1] = array_2;
		matrizLetras[2] = array_3;
		
		System.out.println("");
		
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				System.out.print(matrizLetras[linha][coluna] + " ");
			}
			System.out.println("");
		}
	}
}
