package Turma20;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PooCliente cliente1 = new PooCliente("Aline Midori", "Biritiba Mirim", "Feminino", "24");
		
			cliente1.imprimirInfo();
			
			System.out.println("\nNovo Cliente ");
			cliente1.setnomeCliente("Roberto Locatelli");
			
			PooCliente cliente2 = new PooCliente("Roberto Locatelli", "Morumbi", "Masculino", "18");
			
			cliente2.imprimirInfo();
			
			cliente2.setcidade("Morumbi");
			
	}

}
