package Turma20;

public class Preguiça1 extends Animal1{
	
	private String açao;
	
	public Preguiça1()
	{
		
	}

	public String getAçao() {
		return açao;
	}

	public void setAçao(String açao) {
		this.açao = açao;
	}

	public String getNome()
	{
		return "Nome da Preguiça: "+super.getNome()+" - Ação: "+this.getAçao();
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
