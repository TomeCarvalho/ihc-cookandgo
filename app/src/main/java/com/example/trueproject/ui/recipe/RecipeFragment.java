package com.example.trueproject.ui.recipe;

import android.graphics.Color;
import android.os.Bundle;

import android.provider.ContactsContract;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trueproject.R;
import com.example.trueproject.custom_classes.IngredientQuantity;
import com.example.trueproject.custom_classes.Recipe;
import com.example.trueproject.custom_classes.SharedData;
import com.example.trueproject.ui.IngredientsView;
import com.example.trueproject.ui.IngredientsViewAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class RecipeFragment extends Fragment {
    public RecipeViewModel recipeViewModel;
    public TextView recipeNameView;
    public TextView timeView;
    public TextView difView;
    public TextView ingView;
    public TextView prepView;
    public TextView nMealsView; // NSFW
    public TextView kcalView;
    public ImageView imageView;
    public Button minusButton;
    public Button plusButton;
    public Recipe recipe;
    public ExtendedFloatingActionButton fazer;

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

        fazer = (ExtendedFloatingActionButton) root.findViewById(R.id.floatButton);
        fazer.setText("fazer");
        fazer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IngredientQuantity[] ingQties = recipe.getIngredientQuantities(SharedData.nMeals);
                if(recipe.canBeCookedWith(SharedData.ingQtySet,SharedData.nMeals)){
                    double qty;
                    for (IngredientQuantity ingQty : ingQties) {
                        for (IngredientQuantity ig : SharedData.ingQtySet) {
                            if (ig.getIngredient().getName().equals(ingQty.getIngredient().getName())) {
                                double qtd = SharedData.getQuantityOf(ig.getIngredient()) - ingQty.getQuantity();
                                ig.setQuantity(round(qtd,2));
                                break;
                            }
                        }
                    }
                    update();
                }
                else{
                    Toast.makeText(getContext(), "Não é possível fazer esta receita.", Toast.LENGTH_SHORT).show();
                    return;
                }


            }
        });
        difView = (TextView) root.findViewById(R.id.difficulty);
        difView.setText(recipe.getDifficulty().getName());

        IngredientQuantity[] ingQties = recipe.getIngredientQuantities(SharedData.nMeals);
        StringBuilder sb = new StringBuilder();

        List<Integer> lengths = new ArrayList<>();
        List<Boolean> enough = new ArrayList<>();
        double qty;
        String s = "Ingredientes\n";
        int init = s.length(), fin;
        sb.append(s);
        for (IngredientQuantity ingQty : ingQties) {
            qty = SharedData.getQuantityOf(ingQty.getIngredient());
            s = qty + "/" + ingQty.getQuantity() + ingQty.getIngredient().getUnit().getName() + " " + ingQty.getIngredient().getName() + "\n";
            lengths.add(s.length());
            enough.add(qty >= ingQty.getQuantity());
            sb.append(s);
        }
        SpannableString spanStr = new SpannableString(sb);
        ForegroundColorSpan green = new ForegroundColorSpan(Color.parseColor("#006400"));
        ForegroundColorSpan red = new ForegroundColorSpan(Color.RED);
        for (int i = 0; i < lengths.size(); i++) {
            fin = init + lengths.get(i) - 1;
            //Log.i("recipe",fin+" "+init+" "+enough.get(i));
            spanStr.setSpan((enough.get(i) ? new ForegroundColorSpan(Color.parseColor("#006400")) : new ForegroundColorSpan(Color.RED)), init, fin, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            init = fin + 1;
        }
        ingView = (TextView) root.findViewById(R.id.ingredients);
        ingView.setText(spanStr);


        prepView = (TextView) root.findViewById(R.id.prep);
        prepView.setText("Preparação\n" + recipe.getPreparation());

        nMealsView = (TextView) root.findViewById(R.id.num_people);
        nMealsView.setText(String.format("%d", SharedData.nMeals));

        kcalView = (TextView) root.findViewById(R.id.kcal);
        kcalView.setText(String.format("%d", recipe.getCalories()));

        imageView = (ImageView) root.findViewById(R.id.recipe_image_view);
        imageView.setImageResource(SharedData.recipeImgs[recipe.getId() - 1]);

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
                update();
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aumentar ppView e calcular ingredientes
                nMealsView.setText(String.format("%d", ++SharedData.nMeals));
                update();
            }
        });

        return root;
    }

    public void update() {
        IngredientQuantity[] ingQties = recipe.getIngredientQuantities(SharedData.nMeals);
        StringBuilder sb = new StringBuilder();

        List<Integer> lengths = new ArrayList<>();
        List<Boolean> enough = new ArrayList<>();
        double qty;
        String s = "Ingredientes\n";
        int init = s.length(), fin;
        sb.append(s);
        for (IngredientQuantity ingQty : ingQties) {
            qty = SharedData.getQuantityOf(ingQty.getIngredient());
            s = qty + "/" + ingQty.getQuantity() + ingQty.getIngredient().getUnit().getName() + " " + ingQty.getIngredient().getName() + "\n";
            lengths.add(s.length());
            enough.add(qty >= ingQty.getQuantity());
            sb.append(s);
        }
        SpannableString spanStr = new SpannableString(sb);
        //spanStr.setSpan(new ForegroundColorSpan(Color.parseColor("#006400")), 0, 80, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //spanStr.setSpan(, 90, 110, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        for (int i = 0; i < lengths.size(); i++) {
            fin = init + lengths.get(i) - 1;
            //Log.i("recipe",fin+" "+init+" "+enough.get(i));
            spanStr.setSpan((enough.get(i) ? new ForegroundColorSpan(Color.parseColor("#006400")) : new ForegroundColorSpan(Color.RED)), init, fin, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            init = fin + 1;
        }


        ingView.setText(spanStr);
    }
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}
