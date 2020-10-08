import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public void adiciona(Aula aula) {
		aulas.add(aula);
	}

	public Integer getTempoTotal() {
		return aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public void matricula(Aluno aluno) {
		alunos.add(aluno);
		matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Boolean estaMatriculado(Aluno aluno) {
		return alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(Integer numeroMatricula) {
		return matriculaParaAluno.get(numeroMatricula);
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas + "]";
	}
}
