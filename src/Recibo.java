
public class Recibo {
	
	private String numero;
	private Double valor;
	
	public Recibo(String numero, Double valor) {
		this.numero = numero;
		this.valor = valor;
	}

	public String getNumero() {
		return numero;
	}

	public Double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Recibo [numero=" + numero + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recibo other = (Recibo) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	
}
