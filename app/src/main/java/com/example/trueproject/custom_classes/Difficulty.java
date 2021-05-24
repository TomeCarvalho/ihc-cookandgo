package com.example.trueproject.custom_classes; //

public enum Difficulty {
    EASY("Fácil",0),
    MEDIUM("Média",1),
    HARD("Difícil",2);

    private String name;
    private int val;

    private Difficulty(String name, int val) {
        this.name = name;
        this.val = val;
    }
    public String getName(){return name;}
    public int getVal() {
        return val;
    }
}