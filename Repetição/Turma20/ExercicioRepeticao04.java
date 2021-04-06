package Turma20;

import java.util.Scanner;

public class ExercicioRepeticao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,sexo,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,np = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while(np<=5)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = ler.nextInt();
			System.out.println("\n1- femino\n2- masculino\n3- outros\nEntre com o seu sexo: ");
			sexo = ler.nextInt();
			System.out.println("\n1-calmo/ a/e\n2- nervoso/a/e\n3- agressivo");
			fp = ler.nextInt();
			
			if(fp==1)
			{
				contpc++;
			}
			if(sexo==1 && fp==2)
			{
				contmn++;
			}
			if(sexo==2 && fp==3)
			{
				contha++;
			}
			if(fp==2 && idade>40)
			{
				contpn40++;
			}
			if(fp==1 && idade<18)
			{
				contpc18++;
			}
			np++;
		}
		System.out.println("\nPessoas calmas/os/es: "+contpc);
		System.out.println("\nMulheres nervosas/os/es: "+contmn);
		System.out.println("\nHomens agressivos/as/es: "+contha);
		System.out.println("\nOutros calmos/as/es: "+contoc);
		System.out.println("\nPessoas nervosas/os/es: "+contpn40);
		System.out.println("\nPessoas calmas/os/es: "+contpc18);
	}

}
