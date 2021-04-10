package Turma20;

public class Cachorro1 extends Animal1{

	private String raça;
	
	public Cachorro1()
	{
		
	}
		
	public String getRaça() {
		return raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
	}
	public String getNome()
	{
		return "Nome do Cachorro: "+super.getNome()+" - Raça: "+this.getRaça();
		
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
