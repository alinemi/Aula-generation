package Turma20;

import java.util.Scanner;

public class ArrayExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[6];
		int somapar=0,contimpar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.println("\nEntre com os número: ");
			n[i] = ler.nextInt();
			
			if(n[i]%2==0)
			{
				somapar = somapar + n[i];
			}
			else
			{
				contimpar++;
			}
		}
		
		for(int i=0;i<6;i++)
		{
			if(n[i]%2==0)
			{
				System.out.println(n[i]+" Ele é um número par");
			}
			else
			{
				System.out.println(n[i]+" Ele é um número ímpar");
			}
		}
		System.out.println("\nSoma dos números pares: "+somapar);
		System.out.println("\nQuantidade de números impares: "+contimpar);


	}

}
