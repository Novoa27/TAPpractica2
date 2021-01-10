package ascensores;

public class Piso {
	
	int numPiso;
	
	public Piso(int numero) {
		this.numPiso = numero;
	}

	public void activarAltavoz() {
		System.out.println("Altavoz del piso "+ this.numPiso+ ": *Ascensor disponible*");
	}
	
	public int getnumPiso() {
		return numPiso;
	}
	
}
