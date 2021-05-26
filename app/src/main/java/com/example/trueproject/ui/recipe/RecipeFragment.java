package com.example.trueproject.ui.recipe;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trueproject.R;
import com.example.trueproject.custom_classes.Recipe;
import com.example.trueproject.custom_classes.SharedData;

public class RecipeFragment extends Fragment {
    public RecipeViewModel recipeViewModel;
    public TextView recipeNameView;
    public TextView timeView;
    public TextView difView;
    public TextView ingView;
    public TextView prepView;
    public TextView nMealsView; // NSFW
    public TextView kcalView;
    public Button minusButton;
    public Button plusButton;
    public Recipe recipe;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recipeViewModel =
                new ViewModelProvider(this).get(RecipeViewModel.class);
        View root = inflater.inflate(R.layout.recipe, container, false);
        //recipe = recipeViewModel.getRec();
        //nao sei como ir buscar a recipe mas acho que é isto, maybe??

        recipe = SharedData.chosenRecipe; // fiz para o SharedData guardar a receita escolhida :)

        recipeNameView = (TextView) root.findViewById(R.id.recipe_name);
        recipeNameView.setText(recipe.getName());

        timeView = (TextView) root.findViewById(R.id.timetocook);
        timeView.setText(recipe.getCookingTime().toString());

        difView = (TextView) root.findViewById(R.id.difficulty);
        difView.setText(recipe.getDifficulty().getName());

        // TODO: replace this with a ListView?
        // ingView = (TextView) root.findViewById(R.id.ingredients);
        // ingView.setText("recipe.getingredientes()??");

        prepView = (TextView) root.findViewById(R.id.prep);
        prepView.setText(recipe.getPreparation());

        nMealsView = (TextView) root.findViewById(R.id.num_people);
        nMealsView.setText(SharedData.nMeals);

        kcalView = (TextView) root.findViewById(R.id.kcal);

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
                nMealsView.setText(--SharedData.nMeals);
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aumentar ppView e calcular ingredientes
                nMealsView.setText(++SharedData.nMeals);
            }
        });

        return root;
    }
}
