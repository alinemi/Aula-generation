package Turma20;

public class Cachorro extends Animal {
	private String raça;
	
	public Cachorro()
	{
		
	}
	
	public Cachorro(String nome,String idade, String som,String correr)
	{
		super(nome,idade,som,correr);
	}
	
	public Cachorro(String nome,String idade,String som,String correr,String raça)
	{
		super(nome,idade,som,correr);
		this.raça = raça;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

}
