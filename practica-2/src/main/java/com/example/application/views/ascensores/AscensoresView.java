package com.example.application.views.ascensores;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import Ascensores.Ascensor;
import Ascensores.Edificio;
import Ascensores.Piso;
import Ascensores.displayAscensor;
import Ascensores.displayControl;

import java.awt.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.application.views.main.MainView;

@Route(value = "ascensores", layout = MainView.class)
@PageTitle("Ascensores")
public class AscensoresView extends Div {

    public AscensoresView() {
        setId("ascensores-view");
        //
        
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
		
		List<displayAscensor> display_ascensor_0 = new ArrayList<>();
		display_ascensor_0.add(d0);
		Grid<displayAscensor> grid_a1 = new Grid<>(displayAscensor.class);
        grid_a1.setItems(display_ascensor_0);
        
        List<displayAscensor> display_ascensor_1 = new ArrayList<>();
		display_ascensor_1.add(d1);
		Grid<displayAscensor> grid_a2 = new Grid<>(displayAscensor.class);
        grid_a2.setItems(display_ascensor_1);
        // 
        
        
        Notification n_alarm = new Notification(
                "Alarma sonando", 4000);
        n_alarm.setPosition(Position.MIDDLE);       
        Notification n_abrir = new Notification(
                "Abriendo puerta", 3000);
        n_abrir.setPosition(Position.MIDDLE);
        Notification n_cerrar = new Notification(
                "Cerrando puerta", 3000);
        n_cerrar.setPosition(Position.MIDDLE);
        
        VerticalLayout layout1 = new VerticalLayout();//layout ascensor 1
        VerticalLayout layout2 = new VerticalLayout();
        VerticalLayout layout3 = new VerticalLayout();
       
        SplitLayout layout11 = new SplitLayout();
        SplitLayout layout21 = new SplitLayout();
        SplitLayout layout31 = new SplitLayout();
        
        
                //UI.getCurrent().getPage().reload();
        //ascensor 1
        Button button0 = new Button("0");
        button0.addClickListener(event -> {ascensor0.requestAscensor(piso0);
        						grid_a1.getDataProvider().refreshAll();});
        button0.setTabIndex(0);
        Button button1 = new Button("1");
        button1.addClickListener(event -> {ascensor0.requestAscensor(piso1);
        						grid_a1.getDataProvider().refreshAll();});
        button1.setTabIndex(1);
        Button button2 = new Button("2");
        button2.addClickListener(event -> {ascensor0.requestAscensor(piso2);
								grid_a1.getDataProvider().refreshAll();});
        button2.setTabIndex(2);
        Button button3 = new Button("3");
        button3.addClickListener(event -> {ascensor0.requestAscensor(piso3);
								grid_a1.getDataProvider().refreshAll();});
        button3.setTabIndex(3);
        Button button4 = new Button("4");
        button4.addClickListener(event -> {ascensor0.requestAscensor(piso4);
								grid_a1.getDataProvider().refreshAll();});
        button4.setTabIndex(4);
        Button button5 = new Button("5");
        button5.addClickListener(event -> {ascensor0.requestAscensor(piso5);
								grid_a1.getDataProvider().refreshAll();});
        button5.setTabIndex(5);
        Button button6 = new Button("6");
        button6.addClickListener(event -> {ascensor0.requestAscensor(piso6);
								grid_a1.getDataProvider().refreshAll();});
        button6.setTabIndex(6);
        Button openButton = new Button("Open", new Icon(VaadinIcon.CARET_RIGHT));
        openButton.addClickListener(event -> {ascensor0.abrirPuerta();
									n_abrir.open();});
        openButton.setTabIndex(8);
        Button closeButton = new Button("Close", new Icon(VaadinIcon.CARET_LEFT));
        closeButton.addClickListener(event -> {ascensor0.cerrarPuerta();
									n_cerrar.open();});
        closeButton.setTabIndex(9);
        Button alarmButton = new Button("Alarma", new Icon(VaadinIcon.BELL_O));
        alarmButton.addClickListener(event -> {ascensor0.abrirPuerta();
									n_alarm.open();});
        alarmButton.setTabIndex(10);
        
    	//----------------------------------------------------------------------------------
      //ascensor 2
        Button button02 = new Button("0");
        button02.addClickListener(event -> {ascensor1.requestAscensor(piso0);
        						grid_a2.getDataProvider().refreshAll();});
        button02.setTabIndex(0);
        Button button12 = new Button("1");
        button12.addClickListener(event -> {ascensor1.requestAscensor(piso1);
        						grid_a2.getDataProvider().refreshAll();});
        button12.setTabIndex(1);
        Button button22 = new Button("2");
        button22.addClickListener(event -> {ascensor1.requestAscensor(piso2);
								grid_a2.getDataProvider().refreshAll();});
        button22.setTabIndex(2);
        Button button32 = new Button("3");
        button32.addClickListener(event -> {ascensor1.requestAscensor(piso3);
								grid_a2.getDataProvider().refreshAll();});
        button32.setTabIndex(3);
        Button button42 = new Button("4");
        button42.addClickListener(event -> {ascensor1.requestAscensor(piso4);
								grid_a2.getDataProvider().refreshAll();});
        button42.setTabIndex(4);
        Button button52 = new Button("5");
        button52.addClickListener(event -> {ascensor1.requestAscensor(piso5);
								grid_a2.getDataProvider().refreshAll();});
        button52.setTabIndex(52);
        Button button62 = new Button("6");
        button62.addClickListener(event -> {ascensor1.requestAscensor(piso6);
								grid_a2.getDataProvider().refreshAll();});
        button62.setTabIndex(6);
        Button openButton2 = new Button("Open", new Icon(VaadinIcon.CARET_RIGHT));
        openButton2.addClickListener(event -> {ascensor1.abrirPuerta();
									n_abrir.open();});
        openButton2.setTabIndex(8);
        Button closeButton2 = new Button("Close", new Icon(VaadinIcon.CARET_LEFT));
        closeButton2.addClickListener(event -> {ascensor1.cerrarPuerta(); 
									n_cerrar.open();});
        closeButton2.setTabIndex(9);
        Button alarmButton2 = new Button("Alarma", new Icon(VaadinIcon.BELL_O));
        alarmButton2.addClickListener(event -> {ascensor1.abrirPuerta();
									n_alarm.open();});
        alarmButton2.setTabIndex(10);
                
       
        
        layout1.add(button0,button1,button2,button3,button4,button5,button6,openButton,closeButton,alarmButton);
        layout11.addToPrimary(layout1);
        layout11.addToSecondary(grid_a1);
        layout11.setPrimaryStyle("minWidth", "150px");
        layout11.setPrimaryStyle("maxWidth", "150px");
        
        //layout.setPrimaryStyle("background", "salmon");
        
        layout2.add(button02,button12,button22,button32,button42,button52,button62,openButton2,closeButton2,alarmButton2);
        layout21.addToPrimary(layout2);
        layout21.addToSecondary(grid_a2);
        layout21.setPrimaryStyle("minWidth", "150px");
        layout21.setPrimaryStyle("maxWidth", "150px");
        
        
        Tab tab1 = new Tab("Ascensor 1");
        Div page1 = new Div();
        page1.setText("Botonera del Ascensor");
        page1.add(layout11);

        Tab tab2 = new Tab("Ascensor 2");
        Div page2 = new Div();
        page2.setText("Botonera del Ascensor"); 
        page2.add(layout21);
        page2.setVisible(false);

        Tab tab3 = new Tab("Ascensor 3");
        Div page3 = new Div();
        page3.setText("Botonera del Ascensor");
        page3.add(layout31);
        page3.setVisible(false);

        Map<Tab, Component> tabsToPages = new HashMap<>();
        tabsToPages.put(tab1, page1);
        tabsToPages.put(tab2, page2);
        tabsToPages.put(tab3, page3);
        Tabs tabs = new Tabs(tab1, tab2, tab3);
        Div pages = new Div(page1, page2, page3);

        tabs.addSelectedChangeListener(event -> {
            tabsToPages.values().forEach(page -> page.setVisible(false));
            Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
            selectedPage.setVisible(true);
        });
        tabs.setFlexGrowForEnclosedTabs(1);

        add(tabs, pages);
        
        
        
    }

}