import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TesteIterator {

	public static void main(String[] args) {
		
		Collection<Aluno> alunos = new HashSet<>();
		alunos.add(new Aluno("Cleiton", 4556));
		alunos.add(new Aluno("Jandira", 8966));
		alunos.add(new Aluno("Amatilde", 7447));
		alunos.add(new Aluno("Zuleica", 7856));

		Iterator<Aluno> iterador = alunos.iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}

}
