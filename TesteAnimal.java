package Turma20;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro ani1 = new Cachorro();
		Cavalo ani2= new Cavalo();
		Pregui�a ani3 = new Pregui�a();
		
		ani1.setNome("Tyron");
		ani1.setIdade("2");
		ani1.setSom("auau");
		ani1.setCorrer("caminhando");
		
		ani2.setNome("M�ximus");
		ani2.setIdade("3");
		ani2.setSom("hinn in in");
		ani2.setCorrer("r�pido");
		ani2.setAlimento("Capim");
		
		ani3.setNome("Soneca");
		ani3.setIdade("1");
		ani3.setSom("ZzZ");
		ani3.setCorrer("Lento");
		ani3.setSubirArvores("Dormir ou comer");
		
		System.out.println("\n Nome do cachorro = "+ani1.getNome());
		System.out.println("\n Nome do cavalo = "+ani2.getNome());
		System.out.println("\n Nome da pregui�a = "+ani3.getNome());
	}

}
