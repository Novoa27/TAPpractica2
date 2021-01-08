package Ascensores;

public class EstadoAbriendoPuerta implements Estado{

	@Override
	public void requestAscensor(Ascensor a, Piso p){
		// TODO Auto-generated method stub
		a.setEstado(new EstadoCerrandoPuerta());
		a.setEstado(new EstadoMovimiento());
		a.setPisoAscensor(a.recorrerPisos(p));
		
		a.setEstado(new EstadoAbriendoPuerta());	
				
	}

	@Override
	public void abrirPuerta(Ascensor a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrarPuerta(Ascensor a) {
		// TODO Auto-generated method stub
		a.setEstado(new EstadoCerrandoPuerta());
		
	}

	@Override
	public void activarAlarma(Ascensor a) {
		// TODO Auto-generated method stub
		System.out.println("*SONIDO ALARMA*");
		
	}

}
