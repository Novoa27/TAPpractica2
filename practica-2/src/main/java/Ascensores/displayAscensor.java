package Ascensores;

public class displayAscensor implements Observer {

    int pisoSal;
    int numeroAscensor;
    
    public displayAscensor(Ascensor s) {
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
        // TODO Auto-generated method stub
        
    }

    @Override
	public void updateid(int id) {
		// TODO Auto-generated method stub
		this.numeroAscensor = id;
	}


}
