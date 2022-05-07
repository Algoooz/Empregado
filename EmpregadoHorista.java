package prova01;

public class EmpregadoHorista extends Empregado{
	
	private double vlrHora;
	private double qtdHoras;
	
	public EmpregadoHorista(String n, String s, String d, double vh, double qh) {
		super(n, s, d);
		this.vlrHora = vh;
		this.qtdHoras = qh;
	}
	
	@Override
	public double salario() {
		
		double slr;
		
		slr = this.vlrHora * this.qtdHoras;
		
		if (this.qtdHoras > 40) {
			
			slr = slr * 1.5;
		}
		
		return slr;
		
	}
	public double getVlrHora() {
		return vlrHora;
	}

	public void setVlrHora(double vlrHora) {
		this.vlrHora = vlrHora;
	}

	public double getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(double qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	@Override
	public String toString() {
		return "EmpregadoHorista [vlrHora=" + vlrHora + ", qtdHoras=" + qtdHoras + ", getNome()=" + getNome()
				+ ", getSobrenome()=" + getSobrenome() + ", getDocumento()=" + getDocumento() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	
}
