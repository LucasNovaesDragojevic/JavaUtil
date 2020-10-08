import java.util.ArrayList;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Pilares da POO", 15);
		Aula aula2 = new Aula("Interfaces com Java", 5);
		Aula aula3 = new Aula("Herança e polimorfismo", 7);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//Collections.sort(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}

}
