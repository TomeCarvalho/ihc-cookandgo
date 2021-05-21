import java.util.Set;
import java.util.HashSet;

class Ingredient {
	private int id;
	private String name;
	private Allergies allergy;
	private boolean vegetarian;

	public Ingredient(int id, String name, Allergies allergy, boolean vegetarian) {
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
}