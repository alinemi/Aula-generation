package Turma20;

public class Cavalo extends Animal {
	
	private String alimento;
	
	public Cavalo()
	{
		
	}
	
	public Cavalo(String nome,String idade,String som,String correr)
	{
		super(nome,idade,som,correr);
	}
	
	public Cavalo(String nome,String idade,String som,String correr,String alimento)
	{
		super(nome,idade,som,correr);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	
}
