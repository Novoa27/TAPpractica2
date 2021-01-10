package ascensores;

import java.util.ArrayList;



public class Edificio {
	
	//Se ha empleado un Singleton del edificio para que solo exista 1 edificio con sus 3 ascensores y sus 7 Plantas
	
	private static Edificio singleton;
	private ArrayList<Ascensor> ascensores;
	private ArrayList<Piso> pisos;

	private Edificio() {
		
		ascensores = new ArrayList<>();
		pisos = new ArrayList<>();
				
		Ascensor a0 = new Ascensor(1);		
		Ascensor a1 = new Ascensor(2);
		Ascensor a2 = new Ascensor(3);
		
		this.ascensores.add(a0);
		this.ascensores.add(a1);
		this.ascensores.add(a2);
		
		Piso p0 = new Piso(0);
		Piso p1 = new Piso(1);
		Piso p2 = new Piso(2);
		Piso p3 = new Piso(3);
		Piso p4 = new Piso(4);
		Piso p5 = new Piso(5);
		Piso p6 = new Piso(6);
		
		this.pisos.add(p0);	
		this.pisos.add(p1);	
		this.pisos.add(p2);	
		this.pisos.add(p3);	
		this.pisos.add(p4);	
		this.pisos.add(p5);	
		this.pisos.add(p6);	
		
	}
	
	//Singleton
	public static Edificio getInstance() {
		if(singleton == null)
			singleton = new Edificio();
		
		return singleton;
	}

	public Ascensor getAscensor(int i) {
		return ascensores.get(i);
	}
	
	public Piso getPiso(int i) {
		return pisos.get(i);
	}
	

}
