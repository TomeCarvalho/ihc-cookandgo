enum Unit {
	G("g"),
	DL("dl"),
	ML("ml"),
	SPOON_DESSERT(" colheres de sobremesa"),
	SPOON_TEA(" colheres de chá"),
	SPOON_SOUP(" colheres de sopa"),
	ENOUGH(" que baste"),
	UNIT(" unidades");

	private String name;

	private Unit(String name) {
		this.name = name;
	}
}