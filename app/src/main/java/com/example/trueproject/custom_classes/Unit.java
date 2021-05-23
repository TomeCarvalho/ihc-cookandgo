package com.example.trueproject.custom_classes;

public enum Unit {
	G("g"),
	L("L"),
	DL("dl"),
	ML("ml"),
	SPOON_COFFEE(" colheres de café"),
	SPOON_DESSERT(" colheres de sobremesa"),
	SPOON_TEA(" colheres de chá"),
	SPOON_SOUP(" colheres de sopa"),
	ENOUGH(" que baste"),
	EMB(" embalagens"),
	UNIT(" unidades");

	private String name;

	private Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}