package Ascensores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pisoPlanta;
		
		pisoPlanta = 7;
		
		Ascensor A1 = new Ascensor();
		Ascensor A2 = new Ascensor();
		Ascensor A3 = new Ascensor();
		
		Piso p0 = new Piso(0);
		Piso p1 = new Piso(1);
		Piso p2 = new Piso(2);
		Piso p3 = new Piso(3);
		Piso p4 = new Piso(4);
		Piso p5 = new Piso(5);
		Piso p6 = new Piso(6);
		
		
		displayAscensor d1 = new displayAscensor();
		displayControl c1 = new displayControl();
		A1.attachObserver(d1); //Le asignamos el observer
		A1.attachObserver(c1);
		
		A1.requestAscensor(p6);		
		A1.requestAscensor(p3);
		
		
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
