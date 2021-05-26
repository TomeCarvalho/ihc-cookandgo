package com.example.trueproject.custom_classes; //

import android.graphics.drawable.Drawable;
import android.util.Log;

import com.example.trueproject.R;

import java.util.*;

public class SharedData {
    public static Set<Allergies> allergySet = new HashSet<>();
    public static Set<RecipeType> recipeTypeSet = new HashSet<>();
    public static Set<Recipe> recipeSet = new HashSet<>();
    public static Set<IngredientQuantity> ingQtySet = new TreeSet<>(
            (IngredientQuantity i1, IngredientQuantity i2) -> {
                return i1.getIngredient().getName().compareTo(i2.getIngredient().getName());
            });
    public static Recipe chosenRecipe = null;
    public static int nMeals = 1; // number of meals to cook
    public static boolean ingredientsLoaded = false;
    public static boolean showUncookables = true;
    public static boolean vegetarian = false;
    public static int[] recipeImgs = new int[]{
            R.drawable.recipe1,
            R.drawable.recipe2,
            R.drawable.recipe3,
            R.drawable.recipe4,
            R.drawable.recipe5,
            R.drawable.recipe6,
            R.drawable.recipe7,
            R.drawable.recipe8,
            R.drawable.recipe9,
            R.drawable.recipe10,
            R.drawable.recipe11,
            R.drawable.recipe12,
            R.drawable.recipe13,
            R.drawable.recipe14,
            R.drawable.recipe15,
            R.drawable.recipe16,
    };

    // TODO
    static {
        Collections.addAll(recipeTypeSet, RecipeType.values());
        loadJoaquina();
        // recipeSet.addAll(RecipeBank.getAllRecipes());
        Log.i("SharedData", "update recipes");
        updateRecipes(1);
    }

    public static double getQuantityOf(Ingredient ingredient) {
        for (IngredientQuantity ingQty : ingQtySet)
            if (ingQty.getIngredient().getId() == ingredient.getId())
                return ingQty.getQuantity();
        return 0;
    }

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
        Collections.addAll(recipeTypeSet, RecipeType.values());
    }

    public static void updateRecipes(int nMeals) {
        Log.i("SharedData", "updateRecipes called");
        recipeSet = new HashSet<>();
        for (Recipe r : RecipeBank.getAllRecipes()) {
            Log.i("SharedData", "recipe: " + r);
            if (!containsAllergy(r.getAllergies(), allergySet)
                    && recipeTypeSet.contains(r.getType())
                    && (showUncookables || r.canBeCookedWith(ingQtySet, nMeals))) {
                recipeSet.add(r);
                Log.i("SharedData", "recipe added: " + r);
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
            Log.i("SharedData", a.getName());
    }
}
