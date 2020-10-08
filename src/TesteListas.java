import java.util.ArrayList;
import java.util.Collections;

public class TesteListas {

	public static void main(String[] args) {
		
		String curso1 = "Java";
		String curso2 = "Apache Camel";
		String curso3 = "Spring";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		//cursos.remove(1);
		
		Collections.sort(cursos);
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println(cursos.get(i));
		}
	}
}