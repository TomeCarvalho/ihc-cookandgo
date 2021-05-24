package com.example.trueproject.ui.recipe;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trueproject.R;
import com.example.trueproject.custom_classes.Recipe;

public class RecipeFragment extends Fragment {
    public RecipeViewModel recipeViewModel;
    public TextView recipeView;
    public  TextView timeView;
    public TextView difView;
    public TextView ingView;
    public TextView prepView;
    public TextView ppView;
    public Button minusbutton;
    public Button plusbutton;
    public Recipe rec;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recipeViewModel =
                new ViewModelProvider(this).get(RecipeViewModel.class);
        View root = inflater.inflate(R.layout.recipe, container, false);
        rec=recipeViewModel.getRec();
        //nao sei como ir buscar a recipe mas acho que é isto, maybe??

        this.recipeView = (TextView) root.findViewById(R.id.recipe_name);
        this.recipeView.setText(rec.getName());

        this.timeView =(TextView) root.findViewById(R.id.timetocook);
        this.timeView.setText((CharSequence) rec.getCookingTime());

        this.difView= (TextView) root.findViewById(R.id.difficulty);
        this.difView.setText(rec.getDifficulty().getName());

        this.ingView=(TextView) root.findViewById(R.id.ingredients);
        this.ingView.setText("rec.getingredientes()??");

        this.prepView=(TextView) root.findViewById(R.id.prep);
        this.prepView.setText(rec.getPreparation());

        this.ppView=(TextView) root.findViewById(R.id.num_people);
        //aqui temos que meter o texto da ppview com o valor das pessoas (valor global maybe?)

        this.minusbutton = (Button) root.findViewById(R.id.decrease);
        this.plusbutton=(Button) root.findViewById(R.id.increase);
        this.minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //diminuir ppView e calcular ingredientes
            }
        });
        this.plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aumentar ppView e calcular ingredientes
            }
        });

        return root;
    }

}
