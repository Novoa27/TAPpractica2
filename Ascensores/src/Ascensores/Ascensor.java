package Ascensores;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class Ascensor {
	
	private int pisoAscensor;
	private Estado current;
	
	//Lista de observers
	private ArrayList<Observer> observers;
	
	//Constructor de máquina por defecto
	public Ascensor() {
		this.pisoAscensor = 0;
		this.current = new EstadoParado();
		this.observers = new ArrayList<Observer>();
		
	}
	
	public void setEstado(Estado e) {
		this.current = e;
		notifyObserversEstado();
	}
	
	public Estado getEstado () {
		return this.current;
	}
	
	
	public void requestAscensor(Piso p) {
		this.current.requestAscensor(this, p);
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
	
	
	public int recorrerPisos (Piso p){
		
		int pisoPlanta = p.getnumPiso();
		
		
		
		if (this.pisoAscensor < pisoPlanta ) {
			while (this.pisoAscensor< pisoPlanta) {
				
			    this.setPisoAscensor(this.pisoAscensor+1);
			    this.notifyObserversPiso();
			    
			}			    
		    p.activarAltavoz();
		    
			
		}
		else if (this.pisoAscensor > pisoPlanta){
			while (this.pisoAscensor > pisoPlanta) {
							
				this.setPisoAscensor(this.pisoAscensor-1);
				this.notifyObserversPiso();
			}
			
			p.activarAltavoz();
		}		
		
		return pisoAscensor;
	}
	
	
	//OBSERVER METHODS
	
	public void attachObserver(Observer o) {
		this.observers.add(o);
	}
	
	public void detachObserver(Observer o) {
		this.observers.remove(o);
	}
	
	public void notifyObserversPiso() {
		
		//Hacer update de cada observer con la temperatura
		for(Observer o : this.observers) {
			o.update(this.pisoAscensor);
		}
		
	}
		
	public void notifyObserversEstado() {
			
			//Hacer update de cada observer con la temperatura
			for(Observer o : this.observers) {
				o.updateEstado(this.current.getNameEstado());
			}
		
	}
	
	

}
