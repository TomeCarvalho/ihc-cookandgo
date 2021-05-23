package com.example.trueproject.ui;

import com.example.trueproject.custom_classes.Unit;

public class IngredientsView {

    private String name;
    private String quantity; // id do texto quantidade
    //private String changeBy;
    //private String minus;
    //private String plus;
    private Unit unit;

    public IngredientsView(String nameID, String quantityID, Unit unit) { //String changeByID, String minusID, String plusID, Unit unit) {
        quantity = quantityID; //changeBy = changeByID; minus = minusID; plus = plusID;
        name = nameID; this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public Unit getUnit() {
        return unit;
    }

    public String getQuantity() {
        return quantity;
    }

    /*
    public String getChangeBy() {
        return changeBy;
    }

    public String getMinus() {
        return minus;
    }

    public String getPlus() {
        return plus;
    }
    */

}
