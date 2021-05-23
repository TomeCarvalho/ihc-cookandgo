package com.example.trueproject.custom_classes; //

import java.util.Set;
import java.util.HashSet;

public class Recipe {
    private int id;
    private String name;
    private String description;
    private String preparation;
    private IngredientQuantity[] ingredientQuantities;
    private int calories;
    private RecipeType type;
    private Difficulty difficulty;
    private Time cookingTime;
    private Time waitingTime;

    public Recipe(int id, String name, String description, String preparation,
                  IngredientQuantity[] ingredientQuantities, int calories,
                  RecipeType type, Difficulty difficulty, Time cookingTime, Time waitingTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.preparation = preparation;
        this.ingredientQuantities = ingredientQuantities;
        this.calories = calories;
        this.type = type;
        this.difficulty = difficulty;
        this.cookingTime = cookingTime;
        this.waitingTime = waitingTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public IngredientQuantity[] getIngredientQuantities() {
        return ingredientQuantities;
    }

    public int getCalories() {
        return calories;
    }

    public RecipeType getType() {
        return type;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Time getCookingTime() {
        return cookingTime;
    }

    public Time getWaitingTime() {
        return waitingTime;
    }

    public Set<Allergies> getAllergies() {
        Set<Allergies> allergies = new HashSet<>();
        for (IngredientQuantity i : ingredientQuantities)
            allergies.add(i.getIngredient().getAllergy());
        return allergies;
    }

    public String ingredientQuantitiesStr() {
        String str = "";
        for (IngredientQuantity i : ingredientQuantities)
            str += i + "\n";
        str = str.substring(0, str.length() - 1);
        return str;
    }

    public boolean isVegetarian() {
        for (IngredientQuantity iq : ingredientQuantities)
            if (!iq.getIngredient().isVegetarian())
                return false;
        return true;
    }

    public boolean canBeCookedWith(Set<IngredientQuantity> ingQty, int nMeals) {
        for (IngredientQuantity iq : ingQty)
            if (!hasEnoughOf(ingredientQuantities, iq, nMeals))
                return false;
        return true;
    }

    public boolean canBeCookedWith(Set<IngredientQuantity> ingQty) {
        return canBeCookedWith(ingQty, 1);
    }

    private static boolean hasEnoughOf(IngredientQuantity[] arr, IngredientQuantity iq, int nMeals) {
        for (IngredientQuantity arrIq : arr)
            if (!(arrIq.getIngredient().equals(iq.getIngredient())
            && arrIq.getQuantity() >= nMeals * iq.getQuantity()))
                return false;
        return true;
    }
}