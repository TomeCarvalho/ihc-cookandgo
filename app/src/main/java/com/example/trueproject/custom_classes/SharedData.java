package com.example.trueproject.custom_classes;

import android.util.Log;
import java.util.*;

public class SharedData {
    public static Set<Allergies> allergySet = new HashSet<>();
    public static Set<RecipeType> recipeTypeSet = new HashSet<>();
    public static Set<Recipe> recipeSet = new HashSet<>();
    public static Set<IngredientQuantity> ingQtySet = new HashSet<>();
    public static boolean showUncookables = true;
    // public static boolean vegetarian = false; // TODO: useless?

    // simulate Joaquina initial data like in low fidelity prototype
    public static void loadJoaquina() {
        // necessary ingredients for 4 meals of "Carne de porco à alentejana"
        ingQtySet.add(new IngredientQuantity(IngredientBank.get(1), 800));
        ingQtySet.add(new IngredientQuantity(IngredientBank.get(2), 3));
        ingQtySet.add(new IngredientQuantity(IngredientBank.get(3), 1));
        ingQtySet.add(new IngredientQuantity(IngredientBank.get(4), 1));
        ingQtySet.add(new IngredientQuantity(IngredientBank.get(5), 2.5));
        ingQtySet.add(new IngredientQuantity(IngredientBank.get(6), 2.5));
        ingQtySet.add(new IngredientQuantity(IngredientBank.get(7), 100));
        ingQtySet.add(new IngredientQuantity(IngredientBank.get(8), 500));
        ingQtySet.add(new IngredientQuantity(IngredientBank.get(9), 2));
    }

    public static void selectAllRecipeTypes() {
        for (RecipeType recipeType: RecipeType.values())
            recipeTypeSet.add(recipeType);
    }

    public static void updateRecipes(int nMeals) {
        recipeSet = new HashSet<>();
        for (Recipe r : RecipeBank.getAllRecipes()) {
            if (!containsAllergy(r.getAllergies(), allergySet)
            && recipeTypeSet.contains(r.getType())
            && (showUncookables || r.canBeCookedWith(ingQtySet, nMeals))) {
                recipeSet.add(r);
            }
        }
    }

    private static boolean containsAllergy(Set<Allergies> set, Set<Allergies> userAllergies) {
        set.retainAll(userAllergies); // intersection
        return (set.size() > 0);
    }

    // debug functions

    public static void debugAllergies() {
        for (Allergies a : allergySet)
            Log.i("SharedData allergy", a.getName());
    }
}
