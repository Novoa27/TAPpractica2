package ascensores;

import java.util.ArrayList;


public class Ascensor {
	private int idAscensor;
	private int pisoAscensor;
	private Estado current;
	
	//Lista de observers
	private ArrayList<Observer> observers;
	
	//Constructor de ascensor
	
	public Ascensor(int i) {
		this.pisoAscensor = 0;
		this.current = new EstadoParado();
		this.observers = new ArrayList<>();
		this.idAscensor = i;
		this.notifyObserversPiso();
		this.notifyObserversEstado();
		this.notifyObserversId();
	}
	
	public void setEstado(Estado e) {
		this.current = e;
		notifyObserversEstado();
	}
	
	public Estado getEstado () {
		return this.current;
	}
	
	//Obtenci�n del Estado en formato String y escrito correctamente
	public String getNameEstado() {
		return this.current.getNameEstado();
	}
	
	public int getIdAscensor() {
		return idAscensor;
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
	
	
	//Esta funci�n es una simulaci�n de como el ascensor recorrer�a los pisos
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
	
	
	//Metodos del Observer
	
	public void attachObserver(Observer o) {
		this.observers.add(o);
	}
	
	public void detachObserver(Observer o) {
		this.observers.remove(o);
	}
	
	public void notifyObserversPiso() {
		
		//Hacer update cada vez que el ascensor cambie de piso
		for(Observer o : this.observers) {
			o.update(this.pisoAscensor);
		}
		
	}
		
	public void notifyObserversEstado() {
			
			//Hacer update cada vez que el ascensor cambie de estado
			for(Observer o : this.observers) {
				o.updateEstado(this.current.getNameEstado());
			}
		
	}
	
	public void notifyObserversId() {
		
		//Hacer update del id del piso
		for(Observer o : this.observers) {
			o.updateid(this.idAscensor);
		}
		
	}
	
}
	
