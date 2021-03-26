package Turma20;

import java.util.Scanner;

public class ParouImpar {
	
	public static void main(String[] args) {
		
		double par,impar,num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Entre com um número: ");
		num = ler.nextDouble();
		
		if (num %2 == 1)
		{
		impar =	Math.pow(num, 2);
		System.out.println(" O quandrado do número é "+impar);
		}
		if  (num %2 == 0)
		{
		par = Math.sqrt(num);
		System.out.println("A raiz quadrada do número é "+par);
		}
	}

}
