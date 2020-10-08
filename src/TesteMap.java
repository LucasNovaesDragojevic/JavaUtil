
public class TesteMap {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Java Web", "Paulo Silveira");

		curso.adiciona(new Aula("Servlet", 10));
		curso.adiciona(new Aula("JSP", 25));
		curso.adiciona(new Aula("JSF", 15));
		
		curso.matricula(new Aluno("Cleiton", 4556));
		curso.matricula(new Aluno("Jacira", 7855));
		curso.matricula(new Aluno("Valdeci", 9964));
		
		System.out.println(curso.buscaMatriculado(7855));

	}

}
