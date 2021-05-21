package com.example.trueproject.custom_classes;

import java.util.Map;
import java.util.HashMap;

class IngredientBank {
	private static Map<Integer, Ingredient> m = new HashMap<>();

	static {
		// "database" goes here (put ingredients into map)
		m.put(1, new Ingredient(1, "carne de porco aos cubos"));
		m.put(2, new Ingredient(2, "dentes de alho picado"));
		m.put(3, new Ingredient(3, "folhas de louro"));
		m.put(4, new Ingredient(4, "massa de pimentão"));
		m.put(5, new Ingredient(5, "vinho branco"));
		m.put(6, new Ingredient(6, "sal"));
		m.put(7, new Ingredient(7, "azeite"));
		m.put(8, new Ingredient(8, "amêijoas frescas"));
		m.put(9, new Ingredient(9, "coentros picados"));
	}

	public static Ingredient get(int id) {
		return m.get(id);
	}
}