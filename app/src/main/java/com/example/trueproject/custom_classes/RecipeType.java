package com.example.trueproject.custom_classes;

enum RecipeType {
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