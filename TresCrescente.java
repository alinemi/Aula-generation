package Turma20;

import java.util.Scanner;

public class TresCrescente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n1,n2,n3;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println(" Entre com o primeiro número ");
	n1 = ler.nextInt();
	System.out.println(" Entre com o segundo número ");
	n2 = ler.nextInt();
	System.out.println(" Entre com o terceiro número ");
	n3 = ler.nextInt();
	
	if (n1<=n2 && n2<=n3)
	{
		System.out.println("\nValor : "+n1+", "+n2+" e "+n3);
	}
	else if(n1<=n3 && n3<=n2)
	{
		System.out.println("\nValor : "+n1+", "+n3+" e "+n2);
	}
	else if(n2<=n1 && n1<=n3)
	{
		System.out.println("\nValor : "+n2+", "+n1+" e "+n3);
	}
	else if(n2<=n3 && n3<=n1)
	{
		System.out.println("\nValor : "+n2+", "+n3+" e "+n1);
	}
	else if(n3<=n1 && n1<=n2)
	{
		System.out.println("\nValor : "+n3+", "+n1+" e "+n2);
	}
	else if(n3<=n2 && n2<=n1)
	{
		System.out.println("\nValor : "+n3+", "+n2+" e "+n1);
	}
	
}

}