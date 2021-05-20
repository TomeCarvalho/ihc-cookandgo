import java.util.Map;
import java.util.HashMap;

class RecipeBank {
	private static Map<Integer, Recipe> m = new HashMap<>();

	static {
		m.put(1, new Recipe(
			1,
			"Carne de porco à alentejana",
			"Sabia que este prato foi criado no Algarve? Parece que o cozinheiro que o inventou deu-lhe este nome porque a carne usada era de porco alentejano. Independentemente da região do país onde vive, siga a nossa receita e prepare este clássico em sua casa.",
			"1. Numa taça, tempere a carne com os alhos, o louro, a massa de pimentão, 1.5 colheres de chá de sal e o vinho branco. Deixe marinar durante 60 minutos."
			+ "\n2. Coloque as amêijoas em água com 1 colher de chá de sal durante os 60 minutos para perderem a areia, lavando-as bem de seguida em água corrente."
			+ "\n3. Numa frigideira, coloque o azeite a aquecer."
			+ "\n4. Quando estiver quente frite a carne, mexendo de vez em quando até alourar."
			+ "\n5. Junte o líquido da marinada e deixe ferver."
			+ "\n6. De seguida, acrescente as amêijoas, mexa e tape a frigideira para que as conchas abram durante 2 minutos."
			+ "\n7. Sirva com os coentros picados e acompanhado de batata frita aos cubos.",
			new IngredientQuantity[]{
				new IngredientQuantity(IngredientBank.get(1), 800, Unit.G),
				new IngredientQuantity(IngredientBank.get(2), 3, Unit.UNIT),
				new IngredientQuantity(IngredientBank.get(3), 1, Unit.UNIT),
				new IngredientQuantity(IngredientBank.get(4), 1, Unit.UNIT),
				new IngredientQuantity(IngredientBank.get(5), 2.5, Unit.DL),
				new IngredientQuantity(IngredientBank.get(6), 2.5, Unit.SPOON_TEA),
				new IngredientQuantity(IngredientBank.get(7), 100, Unit.ML),
				new IngredientQuantity(IngredientBank.get(8), 500, Unit.G),
				new IngredientQuantity(IngredientBank.get(9), 2, Unit.SPOON_SOUP)
			},
			500 // calorias: não diz no site do pingo doce
		));
	}

	public static Recipe getRecipe(int id) {
		return m.get(id);
	}
}