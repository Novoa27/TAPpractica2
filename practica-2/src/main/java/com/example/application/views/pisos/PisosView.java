package com.example.application.views.pisos;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import Ascensores.Ascensor;
import Ascensores.Edificio;
import Ascensores.Observer;
import Ascensores.Piso;
import Ascensores.displayAscensor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.application.views.main.MainView;

@Route(value = "pisos", layout = MainView.class)
@PageTitle("Pisos")
public class PisosView extends Div {

    public PisosView() {
        setId("pisos-view");
        add(new Text("Content placeholder"));
        
    	Edificio e = Edificio.getInstance();
        
        Ascensor ascensor0 = e.getAscensor(0);
        Ascensor ascensor1 = e.getAscensor(1);
        Ascensor ascensor2 = e.getAscensor(2);
        
        Piso piso0 = e.getPiso(0);
		Piso piso1 = e.getPiso(1);
		Piso piso2 = e.getPiso(2);
		Piso piso3 = e.getPiso(3);
		Piso piso4 = e.getPiso(4);
		Piso piso5 = e.getPiso(5);
		Piso piso6 = e.getPiso(6);
		
		displayAscensor d0 = new displayAscensor(ascensor0);
		displayAscensor d1 = new displayAscensor(ascensor1);
		displayAscensor d2 = new displayAscensor(ascensor2);
		
		ascensor0.attachObserver(d0);
		ascensor1.attachObserver(d1);
		ascensor2.attachObserver(d2);
		
		List<displayAscensor> display_ascensores = new ArrayList<>();
		display_ascensores.add(d0);
		display_ascensores.add(d1);
		display_ascensores.add(d2);
		
		Grid<displayAscensor> grid_ascensores_0 = grid(display_ascensores);
		Grid<displayAscensor> grid_ascensores_1 = grid(display_ascensores);
		Grid<displayAscensor> grid_ascensores_2 = grid(display_ascensores);
		Grid<displayAscensor> grid_ascensores_3 = grid(display_ascensores);
		Grid<displayAscensor> grid_ascensores_4 = grid(display_ascensores);
		Grid<displayAscensor> grid_ascensores_5 = grid(display_ascensores);
		Grid<displayAscensor> grid_ascensores_6 = grid(display_ascensores);
		
		
		List<Grid> lista_grids = new ArrayList<>();
		
		lista_grids.add(grid_ascensores_0);
		lista_grids.add(grid_ascensores_1);
		lista_grids.add(grid_ascensores_2);
		lista_grids.add(grid_ascensores_3);
		lista_grids.add(grid_ascensores_4);
		lista_grids.add(grid_ascensores_5);
		lista_grids.add(grid_ascensores_6);
		
		Notification notificar_piso = new Notification(
                "Ascensor disponible", 1000);
		notificar_piso.setPosition(Position.MIDDLE);
		
		//Piso0
		VerticalLayout vl0 = new VerticalLayout();
		SplitLayout sl0 = new SplitLayout();
		
		VerticalLayout vl1 = new VerticalLayout();
		SplitLayout sl1 = new SplitLayout();
		
		VerticalLayout vl2 = new VerticalLayout();
		SplitLayout sl2 = new SplitLayout();
		
		VerticalLayout vl3 = new VerticalLayout();
		SplitLayout sl3 = new SplitLayout();
		
		VerticalLayout vl4 = new VerticalLayout();
		SplitLayout sl4 = new SplitLayout();
		
		VerticalLayout vl5 = new VerticalLayout();
		SplitLayout sl5 = new SplitLayout();
		
		VerticalLayout vl6 = new VerticalLayout();
		SplitLayout sl6 = new SplitLayout();
		
		//planta 0
		Button button00 = new Button("Ascensor 1");
        button00.addClickListener(event -> {ascensor0.requestAscensor(piso0);
        actualizar_grids(lista_grids,notificar_piso);});     
        button00.setTabIndex(0);
        
        Button button10 = new Button("Ascensor 2");
        button10.addClickListener(event -> {ascensor1.requestAscensor(piso0);
        actualizar_grids(lista_grids,notificar_piso);});     
        button10.setTabIndex(0);
        
        Button button20 = new Button("Ascensor 3");
        button20.addClickListener(event -> {ascensor2.requestAscensor(piso0);
        actualizar_grids(lista_grids,notificar_piso);});     
        button20.setTabIndex(0);
        
        vl0.add(button00,button10,button20);
        sl0.addToPrimary(vl0);
        sl0.addToSecondary(grid_ascensores_0);
        sl0.setPrimaryStyle("minWidth", "150px");
        sl0.setPrimaryStyle("maxWidth", "150px");
        
        //planta 1
        Button button01 = new Button("Ascensor 1");
        button01.addClickListener(event -> {ascensor0.requestAscensor(piso1);
        actualizar_grids(lista_grids,notificar_piso);});     
        button01.setTabIndex(0);
        
        Button button11 = new Button("Ascensor 2");
        button11.addClickListener(event -> {ascensor1.requestAscensor(piso1);
        actualizar_grids(lista_grids,notificar_piso);});     
        button11.setTabIndex(0);
        
        Button button21 = new Button("Ascensor 3");
        button21.addClickListener(event -> {ascensor2.requestAscensor(piso1);
        actualizar_grids(lista_grids,notificar_piso);});     
        button21.setTabIndex(0);
        
        vl1.add(button01,button11,button21);
        sl1.addToPrimary(vl1);
        sl1.addToSecondary(grid_ascensores_1);
        sl1.setPrimaryStyle("minWidth", "150px");
        sl1.setPrimaryStyle("maxWidth", "150px");
        
        //planta 2
        Button button02 = new Button("Ascensor 1");
        button02.addClickListener(event -> {ascensor0.requestAscensor(piso2);
        actualizar_grids(lista_grids,notificar_piso);});     
        button02.setTabIndex(0);
        
        Button button12 = new Button("Ascensor 2");
        button12.addClickListener(event -> {ascensor1.requestAscensor(piso2);
        actualizar_grids(lista_grids,notificar_piso);});     
        button12.setTabIndex(0);
        
        Button button22 = new Button("Ascensor 3");
        button22.addClickListener(event -> {ascensor2.requestAscensor(piso2);
        actualizar_grids(lista_grids,notificar_piso);});     
        button22.setTabIndex(0);
        
        vl2.add(button02,button12,button22);
        sl2.addToPrimary(vl2);
        sl2.addToSecondary(grid_ascensores_2);
        sl2.setPrimaryStyle("minWidth", "150px");
        sl2.setPrimaryStyle("maxWidth", "150px");        
        
        //planta 3
        
        Button button03 = new Button("Ascensor 1");
        button03.addClickListener(event -> {ascensor0.requestAscensor(piso3);
        actualizar_grids(lista_grids,notificar_piso);});
        button03.setTabIndex(0);

        Button button13 = new Button("Ascensor 2");
        button13.addClickListener(event -> {ascensor1.requestAscensor(piso3);
        actualizar_grids(lista_grids,notificar_piso);});
        button13.setTabIndex(0);

        Button button23 = new Button("Ascensor 3");
        button23.addClickListener(event -> {ascensor2.requestAscensor(piso3);
        actualizar_grids(lista_grids,notificar_piso);});
        button23.setTabIndex(0);

        vl3.add(button03,button13,button23);
        sl3.addToPrimary(vl3);
        sl3.addToSecondary(grid_ascensores_3);
        sl3.setPrimaryStyle("minWidth", "150px");
        sl3.setPrimaryStyle("maxWidth", "150px");
        
        //planta 4
        
        Button button04 = new Button("Ascensor 1");
        button04.addClickListener(event -> {ascensor0.requestAscensor(piso4);
        actualizar_grids(lista_grids,notificar_piso);});
        button04.setTabIndex(0);

        Button button14 = new Button("Ascensor 2");
        button14.addClickListener(event -> {ascensor1.requestAscensor(piso4);
        actualizar_grids(lista_grids,notificar_piso);});
        button14.setTabIndex(0);

        Button button24 = new Button("Ascensor 3");
        button24.addClickListener(event -> {ascensor2.requestAscensor(piso4);
        actualizar_grids(lista_grids,notificar_piso);});
        button24.setTabIndex(0);

        vl4.add(button04,button14,button24);
        sl4.addToPrimary(vl4);
        sl4.addToSecondary(grid_ascensores_4);
        sl4.setPrimaryStyle("minWidth", "150px");
        sl4.setPrimaryStyle("maxWidth", "150px");
        
        //planta 5
        
        Button button05 = new Button("Ascensor 1");
        button05.addClickListener(event -> {ascensor0.requestAscensor(piso5);
        actualizar_grids(lista_grids,notificar_piso);});
        button05.setTabIndex(0);

        Button button15 = new Button("Ascensor 2");
        button15.addClickListener(event -> {ascensor1.requestAscensor(piso5);
        actualizar_grids(lista_grids,notificar_piso);});
        button15.setTabIndex(0);

        Button button25 = new Button("Ascensor 3");
        button25.addClickListener(event -> {ascensor2.requestAscensor(piso5);
        actualizar_grids(lista_grids,notificar_piso);});
        button25.setTabIndex(0);

        vl5.add(button05,button15,button25);
        sl5.addToPrimary(vl5);
        sl5.addToSecondary(grid_ascensores_5);
        sl5.setPrimaryStyle("minWidth", "150px");
        sl5.setPrimaryStyle("maxWidth", "150px");
        
        //planta 6
        
        Button button06 = new Button("Ascensor 1");
        button06.addClickListener(event -> {ascensor0.requestAscensor(piso6);
        actualizar_grids(lista_grids,notificar_piso);});
        button06.setTabIndex(0);

        Button button16 = new Button("Ascensor 2");
        button16.addClickListener(event -> {ascensor1.requestAscensor(piso6);
        actualizar_grids(lista_grids,notificar_piso);});
        button16.setTabIndex(0);

        Button button26 = new Button("Ascensor 3");
        button26.addClickListener(event -> {ascensor2.requestAscensor(piso6);
        actualizar_grids(lista_grids,notificar_piso);});
        button26.setTabIndex(0);

        vl6.add(button06,button16,button26);
        sl6.addToPrimary(vl6);
        sl6.addToSecondary(grid_ascensores_6);
        sl6.setPrimaryStyle("minWidth", "150px");
        sl6.setPrimaryStyle("maxWidth", "150px");
        
        //Tabs
        Tab tab0 = new Tab("Planta 0");
        Div page0 = new Div();
        page0.setText("Botonera del Ascensor");
        page0.add(sl0);
        
        
        Tab tab1 = new Tab("Planta 1");
        
        Div page1 = new Div();
        page1.setText("Botonera del Ascensor");
        page1.add(sl1);
        page1.setVisible(false);
        
        Tab tab2 = new Tab("Planta 2");
        Div page2 = new Div();
        page2.setText("Botonera del Ascensor");
        page2.add(sl2);
        page2.setVisible(false);
        
        Tab tab3 = new Tab("Planta 3");
        Div page3 = new Div();
        page3.setText("Botonera del Ascensor");
        page3.add(sl3);
        page3.setVisible(false);
        
        Tab tab4 = new Tab("Planta 4");
        Div page4 = new Div();
        page4.setText("Botonera del Ascensor");
        page4.add(sl4);
        page4.setVisible(false);
        
        Tab tab5 = new Tab("Planta 5");
        Div page5 = new Div();
        page5.setText("Botonera del Ascensor");
        page5.add(sl5);
        page5.setVisible(false);
        
        Tab tab6 = new Tab("Planta 6");
        Div page6 = new Div();
        page6.setText("Botonera del Ascensor");
        page6.add(sl6);
        page6.setVisible(false);
        
        Map<Tab, Component> tabsToPages = new HashMap<>();
        tabsToPages.put(tab0, page0);
        tabsToPages.put(tab1, page1);
        tabsToPages.put(tab2, page2);
        tabsToPages.put(tab3, page3);
        tabsToPages.put(tab4, page4);
        tabsToPages.put(tab5, page5);
        tabsToPages.put(tab6, page6);
        Tabs tabs = new Tabs(tab0, tab1, tab2, tab3, tab4, tab5, tab6);
        Div pages = new Div(page0, page1, page2, page3, page4, page5, page6);

        tabs.addSelectedChangeListener(event -> {
            tabsToPages.values().forEach(page -> page.setVisible(false));
            Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
            selectedPage.setVisible(true);
        });
        tabs.setFlexGrowForEnclosedTabs(1);

        add(tabs, pages);
        
        
        
        
    }
    
    public Grid<displayAscensor> grid (List<displayAscensor> display_ascensores){
    	Grid<displayAscensor> grid_ascensores_p0 = new Grid<>(displayAscensor.class);
		grid_ascensores_p0.setItems(display_ascensores);
		return grid_ascensores_p0;
    }
    
    public void actualizar_grids(List<Grid> lista,Notification notificar_piso) {
    	
    	for(int i = 0; i<lista.size();i+=1) {
    		Grid g = lista.get(i);
    		g.getDataProvider().refreshAll();
    		notificar_piso.open();
    	}
    }

}
