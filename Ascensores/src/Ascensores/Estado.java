package Ascensores;

public interface Estado {

	void llamarDesdePlanta(Ascensor a, int pisoPlanta) throws InterruptedException;
	void moverDesdeAscensor(Ascensor a, int pisoPlanta) throws InterruptedException;
	void abrirPuerta(Ascensor a);
	void cerrarPuerta(Ascensor a);
	
}
