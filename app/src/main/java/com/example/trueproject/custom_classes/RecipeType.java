package com.example.trueproject.custom_classes; //

public enum RecipeType {
	MEAT("Carne"),
	PASTA("Massas"),
	FISH("Peixe"),
	DESSERT("Sobremesas"),
	VEGETARIAN("Vegetariano");

	private String name;
	private boolean selected;

	private RecipeType(String name) {
		this.name = name;
	}

	public void setSelected(boolean v) {
		selected = v;
	}

	public boolean isSelected() {
		return selected;
	}

	@Override
	public String toString() {
		return name;
	}
}