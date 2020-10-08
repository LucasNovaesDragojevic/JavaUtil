
public class TesteCurso {

	public static void main(String[] args) {
		
		Curso cursoJava = new Curso("Java Web", "Paulo Silveira");
		
		cursoJava.adiciona(new Aula("Servlet", 15));
		cursoJava.adiciona(new Aula("JSP", 15));
		cursoJava.adiciona(new Aula("JSF", 15));
		
		System.out.println(cursoJava.getAulas());
	}
	
}
