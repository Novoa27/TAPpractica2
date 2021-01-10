package ascensores;

public class EstadoMovimiento implements Estado {

		
	String nameEstado ="Movimiento";
	
	@Override
	public void requestAscensor(Ascensor a, Piso p) {
		//Pasamos directamente a los siguientes estados
		
	}

	@Override
	public void abrirPuerta(Ascensor a) {
		//Pasamos directamente a los siguientes estados
		
	}

	@Override
	public void cerrarPuerta(Ascensor a) {
		//Pasamos directamente a los siguientes estados
		
	}
	
	@Override
	public void activarAlarma(Ascensor a) {
		System.out.println("*SONIDO ALARMA*");
		
	}
	@Override
	public String getNameEstado() {
		
		return nameEstado;
	}


}
