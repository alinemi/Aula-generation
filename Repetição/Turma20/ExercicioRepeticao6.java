package Turma20;

import java.util.Scanner;

public class ExercicioRepeticao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, soma = 0,media,cont=0;
		
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("\nEntre com um número: ");
			num = ler.nextInt();
			
			if(num %3 == 0 &&  num != 0)
			{
				soma = soma + num;
				cont++;
			}
		}
		while (num != 0);
		media = soma / cont;
		System.out.println("\nA média dos números multiplos de 3 é: "+media);
	}

}