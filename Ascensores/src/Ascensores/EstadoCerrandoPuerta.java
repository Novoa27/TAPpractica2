package Ascensores;

public class EstadoCerrandoPuerta implements Estado {

	@Override
	public void llamarDesdePlanta(Ascensor a, int pisoPlanta) throws InterruptedException {
		// TODO Auto-generated method stub
		a.setPisoAscensor(a.recorrerPisos(pisoPlanta));
		a.setEstado(new EstadoMovimiento());
		
		
		
	}

	@Override
	public void moverDesdeAscensor(Ascensor a, int pisoPlanta) throws InterruptedException {
		// TODO Auto-generated method stub
		a.setPisoAscensor(a.recorrerPisos(pisoPlanta));
		a.setEstado(new EstadoMovimiento());
			
		
	}

	@Override
	public void abrirPuerta(Ascensor a) {
		// TODO Auto-generated method stub
		a.setEstado(new EstadoAbriendoPuerta());
		
	}

	@Override
	public void cerrarPuerta(Ascensor a) {
		// TODO Auto-generated method stub
		
	}

}
