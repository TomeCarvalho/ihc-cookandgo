package com.example.trueproject.custom_classes;

class IngredientQuantity {
	private Ingredient ingredient;
	private double quantity;
	private Unit unit;

	public IngredientQuantity(Ingredient ingredient, double quantity, Unit unit) {
		this.ingredient = ingredient;
		this.quantity = quantity;
		this.unit = unit;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public double getQuantity() {
		return quantity;
	}

	public Unit getUnit() {
		return unit;
	}

	@Override
	public String toString() {
		return String.format("%s: %f%s", ingredient, quantity, unit);
	}
}