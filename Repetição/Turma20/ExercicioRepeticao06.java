package Turma20;

import java.util.Scanner;

public class ExercicioRepeticao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somamult3=0,contmult3=0;
		float mediamult3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n Entre com um número: ");
		num = ler.nextInt();
		
		do
		{
			if(num%3==0)
			{
				somamult3 = somamult3 + num;
				contmult3++;
			}
			System.out.println("\nEntre com um número: ");
			num = ler.nextInt();
			
		}while(num!=0);
		mediamult3 = somamult3 / contmult3;
		
		System.out.println("\nOs números múltiplos de três são: "+mediamult3);
	}

}
