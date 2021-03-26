package Turma20;

import java.util.Scanner;

public class TresInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3,maior;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Entre com o primeiro número ");
		n1 = ler.nextInt();
		System.out.println(" Entre com o segundo número ");
		n2 = ler.nextInt();
		System.out.println(" Entre com o terceiro número ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nMaior valor : "+n1);
		}
		else if(n2>n3 && n2>n1)
		{
			System.out.println("\nMaior valor : "+n2);
		}
		else if (n3>n1 && n3>n2)
		{
		System.out.println("\nMaior valor : "+n3);
		}
	}

}