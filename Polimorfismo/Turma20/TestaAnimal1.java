package Turma20;

public class TestaAnimal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro1 Cachorro = new Cachorro1();
		Cachorro.setNome("Tyron");
		Cachorro.setIdade("2");
		Cachorro.setSom("Auau auau au");
		Cachorro.setCorrer("R�pido");
		Cachorro.setRa�a("Chihuahua");
		
		Cavalo1 Cavalo = new Cavalo1();
		Cavalo.setNome("M�ximus");
		Cavalo.setIdade("3");
		Cavalo.setSom("Hinn in in");
		Cavalo.setCorrer("Caminhando");
		Cavalo.setAlimento("Capim");
		
		Pregui�a1 Pregui�a = new Pregui�a1();
		Pregui�a.setNome("Soneca");
		Pregui�a.setIdade("1");
		Pregui�a.setSom("ZzZ Zz");
		Pregui�a.setCorrer("Lento");
		Pregui�a.setA�ao("Dormir");
		
		Animal1[] animais = new Animal1[3];
		animais[0]=Cachorro;
		animais[1]=Cavalo;
		animais[2]=Pregui�a;
		
		for(Animal1 animal:animais)
		{
			System.out.println(animal.getNome());
		}
		
		
	}

}
