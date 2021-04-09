package Turma20;

public class Pregui�a extends Animal{
	
	private String subirArvores;
	
	public Pregui�a()
	{
		
	}
	
	public Pregui�a(String nome,String idade,String som,String correr)
	{
		super(nome,idade,som,correr);
	}
	
	public Pregui�a(String nome,String idade,String som,String correr,String subirArvore)
	{
		super(nome,idade,som,correr);
		this.subirArvores = subirArvores;
	}

	public String getSubirArvores() {
		return subirArvores;
	}

	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}

	
}
