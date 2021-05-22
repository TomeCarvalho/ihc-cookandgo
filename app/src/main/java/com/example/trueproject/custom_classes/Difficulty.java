package com.example.trueproject.custom_classes;

public enum Difficulty {
    EASY("Fácil"),
    MEDIUM("Média"),
    HARD("Difícil");

    private String name;

    private Difficulty(String name) {
        this.name = name;
    }
}