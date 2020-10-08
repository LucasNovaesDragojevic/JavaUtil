import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteCursoOrdenacao {

	public static void main(String[] args) {
		
		Curso cursoJava = new Curso("Java Web", "Paulo Silveira");
		
		cursoJava.adiciona(new Aula("Servlet", 10));
		cursoJava.adiciona(new Aula("JSP", 25));
		cursoJava.adiciona(new Aula("JSF", 15));
		
		List<Aula> aulas = new ArrayList<>(cursoJava.getAulas());
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		Integer tempoTotalDeAulas = cursoJava.getTempoTotal();
		
		System.out.println(aulas);
		System.out.println(tempoTotalDeAulas);
		System.out.println(cursoJava);
	}
}
