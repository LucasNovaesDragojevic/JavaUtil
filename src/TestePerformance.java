import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {

	public static void main(String[] args) {
		
		// Trocar o ArrayList por qualquer outra para comparar a performance.
		Collection<Integer> numeros = new HashSet<>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long duracao = fim - inicio;
		
		System.out.println("Tempo gasto: " + duracao);
	}

}
