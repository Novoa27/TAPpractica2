package Ascensores;

public class displayAscensor implements Observer {

    String nameEstado; 
    int pisoSal; 

	public int getPisoAscensor() {
		return pisoSal;
	}

	public void setPisoSal(int pisoSal) {
		this.pisoSal = pisoSal;
	}

	public displayAscensor(Ascensor s) {
    	update (s.getPisoAscensor());
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
		
	}


}
