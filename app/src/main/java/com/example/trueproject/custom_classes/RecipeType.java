package com.example.trueproject.custom_classes; //

public enum RecipeType {
	MEAT("Carne"),
	PASTA("Massas"),
	FISH("Peixe"),
	DESSERT("Sobremesas"),
	VEGETARIAN("Vegetariano");

	private String name;

	private RecipeType(String name) {
		this.name = name;
	}
}