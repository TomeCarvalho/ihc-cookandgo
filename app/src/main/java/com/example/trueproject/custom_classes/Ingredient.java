package com.example.trueproject.custom_classes;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class Ingredient {
	private int id;
	private String name;
	private Allergies allergy;
	private boolean vegetarian;
	private Unit unit = Unit.G;

	public Ingredient(int id, String name, boolean vegetarian, Allergies allergy) {
		this.id = id;
		this.name = name;
		this.allergy = allergy;
		this.vegetarian = vegetarian;
	}

	public Ingredient(int id, String name, boolean vegetarian) {
		this.id = id;
		this.name = name;
		this.vegetarian = vegetarian;
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

	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public String toString () {
		return getName();
	}

	public Unit getUnit() { return unit; }

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Ingredient that = (Ingredient) o;
		return id == that.id;
	}
}