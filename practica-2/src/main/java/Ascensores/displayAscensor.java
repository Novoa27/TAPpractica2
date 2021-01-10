package ascensores;

public class DisplayAscensor implements Observer {

	//Esta clase se emplea para obtener la informacion necesaria para mostrar en los ascensores y en los pisos
	
    int pisoSal;
    int numeroAscensor;
    
    public DisplayAscensor(Ascensor s) {
    	update (s.getPisoAscensor());
    	updateid(s.getIdAscensor());
    }
    

	public int getNumeroAscensor() {
		return numeroAscensor;
	}

	public int getPisoAscensor() {
		return pisoSal;
	}

	public void setPisoSal(int pisoSal) {
		this.pisoSal = pisoSal;
	}


    @Override
    public void update(int piso) {
        this.pisoSal = piso; 
        System.out.println("Display Ascensor: Piso  " + this.pisoSal);
    }


    @Override
    public void updateEstado(String s) {
        // No nos interesa el estado para estas pantallas
        
    }

    @Override
	public void updateid(int id) {

		this.numeroAscensor = id;
	}


}
