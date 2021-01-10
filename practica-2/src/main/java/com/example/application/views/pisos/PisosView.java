package com.example.application.views.pisos;

import com.vaadin.flow.component.Component;
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

import ascensores.Ascensor;
import ascensores.Edificio;
import ascensores.Piso;
import ascensores.DisplayAscensor;

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
		
		DisplayAscensor d0 = new DisplayAscensor(ascensor0);
		DisplayAscensor d1 = new DisplayAscensor(ascensor1);
		DisplayAscensor d2 = new DisplayAscensor(ascensor2);
		
		ascensor0.attachObserver(d0);
		ascensor1.attachObserver(d1);
		ascensor2.attachObserver(d2);
		
		List<DisplayAscensor> displayAscensoresf = new ArrayList<>();
		displayAscensoresf.add(d0);
		displayAscensoresf.add(d1);
		displayAscensoresf.add(d2);
		
		Grid<DisplayAscensor> gridAscensores0 = grid(displayAscensoresf);
		Grid<DisplayAscensor> gridAscensores1 = grid(displayAscensoresf);
		Grid<DisplayAscensor> gridAscensores2 = grid(displayAscensoresf);
		Grid<DisplayAscensor> gridAscensores3 = grid(displayAscensoresf);
		Grid<DisplayAscensor> gridAscensores4 = grid(displayAscensoresf);
		Grid<DisplayAscensor> gridAscensores5 = grid(displayAscensoresf);
		Grid<DisplayAscensor> gridAscensores6 = grid(displayAscensoresf);
		
		
		List<Grid> listagrids = new ArrayList<>();
		
		listagrids.add(gridAscensores0);
		listagrids.add(gridAscensores1);
		listagrids.add(gridAscensores2);
		listagrids.add(gridAscensores3);
		listagrids.add(gridAscensores4);
		listagrids.add(gridAscensores5);
		listagrids.add(gridAscensores6);
		
		Notification notificarPisof = new Notification(
                "Ascensor disponible", 1000);
		notificarPisof.setPosition(Position.MIDDLE);
		
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
		
		String ascensorName1 ="Ascensor 1";
		String ascensorName2 ="Ascensor 2";
		String ascensorName3 ="Ascensor 3";
		String minWidth ="minWidth";
		String maxWidth ="maxWidth";
		String pxx ="150px";
		String botonera ="BotoneraP";
		
		//planta 0
		Button button00 = new Button(ascensorName1);
        button00.addClickListener(event -> {ascensor0.requestAscensor(piso0);
        actualizargrids(listagrids,notificarPisof);});     
        button00.setTabIndex(0);
        
        Button button10 = new Button(ascensorName2);
        button10.addClickListener(event -> {ascensor1.requestAscensor(piso0);
        actualizargrids(listagrids,notificarPisof);});     
        button10.setTabIndex(0);
        
        Button button20 = new Button(ascensorName3);
        button20.addClickListener(event -> {ascensor2.requestAscensor(piso0);
        actualizargrids(listagrids,notificarPisof);});     
        button20.setTabIndex(0);
        
        vl0.add(button00,button10,button20);
        sl0.addToPrimary(vl0);
        sl0.addToSecondary(gridAscensores0);
        sl0.setPrimaryStyle(minWidth, pxx);
        sl0.setPrimaryStyle(maxWidth, pxx);
        
        //planta 1
        Button button01 = new Button(ascensorName1);
        button01.addClickListener(event -> {ascensor0.requestAscensor(piso1);
        actualizargrids(listagrids,notificarPisof);});     
        button01.setTabIndex(0);
        
        Button button11 = new Button(ascensorName2);
        button11.addClickListener(event -> {ascensor1.requestAscensor(piso1);
        actualizargrids(listagrids,notificarPisof);});     
        button11.setTabIndex(0);
        
        Button button21 = new Button(ascensorName3);
        button21.addClickListener(event -> {ascensor2.requestAscensor(piso1);
        actualizargrids(listagrids,notificarPisof);});     
        button21.setTabIndex(0);
        
        vl1.add(button01,button11,button21);
        sl1.addToPrimary(vl1);
        sl1.addToSecondary(gridAscensores1);
        sl1.setPrimaryStyle(minWidth, pxx);
        sl1.setPrimaryStyle(maxWidth, pxx);
        
        //planta 2
        Button button02 = new Button(ascensorName1);
        button02.addClickListener(event -> {ascensor0.requestAscensor(piso2);
        actualizargrids(listagrids,notificarPisof);});     
        button02.setTabIndex(0);
        
        Button button12 = new Button(ascensorName2);
        button12.addClickListener(event -> {ascensor1.requestAscensor(piso2);
        actualizargrids(listagrids,notificarPisof);});     
        button12.setTabIndex(0);
        
        Button button22 = new Button(ascensorName3);
        button22.addClickListener(event -> {ascensor2.requestAscensor(piso2);
        actualizargrids(listagrids,notificarPisof);});     
        button22.setTabIndex(0);
        
        vl2.add(button02,button12,button22);
        sl2.addToPrimary(vl2);
        sl2.addToSecondary(gridAscensores2);
        sl2.setPrimaryStyle(minWidth, pxx);
        sl2.setPrimaryStyle(maxWidth, pxx);        
        
        //planta 3
        
        Button button03 = new Button(ascensorName1);
        button03.addClickListener(event -> {ascensor0.requestAscensor(piso3);
        actualizargrids(listagrids,notificarPisof);});
        button03.setTabIndex(0);

        Button button13 = new Button(ascensorName2);
        button13.addClickListener(event -> {ascensor1.requestAscensor(piso3);
        actualizargrids(listagrids,notificarPisof);});
        button13.setTabIndex(0);

        Button button23 = new Button(ascensorName3);
        button23.addClickListener(event -> {ascensor2.requestAscensor(piso3);
        actualizargrids(listagrids,notificarPisof);});
        button23.setTabIndex(0);

        vl3.add(button03,button13,button23);
        sl3.addToPrimary(vl3);
        sl3.addToSecondary(gridAscensores3);
        sl3.setPrimaryStyle(minWidth, pxx);
        sl3.setPrimaryStyle(maxWidth, pxx);
        
        //planta 4
        
        Button button04 = new Button(ascensorName1);
        button04.addClickListener(event -> {ascensor0.requestAscensor(piso4);
        actualizargrids(listagrids,notificarPisof);});
        button04.setTabIndex(0);

        Button button14 = new Button(ascensorName2);
        button14.addClickListener(event -> {ascensor1.requestAscensor(piso4);
        actualizargrids(listagrids,notificarPisof);});
        button14.setTabIndex(0);

        Button button24 = new Button(ascensorName3);
        button24.addClickListener(event -> {ascensor2.requestAscensor(piso4);
        actualizargrids(listagrids,notificarPisof);});
        button24.setTabIndex(0);

        vl4.add(button04,button14,button24);
        sl4.addToPrimary(vl4);
        sl4.addToSecondary(gridAscensores4);
        sl4.setPrimaryStyle(minWidth, pxx);
        sl4.setPrimaryStyle(maxWidth, pxx);
        
        //planta 5
        
        Button button05 = new Button(ascensorName1);
        button05.addClickListener(event -> {ascensor0.requestAscensor(piso5);
        actualizargrids(listagrids,notificarPisof);});
        button05.setTabIndex(0);

        Button button15 = new Button(ascensorName2);
        button15.addClickListener(event -> {ascensor1.requestAscensor(piso5);
        actualizargrids(listagrids,notificarPisof);});
        button15.setTabIndex(0);

        Button button25 = new Button(ascensorName3);
        button25.addClickListener(event -> {ascensor2.requestAscensor(piso5);
        actualizargrids(listagrids,notificarPisof);});
        button25.setTabIndex(0);

        vl5.add(button05,button15,button25);
        sl5.addToPrimary(vl5);
        sl5.addToSecondary(gridAscensores5);
        sl5.setPrimaryStyle(minWidth, pxx);
        sl5.setPrimaryStyle(maxWidth, pxx);
        
        //planta 6
        
        Button button06 = new Button(ascensorName1);
        button06.addClickListener(event -> {ascensor0.requestAscensor(piso6);
        actualizargrids(listagrids,notificarPisof);});
        button06.setTabIndex(0);

        Button button16 = new Button(ascensorName2);
        button16.addClickListener(event -> {ascensor1.requestAscensor(piso6);
        actualizargrids(listagrids,notificarPisof);});
        button16.setTabIndex(0);

        Button button26 = new Button(ascensorName3);
        button26.addClickListener(event -> {ascensor2.requestAscensor(piso6);
        actualizargrids(listagrids,notificarPisof);});
        button26.setTabIndex(0);

        vl6.add(button06,button16,button26);
        sl6.addToPrimary(vl6);
        sl6.addToSecondary(gridAscensores6);
        sl6.setPrimaryStyle(minWidth, pxx);
        sl6.setPrimaryStyle(maxWidth, pxx);
        
        //Tabs
        Tab tab0 = new Tab("Planta 0");
        Div page0 = new Div();
        page0.setText(botonera);
        page0.add(sl0);
        
        
        Tab tab1 = new Tab("Planta 1");
        
        Div page1 = new Div();
        page1.setText(botonera);
        page1.add(sl1);
        page1.setVisible(false);
        
        Tab tab2 = new Tab("Planta 2");
        Div page2 = new Div();
        page2.setText(botonera);
        page2.add(sl2);
        page2.setVisible(false);
        
        Tab tab3 = new Tab("Planta 3");
        Div page3 = new Div();
        page3.setText(botonera);
        page3.add(sl3);
        page3.setVisible(false);
        
        Tab tab4 = new Tab("Planta 4");
        Div page4 = new Div();
        page4.setText(botonera);
        page4.add(sl4);
        page4.setVisible(false);
        
        Tab tab5 = new Tab("Planta 5");
        Div page5 = new Div();
        page5.setText(botonera);
        page5.add(sl5);
        page5.setVisible(false);
        
        Tab tab6 = new Tab("Planta 6");
        Div page6 = new Div();
        page6.setText(botonera);
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
    
    public Grid<DisplayAscensor> grid (List<DisplayAscensor> displayAscensoresf){
    	Grid<DisplayAscensor> gridAscensoresP0f = new Grid<>(DisplayAscensor.class);
		gridAscensoresP0f.setItems(displayAscensoresf);
		return gridAscensoresP0f;
    }
    
    public void actualizargrids(List<Grid> lista,Notification notificarPisof) {
    	
    	for(int i = 0; i<lista.size();i+=1) {
    		Grid g = lista.get(i);
    		g.getDataProvider().refreshAll();
    		notificarPisof.open();
    	}
    }

}
