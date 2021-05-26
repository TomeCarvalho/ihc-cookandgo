package com.example.trueproject.ui.recipes;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.trueproject.R;
import com.example.trueproject.custom_classes.Allergies;
import com.example.trueproject.custom_classes.Recipe;
import com.example.trueproject.custom_classes.RecipeBank;
import com.example.trueproject.custom_classes.SharedData;
import com.example.trueproject.ui.recipe.RecipeFragment;

import java.util.*;

public class RecipesFragment extends Fragment {
    private final String TAG = "RecipesFragment";
    private RecipesViewModel recipesViewModel;
    private Set<Recipe> recipes = new HashSet<Recipe>();
    private GridView gridView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recipesViewModel = new ViewModelProvider(this).get(RecipesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_recipes, container, false);

        gridView = (GridView) root.findViewById(R.id.fragment_recipes_gridview);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG, "onItemClick");
                Object recipesView = gridView.getItemAtPosition(position);
                RecipesView r = (RecipesView) recipesView;
                Log.i(TAG, "onItemClick: " + r.getName());
                SharedData.chosenRecipe = RecipeBank.getRecipe(r.getImg());
                NavController navController = Navigation.findNavController(requireActivity(), R.id.mobile_navigation);
                navController.navigate(R.id.recipe_linear_layout);
            }
        });
        initRecipesGridView();
        return root;
    }

    private void initRecipesGridView() {
        ArrayList<RecipesView> recipesViewList = new ArrayList<>();
        for (Recipe r : SharedData.recipeSet)
            recipesViewList.add(new RecipesView(r.getName(), r.getId(), r.canBeCookedWith(SharedData.ingQtySet, 1)));

        RecipesAdapter recipeAdapter = new RecipesAdapter(
                getActivity().getApplicationContext(),
                recipesViewList,
                getActivity().getSupportFragmentManager()
                // getChildFragmentManager()
                // getFragmentManager()
                // getActivity()
        );

        gridView.setAdapter(recipeAdapter);
    }

    public void filterByTime() {
        TreeSet<Recipe> tree = new TreeSet<>((Recipe r1, Recipe r2) -> {
            return r1.getCookingTime().compareTo(r2.getCookingTime());
        });

        tree.addAll(recipes);
        recipes = tree;
        showRecipes();
    }

    public void filterByName() {
        TreeSet<Recipe> tree = new TreeSet<>((Recipe r1, Recipe r2) -> {
            return r1.getName().compareTo(r2.getName());
        });

        tree.addAll(recipes);
        recipes = tree;
        showRecipes();
    }

    public void filterByNameReversed() {
        TreeSet<Recipe> tree = new TreeSet<>((Recipe r1, Recipe r2) -> {
            return r2.getName().compareTo(r1.getName());
        });

        tree.addAll(recipes);
        recipes = tree;
        showRecipes();
    }

    public void filterByDifficult() {
        TreeSet<Recipe> tree = new TreeSet<>((Recipe r1, Recipe r2) -> {
            return r2.getDifficulty().getVal() - r1.getDifficulty().getVal();
        });

        tree.addAll(recipes);
        recipes = tree;
        showRecipes();
    }

    public void showRecipes() {
        // SHOW THE RECIPES STORED
    }
}