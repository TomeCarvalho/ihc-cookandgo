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
		m.put(46, new Ingredient(46, "laranja", true));
		m.put(47, new Ingredient(47, "cominhos", true));
		m.put(48, new Ingredient(48,"costeletas de porco",false));
		m.put(49, new Ingredient(49,"amêndoa laminada",true));
		m.put(50, new Ingredient(50,"alho frânces",true));
		m.put(51, new Ingredient(51,"aipo",true));
		m.put(52, new Ingredient(52,"chalotas",true));
		m.put(53, new Ingredient(53,"couve-coração em juliana grossa",true));
		m.put(54, new Ingredient(54,"água",true));
		m.put(55, new Ingredient(55,"arroz thai jasmine",true));
		m.put(56, new Ingredient(56,"framboesas frescas",true));
		m.put(57, new Ingredient(57,"cebolinho fresco picado",true));
		m.put(58, new Ingredient(58,"perna de cabrito",false));
		m.put(59, new Ingredient(59,"colorau",true));
		m.put(60, new Ingredient(60,"alho em pó",true));
		m.put(61, new Ingredient(61,"mostarda em grão",true));
		m.put(62, new Ingredient(62,"mel",true));
		m.put(63, new Ingredient(63,"alecrim",true));
		m.put(64, new Ingredient(64,"pinhões",true));
		m.put(65, new Ingredient(65,"malagueta",true));
		m.put(66, new Ingredient(66,"salongo",false));
		m.put(67, new Ingredient(67, "cebola", true));
		m.put(68, new Ingredient(68, "filete de peixe-espada-preto", false));
		m.put(69, new Ingredient(69, "pão de cereais ancestrais", true));
		m.put(70, new Ingredient(70, "azeitonas pretas em rodelas", true));
		m.put(71, new Ingredient(71, "vinagre", true));
		m.put(72, new Ingredient(72, "ovo", true));
		m.put(73, new Ingredient(73, "puré de batata", true));
		m.put(74, new Ingredient(74, "espinafres", true));
		m.put(75, new Ingredient(75, "alface iceberg", true));
		m.put(76, new Ingredient(76, "lima", true));
		m.put(77, new Ingredient(77, "molho de escabeche", true));
		m.put(78, new Ingredient(78, "feijão-verde", true));
		m.put(79, new Ingredient(79, "molho agridoce", true));
		m.put(80, new Ingredient(80, "gengibre picado", true));
		m.put(81, new Ingredient(81, "lombos de salmão", false));
		m.put(82, new Ingredient(82, "polvo fresco", false));
		m.put(83, new Ingredient(83, "pão saloio em fatias", true));
		m.put(84, new Ingredient(84, "melancia", true));
		m.put(85, new Ingredient(85, "kiwi", true));
		m.put(86, new Ingredient(86, "flor de sal", true));
		m.put(87, new Ingredient(87, "massa quebrada refrigerada", true));
		m.put(88, new Ingredient(88, "orégãos secos", true));
		m.put(89, new Ingredient(89, "queijo mozzarella", true));
		m.put(90, new Ingredient(90, "salada camponesa com tomate cherry", true));
		m.put(91, new Ingredient(91, "açúcar amarelo", true));
		m.put(92, new Ingredient(92, "manteiga", true));
		m.put(93, new Ingredient(93, "manteiga de amendoim", true));
		m.put(94, new Ingredient(94, "farinha", true));
		m.put(95, new Ingredient(95, "bicarbonato de sódio", true));



	}

	public static Ingredient get(int id) {
		return m.get(id);
	}

	public static Collection<Ingredient> getAllIngredients() {
		return m.values();
	}
}