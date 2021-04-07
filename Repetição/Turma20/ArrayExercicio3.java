package Turma20;

import java.util.Scanner;

public class ArrayExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] [ ] valor = new int [3][3]; 
		int  cont=0;
		String maior = "Total de valores maiores que 10:"; 
		
		Scanner ler = new Scanner(System.in); 
		for (int l=0; l<3; l++) { 
			for (int c=0; c<3; c++) {
				System.out.println("\nEntre com um valor: ");
				valor [l][c] = ler.nextInt(); 
			if (valor[l][c] >10)	{
				cont++; 
			}
			}
		}
			System.out.println("\n"+maior+" "+cont);

	}

}
