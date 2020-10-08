import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

	public static void main(String[] args) {
		
		Recibo recibo1 = new Recibo("4566", 100.00);
		Recibo recibo2 = new Recibo("4657", 50.00);
		Recibo recibo3 = new Recibo("8996", 250.00);
		
		Set<Recibo> recibos = new TreeSet<>(comparing(Recibo::getNumero));
		recibos.add(recibo1);
		recibos.add(recibo2);
		recibos.add(recibo3);
		
		recibos.forEach(System.out::println);
	}

}
