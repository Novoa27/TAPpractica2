package Ascensores;

public class displayControl implements Observer {

	
    String nameEstado; 
    int pisoSal; 
    
    
    public displayControl(Ascensor s) {
    	update (s.getPisoAscensor());
    	String estadoinicial = "Parado";
    	updateEstado (estadoinicial);
    }

    public void imprimirPiso(int piso) {
        // TODO Auto-generated method stub

        this.pisoSal = piso; 
        System.out.println("Display Control: Piso  " + this.pisoSal);

    }

    public void imprimirEstado(String s) {
        // TODO Auto-generated method stub

        this.nameEstado = s; 
        System.out.println("Display Control: Estado " + this.nameEstado);

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
