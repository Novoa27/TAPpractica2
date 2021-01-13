package ascensores;

public interface Estado {
	
	void requestAscensor(Ascensor a, Piso p);
	void abrirPuerta(Ascensor a);
	void cerrarPuerta(Ascensor a);
	void activarAlarma (Ascensor a);
	String getNameEstado();
	
}
