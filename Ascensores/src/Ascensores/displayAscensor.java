package Ascensores;

public class displayAscensor implements Observer {

    String nameEstado; 
    int pisoSal; 
    
    
    public displayAscensor(Ascensor s) {
    	update (s.getPisoAscensor());
    }

    public void imprimirPiso(int piso) {
        // TODO Auto-generated method stub
        this.pisoSal = piso; 
        System.out.println("Display Ascensor: Piso  " + this.pisoSal);

    }



    @Override
    public void update(int piso) {
        this.imprimirPiso(piso);
    }


    @Override
    public void updateEstado(String s) {
        // TODO Auto-generated method stub
        
    }


}
