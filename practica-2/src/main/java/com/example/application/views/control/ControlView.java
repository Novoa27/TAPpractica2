package com.example.application.views.control;

import java.util.ArrayList;
import java.util.List;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import ascensores.Ascensor;
import ascensores.Edificio;
import ascensores.DisplayControl;
 
@Route(value = "control", layout = MainView.class)
@PageTitle("Control")
@RouteAlias(value = "", layout = MainView.class)
public class ControlView extends Div {

    public ControlView() { 
        setId("control-view");
        
        VerticalLayout vl = new VerticalLayout();
        
        List<DisplayControl> displayList = new ArrayList<>();
        
        Edificio e = Edificio.getInstance();
        
        Ascensor ascensor0 = e.getAscensor(0);
        Ascensor ascensor1 = e.getAscensor(1);
        Ascensor ascensor2 = e.getAscensor(2);
                
        DisplayControl dc0 = new DisplayControl(ascensor0);
        DisplayControl dc1 = new DisplayControl(ascensor1);
        DisplayControl dc2 = new DisplayControl(ascensor2);
        
        displayList.add(dc0);
        displayList.add(dc1);
        displayList.add(dc2);
        
        ascensor0.attachObserver(dc0);
        ascensor1.attachObserver(dc1);
        ascensor2.attachObserver(dc2);

        Grid<DisplayControl> grid = new Grid<>(DisplayControl.class);
                
        grid.setItems(displayList);
        
        vl.add(grid);
        
        add(vl);
    }

}
