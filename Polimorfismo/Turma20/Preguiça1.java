package Turma20;

public class Pregui�a1 extends Animal1{
	
	private String a�ao;
	
	public Pregui�a1()
	{
		
	}

	public String getA�ao() {
		return a�ao;
	}

	public void setA�ao(String a�ao) {
		this.a�ao = a�ao;
	}

	public String getNome()
	{
		return "Nome da Pregui�a: "+super.getNome()+" - A��o: "+this.getA�ao();
	}
	public String getIdade()
	{
		return "Idade: "+super.getIdade();
	}
	public String getSom()
	{
		return "Som: "+super.getSom();
	}
	public String getCorrer()
	{
		return "Correr: "+super.getCorrer();
	}
}
