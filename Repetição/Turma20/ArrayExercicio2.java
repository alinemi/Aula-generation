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
			System.out.println("\nEntre com os n�mero: ");
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
				System.out.println(n[i]+" Ele � um n�mero par");
			}
			else
			{
				System.out.println(n[i]+" Ele � um n�mero �mpar");
			}
		}
		System.out.println("\nSoma dos n�meros pares: "+somapar);
		System.out.println("\nQuantidade de n�meros impares: "+contimpar);


	}

}
