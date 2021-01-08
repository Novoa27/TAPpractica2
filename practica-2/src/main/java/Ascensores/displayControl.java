package Ascensores;

public class displayControl implements Observer {

	int numeroAscensor;
	String nameEstado; 
	int PisoAscensor;

    
    public displayControl(Ascensor s) {
    	update (s.getPisoAscensor());
    	System.out.println("aaaa2");
    	String estadoinicial = "Parado";
    	updateEstado (estadoinicial);
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
		return PisoAscensor;
	}

    @Override
    public void update(int piso) {
    	this.PisoAscensor = piso; 
        System.out.println("Display Control: Piso  " + this.PisoAscensor);
        
    }


    @Override
    public void updateEstado(String s) {
        // TODO Auto-generated method stub
        this.nameEstado = s; 
        System.out.println("Display Control: Estado " + this.nameEstado);
        setNameEstado(nameEstado);

    }
	@Override
	public void updateid(int id) {
		// TODO Auto-generated method stub
		this.numeroAscensor = id;
	}
	
	




}
