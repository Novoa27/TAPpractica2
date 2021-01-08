package Ascensores;

public class displayAscensor implements Observer {

	public void imprimirPiso(int piso) {
		// TODO Auto-generated method stub
		
		System.out.println("Display Ascensor: Piso  " + piso);
		
	}
	

	@Override
	public void update(int piso) {
		this.imprimirPiso(piso);
	}


	@Override
	public void updateEstado(String s) {
		// TODO Auto-generated method stub
		
	}



}
