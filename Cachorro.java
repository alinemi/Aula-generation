package Turma20;

public class Cachorro extends Animal {
	private String ra�a;
	
	public Cachorro()
	{
		
	}
	
	public Cachorro(String nome,String idade, String som,String correr)
	{
		super(nome,idade,som,correr);
	}
	
	public Cachorro(String nome,String idade,String som,String correr,String ra�a)
	{
		super(nome,idade,som,correr);
		this.ra�a = ra�a;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

}
