package com.example.trueproject.custom_classes; //

public class IngredientQuantity {
	private Ingredient ingredient;
	private double quantity;
	// private Unit unit;

	public IngredientQuantity(Ingredient ingredient, double quantity) {
		this.ingredient = ingredient;
		this.quantity = quantity;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public double getQuantity() {
		return quantity;
	}

//	public Unit getUnit() {
//		return unit;
//	}

	@Override
	public String toString() {
		return String.format("%s: %f%s", ingredient, quantity, ingredient.getUnit());
	}
}