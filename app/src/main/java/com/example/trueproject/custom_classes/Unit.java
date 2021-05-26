package com.example.trueproject.custom_classes; //

public enum Unit {
	KG("kg"),
	G("g"),
	L("L"),
	DL("dl"),
	ML("ml"),
	SPOON_COFFEE(" c.café"),
	SPOON_DESSERT(" c.sobremesa"),
	SPOON_TEA(" c.chá"),
	SPOON_SOUP(" c.sopa"),
	ENOUGH(" qb"),
	EMB(" emb"),
	UNIT(" unid");

	private String name;

	private Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}