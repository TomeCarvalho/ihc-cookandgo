package com.example.trueproject.custom_classes; //

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class IngredientBank {
	private static Map<Integer, Ingredient> m = new HashMap<>();

	static {
		// "database" goes here (put ingredients into map)
		m.put(1, new Ingredient(1, "carne de porco aos cubos", false, Unit.G));
		m.put(2, new Ingredient(2, "dentes de alho", true, Unit.UNIT));
		m.put(3, new Ingredient(3, "folhas de louro", true, Unit.UNIT));
		m.put(4, new Ingredient(4, "massa de pimentão", true, Unit.SPOON_SOUP));
		m.put(5, new Ingredient(5, "vinho branco", true, Unit.DL));
		m.put(6, new Ingredient(6, "sal", true, Unit.SPOON_TEA));
		m.put(7, new Ingredient(7, "azeite", true, Unit.ML));
		m.put(8, new Ingredient(8, "amêijoas frescas", false, Unit.G, Allergies.SHELLFISH));
		m.put(9, new Ingredient(9, "coentros picados", true, Unit.SPOON_SOUP));

		m.put(10, new Ingredient(10, "dourada Costa da Madeira", false, Unit.G));
		m.put(11, new Ingredient(11, "mostarda", true, Unit.SPOON_TEA));
		m.put(12, new Ingredient(12, "limão", true, Unit.UNIT));
		m.put(13, new Ingredient(13, "salsa picada", true, Unit.SPOON_SOUP));
		m.put(14, new Ingredient(14, "batatas médias para cozer", true, Unit.G));
		m.put(15, new Ingredient(15, "bimis", true, Unit.G));
		m.put(16, new Ingredient(16, "tomate", true, Unit.G));
		m.put(17, new Ingredient(17, "manjericão", true, Unit.ENOUGH));

		m.put(18, new Ingredient(18, "pimenta-de-caiena", true, Unit.SPOON_COFFEE));
		m.put(19, new Ingredient(19, "sementes de sésamo", true, Unit.SPOON_SOUP));
		m.put(20, new Ingredient(20, "sementes de chia", true, Unit.SPOON_DESSERT));
		m.put(21, new Ingredient(21, "lombo de atum", false, Unit.G));
		m.put(22, new Ingredient(22, "tagliatelle", true, Unit.G));
		m.put(23, new Ingredient(23, "spaghetti courgette", true, Unit.G));
		m.put(24, new Ingredient(24, "rúcula", true, Unit.G));
		m.put(25, new Ingredient(25, "tomate cherry", true, Unit.G));

		m.put(26, new Ingredient(26, "massa esparguete sem glúten", true, Unit.G));
		m.put(27, new Ingredient(27, "molho pesto", true, Unit.SPOON_SOUP));
		m.put(28, new Ingredient(28, "burrata com leite de búfala", true, Unit.UNIT));
		m.put(29, new Ingredient(29, "mix de pimentas", true, Unit.ENOUGH));

		m.put(30, new Ingredient(30, "amido de milho", true, Unit.G));
		m.put(31, new Ingredient(31, "bebida vegetal de soja", true, Unit.L));
		m.put(32, new Ingredient(32, "açúcar", true, Unit.G));
		m.put(33, new Ingredient(33, "gemas M", true, Unit.UNIT));
		m.put(34, new Ingredient(34, "essência de baunilha", true, Unit.SPOON_TEA));
		m.put(35, new Ingredient(35, "morangos", true, Unit.G));
		m.put(36, new Ingredient(36, "bolacha Maria sem glúten", true, Unit.G));
		m.put(37, new Ingredient(37, "coco ralado", true, Unit.G));
		m.put(38, new Ingredient(38, "hortelã", true, Unit.ENOUGH));

		m.put(39, new Ingredient(39, "cuscuz", true, Unit.G));
		m.put(40, new Ingredient(40, "cenoura", true, Unit.G));
		m.put(41, new Ingredient(41, "cebola-roxa", true, Unit.G));
		m.put(42, new Ingredient(42, "tomilho", true, Unit.ENOUGH));
		m.put(43, new Ingredient(43, "pimenta preta", true, Unit.ENOUGH));
		m.put(44, new Ingredient(44, "beterraba", true, Unit.G));
		m.put(45, new Ingredient(45, "queijo halloumi", true, Unit.EMB));

		m.put(46, new Ingredient(46, "laranja", true, Unit.G));
		m.put(47, new Ingredient(47, "cominhos", true, Unit.SPOON_COFFEE));
		m.put(48, new Ingredient(48, "costeletas de porco", false, Unit.G));
		m.put(49, new Ingredient(49, "amêndoa laminada", true, Unit.SPOON_SOUP));
		m.put(50, new Ingredient(50, "alho frânces", true, Unit.G));
		m.put(51, new Ingredient(51, "aipo", true, Unit.G));
		m.put(52, new Ingredient(52, "chalotas", true, Unit.G));
		m.put(53, new Ingredient(53, "couve-coração em juliana grossa",true, Unit.G));
		m.put(54, new Ingredient(54, "água", true, Unit.ML));
		m.put(55, new Ingredient(55, "arroz thai jasmine", true, Unit.G));
		m.put(56, new Ingredient(56, "framboesas frescas", true, Unit.G));
		m.put(57, new Ingredient(57, "cebolinho fresco picado", true, Unit.SPOON_SOUP));

		m.put(58, new Ingredient(58, "perna de cabrito", false, Unit.KG));
		m.put(59, new Ingredient(59, "colorau", true, Unit.SPOON_SOUP));
		m.put(60, new Ingredient(60, "alho em pó", true, Unit.ENOUGH));
		m.put(61, new Ingredient(61, "mostarda em grão", true, Unit.SPOON_SOUP));
		m.put(62, new Ingredient(62, "mel", true, Unit.SPOON_SOUP));
		m.put(63, new Ingredient(63, "alecrim", true, Unit.SPOON_SOUP));
		m.put(64, new Ingredient(64, "pinhões", true, Unit.G));
		m.put(65, new Ingredient(65, "malagueta", true, Unit.UNIT));

		m.put(66, new Ingredient(66, "salongo", false, Unit.KG));
		m.put(67, new Ingredient(67, "cebola", true, Unit.UNIT));
		m.put(68, new Ingredient(68, "filete de peixe-espada-preto", false, Unit.G));
		m.put(69, new Ingredient(69, "pão de cereais ancestrais", true, Unit.G));
		m.put(70, new Ingredient(70, "azeitonas pretas em rodelas", true, Unit.G));
		m.put(71, new Ingredient(71, "vinagre", true, Unit.SPOON_SOUP));
		m.put(72, new Ingredient(72, "ovo", true, Unit.UNIT));
		m.put(73, new Ingredient(73, "puré de batata", true, Unit.EMB));
		m.put(74, new Ingredient(74, "espinafres", true, Unit.G));
		m.put(75, new Ingredient(75, "alface iceberg", true, Unit.G));

		m.put(76, new Ingredient(76, "lima", true, Unit.UNIT));
		m.put(77, new Ingredient(77, "molho de escabeche", true, Unit.UNIT));
		m.put(78, new Ingredient(78, "feijão-verde", true, Unit.G));

		m.put(79, new Ingredient(79, "molho agridoce", true, Unit.SPOON_SOUP));
		m.put(80, new Ingredient(80, "gengibre picado", true, Unit.SPOON_SOUP));
		m.put(81, new Ingredient(81, "lombos de salmão", false, Unit.G));

		m.put(82, new Ingredient(82, "polvo fresco", false, Unit.KG));
		m.put(83, new Ingredient(83, "pão saloio em fatias", true, Unit.G));

		m.put(84, new Ingredient(84, "melancia", true, Unit.G));
		m.put(85, new Ingredient(85, "kiwi", true, Unit.G));

		m.put(86, new Ingredient(86, "flor de sal", true, Unit.SPOON_COFFEE));
		m.put(87, new Ingredient(87, "massa quebrada refrigerada", true, Unit.EMB));
		m.put(88, new Ingredient(88, "orégãos secos", true, Unit.SPOON_DESSERT));
		m.put(89, new Ingredient(89, "queijo mozzarella", true, Unit.G));

		m.put(90, new Ingredient(90, "salada camponesa com tomate cherry", true, Unit.G));

		m.put(91, new Ingredient(91, "açúcar amarelo", true, Unit.G));
		m.put(92, new Ingredient(92, "manteiga", true, Unit.G));
		m.put(93, new Ingredient(93, "manteiga de amendoim", true, Unit.G));
		m.put(94, new Ingredient(94, "farinha", true, Unit.G));
		m.put(95, new Ingredient(95, "bicarbonato de sódio", true, Unit.SPOON_TEA));
	}

	public static Collection<Ingredient> getAllIngredients() {
		return m.values();
	}

	public static Ingredient get(int id) {
		return m.get(id);
	}
}