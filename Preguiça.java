package Turma20;

public class Preguiça extends Animal{
	
	private String subirArvores;
	
	public Preguiça()
	{
		
	}
	
	public Preguiça(String nome,String idade,String som,String correr)
	{
		super(nome,idade,som,correr);
	}
	
	public Preguiça(String nome,String idade,String som,String correr,String subirArvore)
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
