package Turma20;

public class Avi�o {
	
	private String tipoAviao;
	private String companhiaAerea;
	private int capacidade;
	
	public Avi�o(String tipoAviao,String companhiaAerea, int capacidade)
	{
		this.tipoAviao = tipoAviao;
		this.companhiaAerea = companhiaAerea;
		this.capacidade = capacidade;
	}
	
	public void imprimirInfo()
	{
		System.out.println(tipoAviao+" sua companhia � a "+companhiaAerea+" com a capacidade de "+capacidade+" pessoas.");
	}
	
	public String gettipoAviao() {
		return tipoAviao;
	}
	public void settipoAviao(String tipoAviao) {
		this.tipoAviao = tipoAviao;
	}
	public String getcompanhiaAerea () {
		return companhiaAerea;
	}
	
	public void setcompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}
	public int getcapacidade () {
		return capacidade;
	}
	public void setcapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
