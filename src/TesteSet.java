import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Tobias");
		alunos.add("Ubiratan");
		alunos.add("Raimunda");
		alunos.add("Clotilde");
		Boolean adicionou = alunos.add("Raimunda");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos.size());
		System.out.println("O Set adicionou a Raimunda pela segunda vez? " + adicionou);
		
		Set<String> nomes = Collections.emptySet();
		//nomes.add("Ursula");
		System.out.println(nomes);

		Set<String> alunosSincronizados = Collections.synchronizedSet(alunos);
		System.out.println(alunosSincronizados);
	}
}
