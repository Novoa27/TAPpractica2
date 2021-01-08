package com.example.application.views.control;

import java.util.ArrayList;
import java.util.List;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.Text;	
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import Ascensores.Ascensor;
import Ascensores.Edificio;
import Ascensores.Observer;
import Ascensores.Piso;
import Ascensores.displayControl;
 
@Route(value = "control", layout = MainView.class)
@PageTitle("Control")
@RouteAlias(value = "", layout = MainView.class)
public class ControlView extends Div {

    public ControlView() { 
        setId("control-view");
        
        VerticalLayout vl = new VerticalLayout();
        
        List<displayControl> displayList = new ArrayList<>();
        
        Edificio e = Edificio.getInstance();
        
        Ascensor ascensor0 = e.getAscensor(0);
        Ascensor ascensor1 = e.getAscensor(1);
        Ascensor ascensor2 = e.getAscensor(2);
                
        displayControl dc0 = new displayControl(ascensor0);
        displayControl dc1 = new displayControl(ascensor1);
        displayControl dc2 = new displayControl(ascensor2);
        
        displayList.add(dc0);
        displayList.add(dc1);
        displayList.add(dc2);
        
        ascensor0.attachObserver(dc0);
        ascensor1.attachObserver(dc1);
        ascensor2.attachObserver(dc2);

        Grid<displayControl> grid = new Grid<>(displayControl.class);
        
        //grid.setColumns("Piso", "Estado");
        
        grid.setItems(displayList);
        
        vl.add(grid);
        
        add(vl);
    }

}
