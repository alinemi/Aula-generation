package Turma20;

public class Cachorro1 extends Animal1{

	private String ra�a;
	
	public Cachorro1()
	{
		
	}
		
	public String getRa�a() {
		return ra�a;
	}


	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	public String getNome()
	{
		return "Nome do Cachorro: "+super.getNome()+" - Ra�a: "+this.getRa�a();
		
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
