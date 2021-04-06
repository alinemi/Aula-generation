package Turma20;

import java.util.Scanner;

public class ExercicioRepeticao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		float par = 0,impar = 0,x = 0;
		
		for (x=1; x<=10; x++)
		{
		if (x %2 == 0)
		{
			par++;
		}
		
		else
		{
			impar++;
		}
		}
		System.out.println("\n Os número impares são: "+impar);
		System.out.println("\n Os números pares são: "+par);
	}

}
