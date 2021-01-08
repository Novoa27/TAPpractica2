package com.example.application.views.pisos;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.views.main.MainView;

@Route(value = "pisos", layout = MainView.class)
@PageTitle("Pisos")
public class PisosView extends Div {

    public PisosView() {
        setId("pisos-view");
        add(new Text("Content placeholder"));
    }

}
