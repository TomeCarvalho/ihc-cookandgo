package com.example.trueproject.custom_classes;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class Ingredient {
	private int id;
	private String name;
	private Allergies allergy;
	private boolean vegetarian;
	private Unit unit;

	public Ingredient(int id, String name, boolean vegetarian, Unit unit, Allergies allergy) {
		this.id = id;
		this.name = name;
		this.vegetarian = vegetarian;
		this.unit = unit;
		this.allergy = allergy;
	}

	public Ingredient(int id, String name, boolean vegetarian, Unit unit) {
		this.id = id;
		this.name = name;
		this.vegetarian = vegetarian;
		this.unit = unit;
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

	public Unit getUnit() {
		return unit;
	}

	@Override
	public String toString () {
		return getName();
	}

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