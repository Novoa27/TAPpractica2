package Ascensores;

import java.util.Timer;
import java.util.TimerTask;


public class Ascensor {
	
	private int pisoAscensor;
	private Estado current;
	
	//Constructor de máquina por defecto
	public Ascensor() {
		this.pisoAscensor = 0;
		this.current = new EstadoParado();
		
	}
	
	public void setEstado(Estado e) {
		this.current = e;
	}
	
	
	public void llamarDesdePlanta(int pisoPlanta) throws InterruptedException {
		this.current.llamarDesdePlanta(this, pisoPlanta);
	}
	
	public void moverDesdeAscensor(int pisoPlanta) throws InterruptedException {
		this.current.moverDesdeAscensor(this, pisoPlanta);
	}
	
	public void abrirPuerta() {
		this.current.abrirPuerta(this);
	}
	
	public void cerrarPuerta() {
		this.current.cerrarPuerta(this);
	}
	
	public void setPisoAscensor(int pisoAscensor) {
		this.pisoAscensor = pisoAscensor;
	}
	
	public int getPisoAscensor() {
		return pisoAscensor;
	}
	
	
	public int recorrerPisos (int pisoPlanta) throws InterruptedException {
		
	
		if (pisoPlanta > this.pisoAscensor) {
			while (this.pisoAscensor< pisoPlanta)
				
				System.out.println(this.pisoAscensor);
				this.pisoAscensor++;
				java.util.concurrent.TimeUnit.SECONDS.sleep(2);
			System.out.println(this.pisoAscensor);
			
		}
		else {
			while (this.pisoAscensor> pisoPlanta)
							
				System.out.println(this.pisoAscensor);
				this.pisoAscensor--;
				java.util.concurrent.TimeUnit.SECONDS.sleep(2);
			System.out.println(this.pisoAscensor);	
		}		
		
		return pisoAscensor;
	}
	
	

}
