package Turma20;

public class TestaAnimal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro1 Cachorro = new Cachorro1();
		Cachorro.setNome("Tyron");
		Cachorro.setIdade("2");
		Cachorro.setSom("Auau auau au");
		Cachorro.setCorrer("Rápido");
		Cachorro.setRaça("Chihuahua");
		
		Cavalo1 Cavalo = new Cavalo1();
		Cavalo.setNome("Máximus");
		Cavalo.setIdade("3");
		Cavalo.setSom("Hinn in in");
		Cavalo.setCorrer("Caminhando");
		Cavalo.setAlimento("Capim");
		
		Preguiça1 Preguiça = new Preguiça1();
		Preguiça.setNome("Soneca");
		Preguiça.setIdade("1");
		Preguiça.setSom("ZzZ Zz");
		Preguiça.setCorrer("Lento");
		Preguiça.setAçao("Dormir");
		
		Animal1[] animais = new Animal1[3];
		animais[0]=Cachorro;
		animais[1]=Cavalo;
		animais[2]=Preguiça;
		
		for(Animal1 animal:animais)
		{
			System.out.println(animal.getNome());
		}
		
		
	}

}
