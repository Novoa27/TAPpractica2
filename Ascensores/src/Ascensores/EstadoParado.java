package Ascensores;

public class EstadoParado implements Estado {

	@Override
	public void llamarDesdePlanta(Ascensor a, int pisoPlanta) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int pisoAscensor = a.getPisoAscensor();
		
		if (pisoPlanta == pisoAscensor) {
			
			a.setEstado(new EstadoAbriendoPuerta());
		}
		
		a.setPisoAscensor(a.recorrerPisos(pisoPlanta));
		a.setEstado(new EstadoAbriendoPuerta());
					
	}

	@Override
	public void moverDesdeAscensor(Ascensor a, int pisoPlanta) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int pisoAscensor = a.getPisoAscensor();
		
		if (pisoPlanta == pisoAscensor) {
			
			a.setEstado(new EstadoAbriendoPuerta());
		}
		
		a.setPisoAscensor(a.recorrerPisos(pisoPlanta));
		a.setEstado(new EstadoAbriendoPuerta());		
		
		
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
