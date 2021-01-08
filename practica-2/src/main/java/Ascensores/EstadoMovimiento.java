package Ascensores;

public class EstadoMovimiento implements Estado {

		
	String nameEstado ="Movimiento";
	
	@Override
	public void requestAscensor(Ascensor a, Piso p) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void abrirPuerta(Ascensor a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrarPuerta(Ascensor a) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void activarAlarma(Ascensor a) {
		// TODO Auto-generated method stub
		System.out.println("*SONIDO ALARMA*");
		
	}
	@Override
	public String getNameEstado() {
		// TODO Auto-generated method stub
		return nameEstado;
	}


}
