package Ascensores;

public class Piso {
	
	int numPiso;
	boolean altavoz;
	
	
	
	public Piso(int numero) {
		this.numPiso = numero;
		
	}

	public void activarAltavoz() {
		altavoz = true;
		System.out.println("Altavoz del piso "+ this.numPiso+ ": *Ascensor disponible*");
		altavoz = false;
	}
	
	public int getnumPiso() {
		return numPiso;
	}
	
	
	//Pantallas observer. Cuando cambie piso Ascensor que cambie.
	
	
}
