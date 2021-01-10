package ascensores;

public class DisplayControl implements Observer {

	//Esta clase se emplea para obtener la informacion necesaria para mostrar en el display de control
	
	int numeroAscensor;
	String nameEstado; 
	int pisoAscensor;

    
    public DisplayControl(Ascensor s) {
    	update (s.getPisoAscensor());
    	updateEstado (s.getNameEstado());
    	updateid(s.getIdAscensor());
    	
    	
    }
    
    public void setNameEstado(String nameEstado) {
		this.nameEstado = nameEstado;
	}
    
    public int getNumeroAscensor() {
		return numeroAscensor;
	}
    public String getNameEstado() {
		return nameEstado;
	}

	public int getPisoAscensor() {
		return pisoAscensor;
	}

    @Override
    public void update(int piso) {
    	this.pisoAscensor = piso; 
        System.out.println("Display Control: Piso  " + this.pisoAscensor);
        
    }


    @Override
    public void updateEstado(String s) {
        
        this.nameEstado = s; 
        System.out.println("Display Control: Estado " + this.nameEstado);
        setNameEstado(nameEstado);

    }
	@Override
	public void updateid(int id) {
		
		this.numeroAscensor = id;
	}
	
	




}
