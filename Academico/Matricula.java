package Academico;

public class Matricula {
	private int numero;
	protected DisciplinaLecionada dl;
	protected Aluno aluno;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public DisciplinaLecionada getDl() {
		return dl;
	}
	public void setDl(DisciplinaLecionada dl) {
		this.dl = dl;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Matricula [numero=");
		builder.append(numero);
		builder.append(", dl=");
		builder.append(dl);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
