package Ascensores;

public class EstadoAbriendoPuerta implements Estado{

	@Override
	public void llamarDesdePlanta(Ascensor a, int pisoPlanta) throws InterruptedException {
		// TODO Auto-generated method stub
		a.setEstado(new EstadoCerrandoPuerta());
		a.setPisoAscensor(a.recorrerPisos(pisoPlanta));
		a.setEstado(new EstadoMovimiento());
				
	}

	@Override
	public void moverDesdeAscensor(Ascensor a, int pisoPlanta) throws InterruptedException {
		// TODO Auto-generated method stub
		a.setEstado(new EstadoCerrandoPuerta());
		a.setPisoAscensor(a.recorrerPisos(pisoPlanta));
		a.setEstado(new EstadoMovimiento());
				
		
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

}
