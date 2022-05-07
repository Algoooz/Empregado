package prova01;

public abstract class Empregado {
	
	private String nome;
	private String sobrenome;
	private String documento;
	
	public Empregado (String n, String s, String d) {
		this.nome = n;
		this.sobrenome = s;
		this.documento = d;
	}
	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", sobrenome=" + sobrenome + ", documento=" + documento + "]";
	}
	}
	
	
		
