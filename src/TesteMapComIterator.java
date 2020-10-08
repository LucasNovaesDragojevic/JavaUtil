import java.util.HashMap;
import java.util.Map;

public class TesteMapComIterator {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(50, "Olga");
		pessoas.put(80, "Osvaldo");
		pessoas.put(20, "Bruna");
		
		pessoas.keySet().forEach(System.out::println);
		pessoas.values().forEach(System.out::println);
	}

}
