
public class Aluno {

	private String nome;
	private Integer numeroMatricula;

	public Aluno(String nome, Integer numeroMatricula) {
		if (nome == null)
			throw new NullPointerException("O nome do aluno não pode estar vazio");
		
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
