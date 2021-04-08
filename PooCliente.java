package Turma20;

public class PooCliente {
	
	private String nomeCliente;
	private String cidade;
	private String sexo;
	private String idade;
	
	public PooCliente(String nomeCliente,String cidade,String sexo,String idade)
	{
		this.nomeCliente = nomeCliente;
		this.cidade = cidade;
		this.sexo = sexo;
		this.idade = idade;
	}
	public void imprimirInfo()
	{
		System.out.println(nomeCliente+" mora em "+cidade+" com o sexo: "+sexo+" sua idade é: "+idade);
	}
	public String getnomeCliente() {
		return nomeCliente;
	}
	public void setnomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getcidade () {
		return cidade;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	public String getsexo() {
		return sexo;
	}
	public void setsexo(String sexo) {
		this.sexo = sexo;
	}
	public String getidade() {
		return idade;
	}
	public void setidade(String idade) {
		this.idade = idade;
	}
}
