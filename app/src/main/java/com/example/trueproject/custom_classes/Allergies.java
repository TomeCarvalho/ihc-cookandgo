enum Allergies {
	MILK("leite"),
	EGGS("ovos"),
	FISH("peixe"),
	SHELLFISH("marisco"),
	NUTS("nozes"),
	PEANUTS("amendoins"),
	WHEAT("trigo"),
	SOYBEANS("soja");

	private String name;

	private Allergies(String name) {
		this.name = name;
	}
}