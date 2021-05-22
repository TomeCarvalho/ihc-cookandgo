package com.example.trueproject.ui.recipes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.trueproject.R;
import com.example.trueproject.custom_classes.Recipe;

import java.util.*;

public class RecipesFragment extends Fragment {
    private RecipesViewModel recipesViewModel;
    private Set<Recipe> recipes = new HashSet<Recipe>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recipesViewModel =
                new ViewModelProvider(this).get(RecipesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_recipes, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        recipesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
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