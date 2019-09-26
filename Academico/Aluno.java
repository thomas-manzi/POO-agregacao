package Academico;

public class Aluno extends Pessoa{
	protected Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [curso=");
		builder.append(curso);
		builder.append("]");
		return builder.toString();
	}
	
	

}
