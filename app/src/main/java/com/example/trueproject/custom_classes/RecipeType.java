package com.example.trueproject.custom_classes;

public enum RecipeType {
	MEAT("carne"),
	FISH("peixe"),
	PASTA("massas"),
	DESSERT("sobremesas"),
	VEGETARIAN("vegetariano");

	private String name;

	private RecipeType(String name) {
		this.name = name;
	}
}