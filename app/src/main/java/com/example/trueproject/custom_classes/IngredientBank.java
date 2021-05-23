package com.example.trueproject.custom_classes;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class IngredientBank {
	private static Map<Integer, Ingredient> m = new HashMap<>();

	static {
		// "database" goes here (put ingredients into map)
		m.put(1, new Ingredient(1, "carne de porco aos cubos", false));
		m.put(2, new Ingredient(2, "dentes de alho", true));
		m.put(3, new Ingredient(3, "folhas de louro", true));
		m.put(4, new Ingredient(4, "massa de pimentão", true));
		m.put(5, new Ingredient(5, "vinho branco", true));
		m.put(6, new Ingredient(6, "sal", true));
		m.put(7, new Ingredient(7, "azeite", true));
		m.put(8, new Ingredient(8, "amêijoas frescas", false, Allergies.SHELLFISH));
		m.put(9, new Ingredient(9, "coentros picados", true));

		m.put(10, new Ingredient(10, "dourada Costa da Madeira", false));
		m.put(11, new Ingredient(11, "mostarda", true));
		m.put(12, new Ingredient(12, "limão", true));
		m.put(13, new Ingredient(13, "salsa picada", true));
		m.put(14, new Ingredient(14, "batatas médias para cozer", true));
		m.put(15, new Ingredient(15, "bimis", true));
		m.put(16, new Ingredient(16, "tomate", true));
		m.put(17, new Ingredient(17, "manjericão", true));

		m.put(18, new Ingredient(18, "pimenta-de-caiena", true));
		m.put(19, new Ingredient(19, "sementes de sésamo", true));
		m.put(20, new Ingredient(20, "sementes de chia", true));
		m.put(21, new Ingredient(21, "lombo de atum", false));
		m.put(22, new Ingredient(22, "tagliatelle", true));
		m.put(23, new Ingredient(23, "spaghetti courgette", true));
		m.put(24, new Ingredient(24, "rúcula", true));
		m.put(25, new Ingredient(25, "tomate cherry", true));

		m.put(26, new Ingredient(26, "massa esparguete sem glúten", true));
		m.put(27, new Ingredient(27, "molho pesto", true));
		m.put(28, new Ingredient(28, "burrata com leite de búfala", true));
		m.put(29, new Ingredient(29, "mix de pimentas", true));

		m.put(30, new Ingredient(30, "amido de milho", true));
		m.put(31, new Ingredient(31, "bebida vegetal de soja", true));
		m.put(32, new Ingredient(32, "açúcar", true));
		m.put(33, new Ingredient(33, "gemas M", true));
		m.put(34, new Ingredient(34, "essência de baunilha", true));
		m.put(35, new Ingredient(35, "morangos", true));
		m.put(36, new Ingredient(36, "bolacha Maria sem glúten", true));
		m.put(37, new Ingredient(37, "coco ralado", true));
		m.put(38, new Ingredient(38, "hortelã", true));

		m.put(39, new Ingredient(39, "cuscuz", true));
		m.put(40, new Ingredient(40, "cenoura", true));
		m.put(41, new Ingredient(41, "cebola-roxa", true));
		m.put(42, new Ingredient(42, "tomilho", true));
		m.put(43, new Ingredient(43, "pimenta preta", true));
		m.put(44, new Ingredient(44, "beterraba", true));
		m.put(45, new Ingredient(45, "queijo halloumi", true));
	}

	public static Ingredient get(int id) {
		return m.get(id);
	}

	public static Collection<Ingredient> getAllIngredients() {
		return m.values();
	}
}