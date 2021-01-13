package ascensores;

public class EstadoAbriendoPuerta implements Estado{
	
	String nameEstado ="Abriendo puerta";
	
	public String getNameEstado() {
		return nameEstado;
		
	}

	@Override
	public void requestAscensor(Ascensor a, Piso p){
	
			a.setEstado(new EstadoCerrandoPuerta());
			a.setEstado(new EstadoMovimiento());
			a.setPisoAscensor(a.recorrerPisos(p));		
			a.setEstado(new EstadoAbriendoPuerta());
			a.setEstado(new EstadoCerrandoPuerta());
			a.setEstado(new EstadoParado());
		
				
	}

	@Override
	public void abrirPuerta(Ascensor a) {
		//Mismo estado
	}

	@Override
	public void cerrarPuerta(Ascensor a) {
		
		a.setEstado(new EstadoCerrandoPuerta());
		
	}

	@Override
	public void activarAlarma(Ascensor a) {

		System.out.println("*SONIDO ALARMA*");
		
	}

}
