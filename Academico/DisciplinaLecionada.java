package Academico;

public class DisciplinaLecionada {
	private int ano;
	private int semestre;
	protected Disciplina disciplina;
	protected Professor professor;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
		
		
	}
	
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DisciplinaLecionada [ano=");
		builder.append(ano);
		builder.append(", semestre=");
		builder.append(semestre);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append(", professor=");
		builder.append(professor);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}	
