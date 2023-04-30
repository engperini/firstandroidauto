package com.perinidev.car;

import androidx.annotation.NonNull;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;

public class MainActivityScreen extends Screen {
    public MainActivityScreen(CarContext carContext) {
        super(carContext);
    }
    @NonNull
    @Override
    public Template onGetTemplate() {


        // Create Pane 1 with a single Row
        Row row1 = new Row.Builder().setTitle("Título row1").addText("Texto row1 Aqui").build();
        PaneTemplate template1 = new PaneTemplate.Builder(new Pane.Builder().addRow(row1).build()).setTitle("Início").build();

        // Create Pane 2 with a single Row
        Row row2 = new Row.Builder().setTitle("Título row2").addText("Texto row2 Aqui").build();
        PaneTemplate template2 = new PaneTemplate.Builder(new Pane.Builder().addRow(row2).build()).setTitle("This is Pane 2").build();

        // Create Pane 3 with a single Row
        Row row3 = new Row.Builder().setTitle("Título row3").addText("Texto row3 Aqui").build();
        PaneTemplate template3 = new PaneTemplate.Builder(new Pane.Builder().addRow(row1).addRow(row2).addRow(row3).build()).setTitle("This is Pane 3").build();


        return template3;
    }
}
