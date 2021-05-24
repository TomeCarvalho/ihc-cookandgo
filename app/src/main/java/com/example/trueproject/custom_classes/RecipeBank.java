package com.example.trueproject.custom_classes; //

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
                        new IngredientQuantity(IngredientBank.get(1), 800 / 4.0),
                        new IngredientQuantity(IngredientBank.get(2), 3 / 4.0),
                        new IngredientQuantity(IngredientBank.get(3), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(4), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(5), 2.5 / 4.0),
                        new IngredientQuantity(IngredientBank.get(6), 2.5 / 4.0),
                        new IngredientQuantity(IngredientBank.get(7), 100 / 4.0),
                        new IngredientQuantity(IngredientBank.get(8), 500 / 4.0),
                        new IngredientQuantity(IngredientBank.get(9), 2 / 4.0)
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
                        new IngredientQuantity(IngredientBank.get(10), 800 / 4.0),
                        new IngredientQuantity(IngredientBank.get(6), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(11), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(12), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(13), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(14), 600 / 4.0),
                        new IngredientQuantity(IngredientBank.get(15), 250 / 4.0),
                        new IngredientQuantity(IngredientBank.get(7), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(16), 200 / 4.0),
                        new IngredientQuantity(IngredientBank.get(5), 50 / 4.0),
                        new IngredientQuantity(IngredientBank.get(17), 0)
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
                        new IngredientQuantity(IngredientBank.get(13), 3 / 6.0),
                        new IngredientQuantity(IngredientBank.get(9), 3 / 6.0),
                        new IngredientQuantity(IngredientBank.get(18), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(19), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(20), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(7), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(12), 0.5 / 6.0),
                        new IngredientQuantity(IngredientBank.get(6), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(21), 600 / 6.0),
                        new IngredientQuantity(IngredientBank.get(22), 500 / 6.0),
                        new IngredientQuantity(IngredientBank.get(23), 300 / 6.0),
                        new IngredientQuantity(IngredientBank.get(24), 100 / 6.0),
                        new IngredientQuantity(IngredientBank.get(25), 100 / 6.0)
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
                        new IngredientQuantity(IngredientBank.get(26), 400 / 6.0),
                        new IngredientQuantity(IngredientBank.get(6), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(25), 300 / 6.0),
                        new IngredientQuantity(IngredientBank.get(27), 3 / 6.0),
                        new IngredientQuantity(IngredientBank.get(24), 100 / 6.0),
                        new IngredientQuantity(IngredientBank.get(28), 3 / 6.0),
                        new IngredientQuantity(IngredientBank.get(29), 0),
                        new IngredientQuantity(IngredientBank.get(17), 0),
                        new IngredientQuantity(IngredientBank.get(7), 1 / 6.0)
                },
                473,
                RecipeType.PASTA,
                Difficulty.EASY,
                new Time(15),
                new Time(0)
        ));
        m.put(5, new Recipe(
                5,
                "Copos de bolacha, morango e coco",
                "De aspecto guloso, estes copos de bolacha são surpreendentemente simples de fazer. Surpreenda num almoço entre amigos com esta deliciosa sobremesa. 1 dose = 1 copo.",
                "1. Dissolva o amido de milho num pouco de bebida vegetal morna."
                        + "\n2. Coloque a restante bebida vegetal num tacho, adicione o açúcar, as gemas batidas e o amido de milho dissolvido."
                        + "\n3. Junte a essência de baunilha e a casca de limão. Leve ao lume, mexendo constantemente até que a mistura fique espessa, e cozinhe por 2 minutos."
                        + "\n4. Retire a casca de limão e deite o creme para uma taça, deixando que arrefeça."
                        + "\n5. Entretanto, corte os morangos em pedaços para uma taça e triture as bolachas."
                        + "\n6. Nos copos, faça camadas de bolacha, morango, creme e coco ralado, reservando algum para decorar. Leve ao frio até servir."
                        + "\n7. Antes de servir, decore cada copo com o coco reservado e folhas de hortelã.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(30), 65 / 8.0),
                        new IngredientQuantity(IngredientBank.get(31), 1 / 8.0),
                        new IngredientQuantity(IngredientBank.get(32), 100 / 8.0),
                        new IngredientQuantity(IngredientBank.get(33), 3 / 8.0),
                        new IngredientQuantity(IngredientBank.get(34), 1 / 8.0),
                        new IngredientQuantity(IngredientBank.get(12), 1 / 8.0),
                        new IngredientQuantity(IngredientBank.get(35), 750 / 8.0),
                        new IngredientQuantity(IngredientBank.get(36), 230 / 8.0),
                        new IngredientQuantity(IngredientBank.get(37), 50 / 8.0),
                        new IngredientQuantity(IngredientBank.get(38), 0)
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
                        new IngredientQuantity(IngredientBank.get(39), 200 / 4.0),
                        new IngredientQuantity(IngredientBank.get(40), 150 / 4.0),
                        new IngredientQuantity(IngredientBank.get(41), 100 / 4.0),
                        new IngredientQuantity(IngredientBank.get(2), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(42), 0),
                        new IngredientQuantity(IngredientBank.get(43), 0),
                        new IngredientQuantity(IngredientBank.get(7), 3 / 4.0),
                        new IngredientQuantity(IngredientBank.get(44), 150 / 4.0),
                        new IngredientQuantity(IngredientBank.get(45), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(38), 0),
                        new IngredientQuantity(IngredientBank.get(16), 200 / 4.0),
                },
                442,
                RecipeType.VEGETARIAN,
                Difficulty.EASY,
                new Time(30),
                new Time(0)
        ));
        m.put(7, new Recipe(7,
                "Costeletas de porco com couve e amêndoa",
                "Preparada com carne nacional, esta receita de costeletas de porco com couve e amêndoa é deliciosa e de confecção simples. Experimente e bom apetite!",
                "1. Misture a raspa da casca da laranja com o dente de alho espremido, os cominhos, uma colher de sopa de azeite, meia colher de café de sal e as folhas de tomilho. Junte duas colheres de sopa de sumo de laranja e tempere as costeletas de porco com esta marinada."
                        +"\n2. Aloure a amêndoa numa frigideira larga antiaderente."
                        +"\n3. Entretanto, corte o alho-francês em rodelas, o talo de aipo em lâminas finas e as chalotas, previamente descascadas, em gomos. Retire a amêndoa da frigideira e deite nela o restante azeite, os legumes preparados e a juliana de couve. Salteie sobre lume médio a forte, mexendo frequentemente durante cerca de 15 a 20 minutos."
                        +"\n4. Ao mesmo tempo ponha um tacho com a água ao lume e quando ferver, tempere com duas colheres de café de sal e introduza o arroz. Tape e coza durante cerca de 12 minutos."
                        +"\n5. Escorra muito bem as costeletas, coloque-as sobre uma chapa para grelhados bem quente, e cozinhe de ambos os lados até estarem bem douradas, à medida que as vai pincelando com a marinada."
                        +"\n6. Tempere os legumes com o restante sal e regue-os com o sumo que restar da laranja, deixe ferver cerca de 1 minuto e retire do lume. Salpique com as amêndoas laminadas e enfeite com as framboesas."
                        +"\n7. Sirva as costeletas com os legumes e com o arroz. Salpique com o cebolinho picado.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(46),1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(2), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(47), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(7), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(6), 3.5 / 4.0),
                        new IngredientQuantity(IngredientBank.get(42), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(48), 500 / 4.0),
                        new IngredientQuantity(IngredientBank.get(49), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(50), 100 / 4.0),
                        new IngredientQuantity(IngredientBank.get(51), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(52), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(53), 300 / 4.0),
                        new IngredientQuantity(IngredientBank.get(54), 400 / 4.0),
                        new IngredientQuantity(IngredientBank.get(55), 200 / 4.0),
                        new IngredientQuantity(IngredientBank.get(56), 100 / 4.0),
                        new IngredientQuantity(IngredientBank.get(57), 2 / 4.0),
                },
                495,
                RecipeType.MEAT,
                Difficulty.EASY,
                new Time(30),
                new Time(0)
        ));

        m.put(8, new Recipe(8,
                "Perna de cabrito com mostarda e pesto de hortelã",
                "Nesta época de receitas de forno, a perna de cabrito com mostarda e pesto de hortelã vai ficar no topo das suas favoritas. O contraste da mostarda com o pesto numa carne tenra e suculenta, tornam este prato irresistível.",
                "1. Pré-aqueça o forno a 190 °C."
                        +"\n2. Tempere a perna de cabrito com o colorau, o alho em pó, o sal, a pimenta."
                        +"\n3. Misture numa taça as mostardas, o mel, o tomilho e o alecrim."
                        +"\n4. Ponha a carne num tabuleiro de forno, barre-a com a mistura anterior e regue com o vinho e duas colheres de sopa de azeite. Deixe marinar por cerca de 1 hora."
                        +"\n5. Prepare o pesto, colocando num robot de cozinha a hortelã, a rúcula, os pinhões, o alho e a malagueta."
                        +"\n6. Adicione o restante azeite e bata bem até obter um molho espesso. Guarde no frio até servir."
                        +"\n7. Leve a carne ao forno durante 1 hora e vá regando sempre que necessário."
                        +"\n8. Sirva com o pesto preparado. Pode acompanhar com a salada verde.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(58), 1.5 / 4.0),
                        new IngredientQuantity(IngredientBank.get(59), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(58), 0),
                        new IngredientQuantity(IngredientBank.get(6), 1/4.0),
                        new IngredientQuantity(IngredientBank.get(29), 0),
                        new IngredientQuantity(IngredientBank.get(11), 1/4.0),
                        new IngredientQuantity(IngredientBank.get(61), 1/4.0),
                        new IngredientQuantity(IngredientBank.get(62), 2/4.0),
                        new IngredientQuantity(IngredientBank.get(42), 2/4.0),
                        new IngredientQuantity(IngredientBank.get(63), 1/4.0),
                        new IngredientQuantity(IngredientBank.get(5), 100/4.0),
                        new IngredientQuantity(IngredientBank.get(7), 2/4.0),
                        new IngredientQuantity(IngredientBank.get(7), 100/4.0),
                        new IngredientQuantity(IngredientBank.get(38), 1/4.0),
                        new IngredientQuantity(IngredientBank.get(24), 100/4.0),
                        new IngredientQuantity(IngredientBank.get(64), 150/4.0),
                        new IngredientQuantity(IngredientBank.get(2), 2/4.0),
                        new IngredientQuantity(IngredientBank.get(65), 1/4.0),
                },
                905,
                RecipeType.MEAT,
                Difficulty.HARD,
                new Time(60),
                new Time(60)
        ));
        m.put(9, new Recipe(9,
                "Salongo recheado à Açoreana\n",
                "O salongo recheado à Açoreana transporta-nos para os sabores típicos das férias de Verão. Acompanhe com o puré, a alface e um vinho bem fresco.",
                "1. Pré-aqueça o forno a 180 °C.\n" +
                        "2. Lave o peixe, enxugue-o com papel de cozinha e dê dois golpes em diagonal de cada lado do lombo. Salpique com uma colher de chá de sal.\n" +
                        "3. Pique finamente uma cebola e um dente de alho, previamente descascados, e leve a alourar numa frigideira com uma colher de sopa de azeite. Introduza o filete e deixe cozinhar de ambos os lados durante cerca de 5 minutos, à medida que vai desfazendo o peixe com uma espátula. Entretanto, desfaça o pão em pedaços e escalde-o com a água a ferver. Junte o pão bem demolhado ao peixe, adicione uma colher de sopa de salsa picada, as azeitonas e misture muito bem. Retire do lume, junte o vinagre e o ovo batido, tempere com ½ colher de chá de sal e pimenta moída na altura e mexa bem.\n" +
                        "4. Introduza cuidadosamente o recheio na barriga do peixe através da abertura junto à cabeça. Coloque o peixe sobre um tabuleiro de forno untado com um pouco do azeite.\n" +
                        "5. Cubra o peixe com as restantes cebolas e dentes de alho descascados e cortados em rodelas finas.\n" +
                        "6. Regue com a massa de pimentão, dissolvida no vinho branco, e o restante azeite. Leve a assar no forno durante cerca de 35 minutos.\n" +
                        "7. Entretanto prepare o puré de batata, seguindo as indicações da embalagem. Bata o puré com os espinafres cozidos num robot de cozinha, até obter uma mistura homogénea.\n" +
                        "8. Na altura de servir, salpique o peixe com a restante salsa picada e acompanhe com o puré e com a alface.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(66), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(6), 1.5 / 6.0),
                        new IngredientQuantity(IngredientBank.get(67), 3 / 6.0),
                        new IngredientQuantity(IngredientBank.get(2), 2/ 6.0),
                        new IngredientQuantity(IngredientBank.get(7), 3 / 6.0),
                        new IngredientQuantity(IngredientBank.get(68), 150 / 6.0),
                        new IngredientQuantity(IngredientBank.get(69), 70 / 6.0),
                        new IngredientQuantity(IngredientBank.get(54), 50 / 6.0),
                        new IngredientQuantity(IngredientBank.get(70), 30 / 6.0),
                        new IngredientQuantity(IngredientBank.get(13), 2 / 6.0),
                        new IngredientQuantity(IngredientBank.get(71), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(72), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(29), 0),
                        new IngredientQuantity(IngredientBank.get(4), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(5), 100 / 6.0),
                        new IngredientQuantity(IngredientBank.get(73), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(74), 100 / 6.0),
                        new IngredientQuantity(IngredientBank.get(75), 300 / 6.0),
                },
                502,
                RecipeType.FISH,
                Difficulty.MEDIUM,
                new Time(60),
                new Time(0)
        ));
        m.put(10, new Recipe(10,
                "Dourada no forno com escabeche e cenoura",
                "A dourada no forno com escabeche e cenoura, criada na Costa da Madeira, é um prato imprescindível à mesa portuguesa. Acompanhe com feijão-verde e batata.",
                "1. Pré-aqueça o forno para os 180 ºC.\n" +
                        "2. Ponha as douradas num tabuleiro de forno e tempere-as com pimenta moída na altura, alho em pó, tomilho e com a raspa da casca da lima. Leve ao forno durante 15 minutos.\n" +
                        "3. Lave bem as batatas, pique-as com um garfo, coloque num prato fundo que possa ir ao microondas, cubra com a tampa e cozinhe durante 7 minutos na potência máxima.\n" +
                        "4. Entretanto, numa frigideira, salteie a cenoura ripada com o molho de escabeche e espalhe sobre as douradas.\n" +
                        "5. Disponha as batatas em torno das douradas e leve novamente ao forno para acabar de cozinhar.\n" +
                        "6. Lave o feijão-verde, retire-lhe os fios e corte-o ao meio e depois corte cada metade em duas partes a todo o comprimento. Coloque numa taça, cubra com uma tampa e cozinhe no microondas durante 6 minutos na potência máxima.\n" +
                        "7. Sirva as douradas com o feijão-verde e com as batatas.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(10), 800 / 4.0),
                        new IngredientQuantity(IngredientBank.get(29), 0),
                        new IngredientQuantity(IngredientBank.get(60), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(42), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(76), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(14), 400 / 4.0),
                        new IngredientQuantity(IngredientBank.get(40), 150 / 4.0),
                        new IngredientQuantity(IngredientBank.get(77), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(78), 200 / 4.0),

                },
                499,
                RecipeType.FISH,
                Difficulty.EASY,
                new Time(30),
                new Time(0)
        ));
        m.put(11, new Recipe(11,
                "Espetadas de salmão com molho agridoce",
                "As espetadas de salmão com molho agridoce são de preparação simples, mas estão cheias de sabor e frescura. Acompanhe com arroz ou salada, ou, se preferir, sirva como entrada.",
                "1. Numa taça, misture o molho agridoce, o azeite, o gengibre e o sumo de lima.\n" +
                        "2. Pincele os lombos de salmão com esta mistura e coloque-os num espeto largo. Grelhe durante cerca de 3 minutos de cada lado.\n" +
                        "3. Sirva as espetadas com o alho-francês e polvilhe com a raspa de lima e os coentros. Tempere a gosto com pimenta.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(79), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(7), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(80), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(12), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(81), 600 / 4.0),
                        new IngredientQuantity(IngredientBank.get(50), 150 / 4.0),
                        new IngredientQuantity(IngredientBank.get(9), 0),
                        new IngredientQuantity(IngredientBank.get(43), 0),


                },
                338,
                RecipeType.FISH,
                Difficulty.EASY,
                new Time(30),
                new Time(0)
        ));
        m.put(12, new Recipe(12,
                "Polvo à minhota",
                "Viaje pelo Norte do nosso país e experimente este polvo à minhota. Uma receita tipicamente portuguesa, com o sabor dos melhores ingredientes.",
                "1. Lave o polvo e limpe-o da pele viscosa. Elimine a parte dura da boca, separe a cabeça e corte os tentáculos em pedaços. Coza o polvo em água a ferver durante cerca de 10 minutos.\n" +
                        "2. Entretanto leve ao lume a cebola picada, previamente descascada, com o azeite e deixe refogar sobre lume brando até a cebola estar translúcida. Junte os pedaços de polvo bem escorridos e o tomate, previamente limpo de sementes e cortado em cubos pequenos. Tape e deixe cozinhar entre 10 e 15 minutos.\n" +
                        "3. Regue com o vinho branco e adicione os dentes de alho esborrachados e um ramo de salsa atado com a folha de louro. Tape e deixe cozinhar sobre lume brando durante cerca de 40 minutos ou até o polvo estar macio. Tempere com o sal e salpique com salsa acabada de picar.\n" +
                        "4. Acompanhe com fatias finas de pão torrado.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(82), 1.5 / 4.0),
                        new IngredientQuantity(IngredientBank.get(67), 120 / 4.0),
                        new IngredientQuantity(IngredientBank.get(7), 100 / 4.0),
                        new IngredientQuantity(IngredientBank.get(16), 500 / 4.0),
                        new IngredientQuantity(IngredientBank.get(5), 200 / 4.0),
                        new IngredientQuantity(IngredientBank.get(2), 2 / 4.0),
                        new IngredientQuantity(IngredientBank.get(13), 0),
                        new IngredientQuantity(IngredientBank.get(3), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(6), 1 / 4.0),
                        new IngredientQuantity(IngredientBank.get(83), 200 / 4.0),
                },
                688,
                RecipeType.FISH,
                Difficulty.MEDIUM,
                new Time(90),
                new Time(0)
        ));
        m.put(13, new Recipe(13,
                "Gelado de kiwi e melancia com mel",
                "O gelado de kiwi e melancia é a melhor forma de se refrescar num dia quente de verão. Com apenas 3 ingredientes, mas cheio de sabor. Quem consegue resistir?",
                "1. Coloque num liquidificador a polpa da melancia sem sementes e o mel e triture até obter um sumo espesso.\n" +
                        "2. Descasque os kiwis e corte-os em rodelas finas.\n" +
                        "3. 3Cole as rodelas às laterais dos moldes de gelado e encha com o sumo de melancia. Certifique-se de que o kiwi fica bem visível.\n" +
                        "4. Coloque no congelador e após 30 minutos, ponha os paus de gelado no centro. Volte a pôr no congelador cerca de 3 horas, ou até estarem sólidos.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(84), 750 / 8.0),
                        new IngredientQuantity(IngredientBank.get(62), 1 / 8.0),
                        new IngredientQuantity(IngredientBank.get(85), 240 / 8.0),

                },
                49,
                RecipeType.DESSERT,
                Difficulty.EASY,
                new Time(30),
                new Time(120)
        ));
        m.put(14, new Recipe(14,
                "Tarte de tomate com cebola",
                "Sem inspiração para uma refeição saudável? Esta tarte de tomate com cebola vai surpreender. Sirva como acompanhamento ou prato principal vegetariano.",
                "1. Pré-aqueça o forno a 180 °C, na função calor circulante com grelha inferior.\n" +
                        "2. Descasque e corte as cebolas em rodelas finas para um tacho. Faça o mesmo com o alho-francês. Junte três colheres de sopa de azeite e leve ao lume.\n" +
                        "3. Adicione os dentes de alho espremidos e deixe cozinhar sobre lume moderado durante 15 a 20 minutos, até os legumes estarem moles e começarem a alourar.\n" +
                        "4. Tempere com uma colher de café de flor de sal e pimenta moída na altura. Retire do lume e deixe arrefecer.\n" +
                        "5. Lave o tomate e corte-o em rodelas com cerca de 0,5 cm de espessura.\n" +
                        "6. Forre uma tarteira com a massa quebrada e recheie com a cebola e o alho-francês.\n" +
                        "7. Por cima, disponha as rodelas de tomate em roseta. Regue com o restante azeite, tempere com mais pimenta moída na altura e salpique com os orégãos.\n" +
                        "8. Leve ao forno durante cerca de 30 minutos.\n" +
                        "9. Salpique com a restante flor de sal, folhas frescas de manjericão, azeitonas e mozzarellas mini.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(67), 3 / 6.0),
                        new IngredientQuantity(IngredientBank.get(50), 200 / 6.0),
                        new IngredientQuantity(IngredientBank.get(7), 4 / 6.0),
                        new IngredientQuantity(IngredientBank.get(2), 2 / 6.0),
                        new IngredientQuantity(IngredientBank.get(86), 2 / 6.0),
                        new IngredientQuantity(IngredientBank.get(29), 0),
                        new IngredientQuantity(IngredientBank.get(16), 600 / 6.0),
                        new IngredientQuantity(IngredientBank.get(87), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(88), 1 / 6.0),
                        new IngredientQuantity(IngredientBank.get(17), 0),
                        new IngredientQuantity(IngredientBank.get(70), 30 / 6.0),
                        new IngredientQuantity(IngredientBank.get(89), 150 / 6.0),
                },
                304,
                RecipeType.VEGETARIAN,
                Difficulty.MEDIUM,
                new Time(60),
                new Time(0)
        ));
        m.put(15, new Recipe(15,
                "Omelete de legumes",
                "Aproveite as sobras de salada para fazer uma simples, mas deliciosa e nutritiva omelete. Uma refeição sem desperdício, que fica pronta em apenas 15 minutos.",
                "1. Numa taça, bata os ovos, tempere com sal e pimenta.\n" +
                        "2. Unte uma frigideira antiaderente com o azeite.\n" +
                        "3. Deite os ovos na frigideira, espalhe bem e deixe cozinhar lentamente até que a base prenda.\n" +
                        "4. Ponha a salada numa das metades do ovo e dobre a omeleta por cima da salada.\n" +
                        "5. Coloque num prato, polvilhe com cebolinho e sirva de imediato.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(90), 75 / 2.0),
                        new IngredientQuantity(IngredientBank.get(72), 3 / 2.0),
                        new IngredientQuantity(IngredientBank.get(6), 1 / 2.0),
                        new IngredientQuantity(IngredientBank.get(43), 0),
                        new IngredientQuantity(IngredientBank.get(7), 1 / 2.0),
                        new IngredientQuantity(IngredientBank.get(57), 0),
                },
                161,
                RecipeType.VEGETARIAN,
                Difficulty.EASY,
                new Time(15),
                new Time(0)
        ));
        m.put(16, new Recipe(16,
                "Bolachas de manteiga de amendoim",
                "Ideais para reunir a família na cozinha, estas bolachas de manteiga de amendoim são deliciosas e ficam bem em qualquer lanche. Vai ser difícil resistir!",
                "1. Pré-aqueça o forno a 180 °C.\n" +
                        "2. Forre um tabuleiro de forno com papel vegetal.\n" +
                        "3. Numa taça, misture o açúcar amarelo, os 50g de açúcar branco e a manteiga amolecida até obter um creme.\n" +
                        "4. Adicione à mistura o ovo e a manteiga de amendoim, e bata até obter uma consistência cremosa.\n" +
                        "5. Junte a farinha, o bicarbonato de sódio, o sal e envolva delicadamente com uma espátula até conseguir uma massa homogénea.\n" +
                        "6. Deite as quatro colheres de sopa de açúcar num prato fundo.\n" +
                        "7. Forme 20 bolas com a massa e passe-as pelo açúcar, dispondo-as de seguida no tabuleiro.\n" +
                        "8. Com a ajuda de um garfo, pressione as bolas de forma a obter uns discos, e leve ao forno por 10 minutos. As bolachas devem ficar douradas, mas ainda moles no centro.",
                new IngredientQuantity[]{
                        new IngredientQuantity(IngredientBank.get(91), 100 / 12.0),
                        new IngredientQuantity(IngredientBank.get(32), 50 / 12.0),
                        new IngredientQuantity(IngredientBank.get(32), 4 / 12.0),
                        new IngredientQuantity(IngredientBank.get(92), 100 / 12.0),
                        new IngredientQuantity(IngredientBank.get(72), 1 / 12.0),
                        new IngredientQuantity(IngredientBank.get(93), 200 / 12.0),
                        new IngredientQuantity(IngredientBank.get(94), 200 / 12.0),
                        new IngredientQuantity(IngredientBank.get(95), 1 / 12.0),
                        new IngredientQuantity(IngredientBank.get(6), 1 / 12.0),

                },
                212,
                RecipeType.DESSERT,
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