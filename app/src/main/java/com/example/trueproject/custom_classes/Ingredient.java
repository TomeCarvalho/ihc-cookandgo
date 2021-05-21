package com.example.trueproject.custom_classes;

import java.util.Set;
import java.util.HashSet;

class Ingredient {
	private int id;
	private String name;
	private Allergies allergy;

	public Ingredient(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Allergies getAllergy() {
		return allergy;
	}

	@Override
	public String toString () {
		return getName();
	}
}