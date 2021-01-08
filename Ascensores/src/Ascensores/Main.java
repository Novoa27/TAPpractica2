package Ascensores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pisoPlanta;
		
		pisoPlanta = 7;
		
		Edificio edificio =Edificio.getInstance();
		
		Ascensor ascensor1 = edificio.getAscensor(0);
		
		
		
		Piso piso0 = edificio.getPiso(0);
		Piso piso1 = edificio.getPiso(1);
		Piso piso2 = edificio.getPiso(2);
		Piso piso3 = edificio.getPiso(3);
		Piso piso4 = edificio.getPiso(4);
		Piso piso5 = edificio.getPiso(5);
		Piso piso6 = edificio.getPiso(6);

		
		displayAscensor d1 = new displayAscensor(ascensor1);
		displayControl c1 = new displayControl(ascensor1);
		
		
		ascensor1.attachObserver(d1); //Le asignamos el observer
		ascensor1.attachObserver(c1);
		ascensor1.getEstado();
		
		System.out.println();
		
		
		ascensor1.requestAscensor(piso6);		
		ascensor1.requestAscensor(piso6);
		
		
		/*
		displayAscensor d2 = new displayAscensor();
		A2.attachObserver(d2); //Le asignamos el observer
		A2.requestAscensor(p1);		
		A2.requestAscensor(p6);
		
		//Ascensor 3
		displayAscensor d3 = new displayAscensor();
		A3.attachObserver(d3); //Le asignamos el observer
		A3.requestAscensor(p2);		
		A3.requestAscensor(p5);*/		
		

	}

}
