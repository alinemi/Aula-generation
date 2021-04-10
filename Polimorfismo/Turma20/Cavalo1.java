package Turma20;

public class Cavalo1 extends Animal1{

	private String alimento;
	
	public Cavalo1()
	{
		
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String getNome()
	{
		return "Nome do Cavalo: "+super.getNome()+" - Alimento: "+this.getAlimento();
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
