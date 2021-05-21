package com.example.trueproject.custom_classes;

import java.util.Set;
import java.util.HashSet;

class Recipe {
	private int id;
	private String name;
	private String description;
	private String preparation;
	private IngredientQuantity[] ingredientQuantities;
	private int calories;

	public Recipe(int id, String name, String description, String preparation, IngredientQuantity[] ingredientQuantities, int calories) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.preparation = preparation;
		this.ingredientQuantities = ingredientQuantities;
		this.calories = calories;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getPreparation() {
		return preparation;
	}

	public IngredientQuantity[] getIngredientQuantities() {
		return ingredientQuantities;
	}

	public int getCalories() {
		return calories;
	}

	public Set<Allergies> getAllergies() {
		Set<Allergies> allergies = new HashSet<>();
		for (IngredientQuantity i : ingredientQuantities)
			allergies.add(i.getIngredient().getAllergy());
		return allergies;
	}

	public String ingredientQuantitiesStr() {
		String str = "";
		for (IngredientQuantity i : ingredientQuantities)
			str += i + "\n";
		str = str.substring(0, str.length() - 1);
		return str;
	}
}