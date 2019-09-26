package Academico;

public class Avaliacao {
	private float nota;
	private float peso;
	protected Professor professor;
	protected Disciplina disciplina;
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Avaliacao [nota=");
		builder.append(nota);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
