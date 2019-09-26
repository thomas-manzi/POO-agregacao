package Academico;

import java.util.Date;

public class Frequencia {
	private int faltas;
	private int aulas;
	private Date data;
	protected Professor professor;
	protected Matricula matricula;
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public int getAulas() {
		return aulas;
	}
	public void setAulas(int aulas) {
		this.aulas = aulas;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [faltas=");
		builder.append(faltas);
		builder.append(", aulas=");
		builder.append(aulas);
		builder.append(", data=");
		builder.append(data);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
