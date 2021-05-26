package com.example.trueproject.custom_classes; //

public class IngredientQuantity {
	private Ingredient ingredient;
	private double quantity;

	public IngredientQuantity(Ingredient ingredient, double quantity) {
		this.ingredient = ingredient;
		this.quantity = round(quantity, 2);
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double q) {
		quantity = q;
	}

	public void addQuantity(double amount) {
		quantity += amount;
	}

	public IngredientQuantity getForNMeals (int nMeals) {
		return new IngredientQuantity(ingredient, quantity * nMeals);
	}

	@Override
	public String toString() {
		return String.format("%s: %f%s", ingredient, quantity, ingredient.getUnit());
	}

	private static double round(double value, int places) {
		if (places < 0) throw new IllegalArgumentException();
		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}
}