package Ascensores;

public class displayControl implements Observer {

	public void imprimirPiso(int piso) {
		// TODO Auto-generated method stub
		
		System.out.println("Display Control: Piso  " + piso);
		
	}
	
	public void imprimirEstado(String s) {
		// TODO Auto-generated method stub
		
		System.out.println("Display Control: Estado " + s);
		
	}
	

	@Override
	public void update(int piso) {
		this.imprimirPiso(piso);
	}


	@Override
	public void updateEstado(String s) {
		// TODO Auto-generated method stub
		this.imprimirEstado(s);
		
	}



}
