package ascensores;

public class EstadoCerrandoPuerta implements Estado {

	String nameEstado ="Cerrando puerta";
	
	@Override
	public void requestAscensor(Ascensor a, Piso p){

		//Si el piso de la peticion es el mismo que el del ascensor, se abre la puerta. Si no, se procede a llegar hasta el piso.
		int pisoAscensor = a.getPisoAscensor();
		
		if (p.getnumPiso() == pisoAscensor) {
			
			a.setEstado(new EstadoAbriendoPuerta());
			
		}
		else {
			a.setEstado(new EstadoMovimiento());
			a.setPisoAscensor(a.recorrerPisos(p));
			a.setEstado(new EstadoAbriendoPuerta());
			a.setEstado(new EstadoCerrandoPuerta());
			a.setEstado(new EstadoParado());
				
		}			
		
	}


	@Override
	public void abrirPuerta(Ascensor a) {
		
		a.setEstado(new EstadoAbriendoPuerta());
		
	}

	@Override
	public void cerrarPuerta(Ascensor a) {
		// Mismo estado
		
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
