package com.example.trueproject.custom_classes;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class RecipeBank {
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
                        new IngredientQuantity(IngredientBank.get(1), 800 / 4.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(2), 3 / 4.0, Unit.UNIT),
                        new IngredientQuantity(IngredientBank.get(3), 1 / 4.0, Unit.UNIT),
                        new IngredientQuantity(IngredientBank.get(4), 1 / 4.0, Unit.UNIT),
                        new IngredientQuantity(IngredientBank.get(5), 2.5 / 4.0, Unit.DL),
                        new IngredientQuantity(IngredientBank.get(6), 2.5 / 4.0, Unit.SPOON_TEA),
                        new IngredientQuantity(IngredientBank.get(7), 100 / 4.0, Unit.ML),
                        new IngredientQuantity(IngredientBank.get(8), 500 / 4.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(9), 2 / 4.0, Unit.SPOON_SOUP)
                },
                600, // calorias: não diz no site do pingo doce
                RecipeType.MEAT,
                Difficulty.EASY,
                new Time(30),
                new Time(2, 0)
        ));
        m.put(2, new Recipe(
                2,
                "Dourada braseada com molho de salsa",
                "A dourada braseada da Costa da Madeira tem um sabor único e o molho de salsa torna-a ainda mais especial. Uma refeição muito saudável e nutritiva, que não vai querer perder.",
                "1. Salpique os lombos das douradas de ambos os lados com meia colher de chá desal. Barre o lado sem pele com a mostarda e salpique com raspa do limão. Regue com uma colher de sopa do sumo de limão e polvilhe com metade da salsa."
                        + "\n2. Entretanto, lave muito bem as batatas e coza-as num tacho com água temperada com o restante sal. Passados cerca de 10 minutos de as batatas estarem a ferver, introduza os bimis e coza com o tacho destapado durante mais 10 minutos."
                        + "\n3. Corte o tomate em meias-luas."
                        + "\n4. Aqueça muito bem metade do azeite numa frigideira larga antiaderente. Introduza os lombos de dourada com a pele virada para baixo e cozinhe durante 2 minutos sobre lume forte até a pele estar dourada e crocante. Volte cuidadosamente o peixe, e cozinhe mais 1 a 2 minutos."
                        + "\n5. Retire o peixe com cuidado, limpe a frigideira com papel de cozinha e leve de novo ao lume com o vinho branco. Ferva durante 3 a 4 minutos sobre lume forte até reduzir um pouco. Adicione o restante azeite, ferva durante mais 1 minuto, retire do lume e junte a restante salsa picada."
                        + "\n6. Corte as batatas em rodelas, misture-as com os bimis e o tomate e salpique com folhas de manjericão fresco. Por cima coloque os lombos de peixe, com a pele virada para baixo, e regue com o molho de vinho e salsa.",
                new IngredientQuantity[]{
                    new IngredientQuantity(IngredientBank.get(10), 800 / 4.0, Unit.G),
                    new IngredientQuantity(IngredientBank.get(6), 2 / 4.0, Unit.SPOON_TEA),
                    new IngredientQuantity(IngredientBank.get(11), 1 / 4.0, Unit.SPOON_TEA),
                    new IngredientQuantity(IngredientBank.get(12), 1 / 4.0, Unit.UNIT),
                    new IngredientQuantity(IngredientBank.get(13), 2 / 4.0, Unit.SPOON_SOUP),
                    new IngredientQuantity(IngredientBank.get(14), 600 / 4.0, Unit.G),
                    new IngredientQuantity(IngredientBank.get(15), 250 / 4.0, Unit.G),
                    new IngredientQuantity(IngredientBank.get(7), 2 / 4.0, Unit.SPOON_SOUP),
                    new IngredientQuantity(IngredientBank.get(16), 200 / 4.0, Unit.G),
                    new IngredientQuantity(IngredientBank.get(5), 50 / 4.0, Unit.ML),
                    new IngredientQuantity(IngredientBank.get(17), 0, Unit.ENOUGH)
                },
                400,
                RecipeType.FISH,
                Difficulty.EASY,
                new Time(25),
                new Time(0)
        ));
        m.put(3, new Recipe(
                3,
                "Atum grelhado com sementes",
                "Impressione com as cores e texturas deste atum grelhado com sementes. Levemente braseado, acompanha com massa e legumes, numa fusão de sabores completos.",
                "1. Misture a salsa e os coentros com a pimenta, as sementes de sésamo e de chia, o azeite, o sumo do limão e a colher de chá de sal."
                        + "\n2. Cubra os bifes de atum de ambos os lados com esta mistura."
                        + "\n3. Leve um tacho ao lume com água temperada com o restante sal e quando ferver introduza a massa e o spaghetti de courgette."
                        + "\n4. Ferva cerca de 3 minutos, escorra e misture com a rúcula num recipiente"
                        + "\n5. Aqueça bem um grelhador e introduza os bifes de atum e o tomate."
                        + "\n6. Grelhe os bifes 2 a 3 minutos de cada lado, em lume médio/forte (devem ficar bem rosados no interior)."
                        + "\n7. Retire cuidadosamente os bifes de atum para uma tábua e deixe-os repousar 1 minuto."
                        + "\n8. Junte o tomate e o molho que ficou no grelhador à massa e envolva bem."
                        + "\n9. Corte o atum em tiras com cerca de um dedo de espessura e sirva com a massa.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(13), 3 / 6.0, Unit.SPOON_SOUP),
                        new IngredientQuantity(IngredientBank.get(9), 3 / 6.0, Unit.SPOON_SOUP),
                        new IngredientQuantity(IngredientBank.get(18), 1 / 6.0, Unit.SPOON_COFFEE),
                        new IngredientQuantity(IngredientBank.get(19), 1 / 6.0, Unit.SPOON_TEA),
                        new IngredientQuantity(IngredientBank.get(20), 1 / 6.0, Unit.SPOON_DESSERT),
                        new IngredientQuantity(IngredientBank.get(7), 1 / 6.0, Unit.SPOON_SOUP),
                        new IngredientQuantity(IngredientBank.get(12), 0.5 / 6.0, Unit.UNIT),
                        new IngredientQuantity(IngredientBank.get(6), 1 / 6.0, Unit.SPOON_SOUP),
                        new IngredientQuantity(IngredientBank.get(21), 600 / 6.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(22), 500 / 6.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(23), 300 / 6.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(24), 100 / 6.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(25), 100 / 6.0, Unit.G)
                },
                400,
                RecipeType.FISH,
                Difficulty.MEDIUM,
                new Time(25),
                new Time(0)
        ));
        m.put(4, new Recipe(
                4,
                "Esparguete com pesto e burrata",
                "Prepare este esparguete com pesto e burrata, uma refeição sem glúten, simples e saborosa. Com rúcula, tomate cherry e manjericão. Bom apetite!",
                "1. Cozinhe o esparguete conforme as instruções da embalagem, com o sal."
                        + "\n2. Escorra a massa, coloque-a numa taça e adicione-lhe o pesto, metade da rúcula e o tomate cru. Misture."
                        + "\n3. Sirva a massa com as burratas, a restante rúcula e tempere a gosto com a pimenta. Decore com folhas de manjericão. Regue com o azeite.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(26), 400 / 6.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(6), 1 / 6.0, Unit.SPOON_TEA),
                        new IngredientQuantity(IngredientBank.get(25), 300 / 6.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(27), 3 / 6.0, Unit.SPOON_SOUP),
                        new IngredientQuantity(IngredientBank.get(24), 100 / 6.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(28), 3 / 6.0, Unit.UNIT),
                        new IngredientQuantity(IngredientBank.get(29), 0, Unit.ENOUGH),
                        new IngredientQuantity(IngredientBank.get(17), 0, Unit.ENOUGH),
                        new IngredientQuantity(IngredientBank.get(7), 1 / 6.0, Unit.SPOON_TEA)
                },
                473,
                RecipeType.PASTA,
                Difficulty.EASY,
                new Time(15),
                new Time(0)
        ));
        m.put(5, new Recipe(
                5,
                "Copos de bolacha, morango e coco.",
                "De aspecto guloso, estes copos de bolacha são surpreendentemente simples de fazer. Surpreenda num almoço entre amigos com esta deliciosa sobremesa. 1 dose = 1 copo.",
                "1. Dissolva o amido de milho num pouco de bebida vegetal morna."
                        + "\n2. Coloque a restante bebida vegetal num tacho, adicione o açúcar, as gemas batidas e o amido de milho dissolvido."
                        + "\n3. Junte a essência de baunilha e a casca de limão. Leve ao lume, mexendo constantemente até que a mistura fique espessa, e cozinhe por 2 minutos."
                        + "\n4. Retire a casca de limão e deite o creme para uma taça, deixando que arrefeça."
                        + "\n5. Entretanto, corte os morangos em pedaços para uma taça e triture as bolachas."
                        + "\n6. Nos copos, faça camadas de bolacha, morango, creme e coco ralado, reservando algum para decorar. Leve ao frio até servir."
                        + "\n7. Antes de servir, decore cada copo com o coco reservado e folhas de hortelã.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(30), 65 / 8.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(31), 1 / 8.0, Unit.L),
                        new IngredientQuantity(IngredientBank.get(32), 100 / 8.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(33), 3 / 8.0, Unit.UNIT),
                        new IngredientQuantity(IngredientBank.get(34), 1 / 8.0, Unit.SPOON_TEA),
                        new IngredientQuantity(IngredientBank.get(12), 1 / 8.0, Unit.UNIT),
                        new IngredientQuantity(IngredientBank.get(35), 750 / 8.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(36), 230 / 8.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(37), 50 / 8.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(38), 0, Unit.ENOUGH)
                },
                299,
                RecipeType.DESSERT,
                Difficulty.EASY,
                new Time(30),
                new Time(0)
        ));
        m.put(6, new Recipe(
                6,
                "Salada de cuscuz com halloumi grelhado",
                "Originário do Chipre, o queijo halloumi tem vindo a tornar-se cada vez mais popular. Nesta salada de cuscuz, o halloumi grelhado e a beterraba são os protagonistas.",
                "1. Pré-aqueça o forno a 190 °C."
                        + "\n2. Cozinhe o cuscuz conforme as instruções da embalagem e coloque-o no frio para refrescar."
                        + "\n3. Entretanto, descasque e corte a cenoura aos cubos e a cebola em fatias finas."
                        + "\n4. Ponha os legumes num tabuleiro de forno, polvilhe com o alho picado, previamente descascado, metade do sal, tomilho e pimenta a gosto. Regue com uma colher de sopa de azeite e leve ao forno durante 15 minutos."
                        + "\n5. Corte a beterraba e o queijo em fatias finas e grelhe numa placa untada com um pouco do azeite. Reserve."
                        + "\n6. Retire os legumes do forno e envolva-os com o cuscuz. Tempere com o restante sal, tomilho e regue com o azeite."
                        + "\n7. Coloque o cuscuz numa travessa e disponha sobre ele as fatias de beterraba e de queijo."
                        + "\n8. Polvilhe com folhas de hortelã. Sirva com o tomate.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(39), 200 / 4.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(40), 150 / 4.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(41), 100 / 4.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(2), 2 / 4.0, Unit.UNIT),
                        new IngredientQuantity(IngredientBank.get(42), 0, Unit.ENOUGH),
                        new IngredientQuantity(IngredientBank.get(43), 0, Unit.ENOUGH),
                        new IngredientQuantity(IngredientBank.get(7), 3 / 4.0, Unit.SPOON_SOUP),
                        new IngredientQuantity(IngredientBank.get(44), 150 / 4.0, Unit.G),
                        new IngredientQuantity(IngredientBank.get(45), 1 / 4.0, Unit.EMB),
                        new IngredientQuantity(IngredientBank.get(38), 0, Unit.ENOUGH),
                        new IngredientQuantity(IngredientBank.get(16), 200 / 4.0, Unit.G),
                },
                442,
                RecipeType.VEGETARIAN,
                Difficulty.EASY,
                new Time(30),
                new Time(0)
        ));
    }

    public static Collection<Recipe> getAllRecipes() {
        return m.values();
    }

    public static Recipe getRecipe(int id) {
        return m.get(id);
    }
}