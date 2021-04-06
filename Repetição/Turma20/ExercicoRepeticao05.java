package Turma20;

import java.util.Scanner;

public class ExercicoRepeticao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0,soma=0,cont=0;
		
		Scanner ler = new Scanner(System.in);
		
		
		do 
		{
		System.out.println("\nEntre com um número: ");
		num = ler.nextInt();
		soma = soma + num;
		}
		while (num != 0);
		
		System.out.println("\nO total da soma é: "+soma);
	}

}
