package com.example.trueproject.ui.recipes;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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
import com.example.trueproject.ui.filter.FilterFragment;
import com.example.trueproject.ui.recipe.RecipeFragment;

import java.util.*;

public class RecipesFragment extends Fragment {
    private final String TAG = "RecipesFragment";
    private RecipesViewModel recipesViewModel;
    private Set<Recipe> recipes = new HashSet<Recipe>();
    private GridView gridView;
    public Button minusButton;
    public Button plusButton;
    public ImageButton filter;
    public TextView nMealsView;

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

                RecipeFragment recipeFragment = new RecipeFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_recipes_constraint, recipeFragment, "findThisFragment")
                        .commit();
            }
        });
        initRecipesGridView();
        nMealsView = (TextView) root.findViewById(R.id.num_people);
        nMealsView.setText(String.format("%d", SharedData.nMeals));
        plusButton = (Button) root.findViewById(R.id.increase);
        minusButton = (Button) root.findViewById(R.id.decrease);
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // decrement ppView and calculate ingredient quantities
                if (SharedData.nMeals == 1) { // prevent user from making 0 or fewer meals
                    Toast.makeText(getContext(), "Número de refeições tem de ser 1 ou mais", Toast.LENGTH_SHORT).show();
                    return;
                } // else
                nMealsView.setText(String.format("%d", --SharedData.nMeals));
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aumentar ppView e calcular ingredientes
                nMealsView.setText(String.format("%d", ++SharedData.nMeals));
            }
        });
        filter= (ImageButton) root.findViewById(R.id.filter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mudar para a view dos filtros
                FilterFragment filterFragment = new FilterFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_recipes_constraint, filterFragment, "findThisFragment")
                        .commit();
            }
        });
        return root;
    }

    private void initRecipesGridView() {
        ArrayList<RecipesView> recipesViewList = new ArrayList<>();
        for (Recipe r : SharedData.recipeSet) {
            Log.i(TAG, "initRecipesGridView: " + r.getName());
            recipesViewList.add(
                    new RecipesView(
                            r.getName(),
                            r.getId(),
                            r.canBeCookedWith(SharedData.ingQtySet, SharedData.nMeals)
                    )
            );
        }

        RecipesAdapter recipeAdapter = new RecipesAdapter(
                getActivity().getApplicationContext(),
                recipesViewList,
                getActivity().getSupportFragmentManager()
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