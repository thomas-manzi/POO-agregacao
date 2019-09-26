package Academico;

public class mainAcademico {

	public static void main(String[] args) {
		Aluno  a=new Aluno();
		a.setCpf(2321);
		a.setNome("mateus");
		Curso c=new Curso();
		c.setNome("bcc");
		a.setCurso(c);
		Fase f=new Fase();
		f.setSemestre(2);
		f.setCurso(c);
		Disciplina d=new Disciplina();
		d.setNome("matematica");
		d.setFase(f);
		Pessoa p=new Pessoa();
		p.setCpf(2344);
		p.setNome("lucas");
		DisciplinaLecionada dl=new DisciplinaLecionada();
		dl.setAno(2020);
		dl.setDisciplina(d);
		dl.setSemestre(5);
		Professor prof=new Professor();
		prof.setCpf(3432);
		prof.setNome("joao");
		dl.setProfessor(prof);
		Frequencia freq=new Frequencia();
		freq.setAulas(100);
		freq.setFaltas(34);
		freq.setProfessor(prof);
		Matricula mat=new Matricula();
		mat.setAluno(a);
		mat.setDl(dl);
		mat.setNumero(13);
		freq.setMatricula(mat);
		Avaliacao ava=new Avaliacao();
		ava.setDisciplina(d);
		ava.setNota(7);
		ava.setPeso(1);
		ava.setProfessor(prof);
		ava.getDisciplina();
		System.out.println(ava);
	}

}
