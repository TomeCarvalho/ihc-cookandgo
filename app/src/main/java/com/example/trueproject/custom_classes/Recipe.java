package com.example.trueproject.custom_classes; //

import android.util.Log;

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

    @Override
    public String toString() {
        return id + ": " + name;
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

    public IngredientQuantity[] getIngredientQuantities(int nMeals) {
        if (nMeals == 1) // no need to loop in this case
            return getIngredientQuantities(); // just use the no-arguments getter

        int len = ingredientQuantities.length;
        IngredientQuantity[] ret = new IngredientQuantity[len];
        for (int i = 0; i < len; i++)
            ret[i] = ingredientQuantities[i].getForNMeals(nMeals);
        return ret;
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
        StringBuilder str = new StringBuilder();
        for (IngredientQuantity i : ingredientQuantities)
            str.append(i).append("\n");
        str = new StringBuilder(str.substring(0, str.length() - 1));
        return str.toString();
    }

    public boolean isVegetarian() {
        for (IngredientQuantity iq : ingredientQuantities)
            if (!iq.getIngredient().isVegetarian())
                return false;
        return true;
    }

    public boolean canBeCookedWith(Set<IngredientQuantity> ingQtys, int nMeals) {
        String tag = "canBeCookedWith debug";
        Log.i(tag, "canBeCookedWith called");
        for (IngredientQuantity recipeIngQty : ingredientQuantities) {
            if (!hasEnoughOf(recipeIngQty, ingQtys)) {
                Log.i(tag, "recipe " + id + " cookable: false");
                return false;
            }
        }
        Log.i(tag, "recipe " + id + " cookable: true");
        return true;
    }

    private static boolean hasEnoughOf(IngredientQuantity iq, Set<IngredientQuantity> ingQtys) {
        for (IngredientQuantity ingQty : ingQtys)
            if (ingQty.getIngredient().equals(iq.getIngredient()))
                return (ingQty.getQuantity() >= iq.getQuantity());
        return false;
    }
}