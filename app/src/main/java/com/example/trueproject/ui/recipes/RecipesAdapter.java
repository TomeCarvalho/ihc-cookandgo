package com.example.trueproject.ui.recipes;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.trueproject.custom_classes.Recipe;
import com.example.trueproject.R;
import com.example.trueproject.custom_classes.RecipeBank;
import com.example.trueproject.custom_classes.SharedData;
import com.example.trueproject.ui.recipe.RecipeFragment;

import java.util.ArrayList;

public class RecipesAdapter extends ArrayAdapter<RecipesView> {
    private static final String TAG = "RecipesAdapter";
    private Context mContext;
    int mResource = 0;

    public RecipesAdapter(Context context, ArrayList<RecipesView> personList) {
        super(context, 0, personList);
        mContext = context;
        Log.i(TAG, "RecipesAdapter (constructor)");
    }

    public View getView(int pos, View convertView, ViewGroup parent) {
        Log.i(TAG, "getView");
        View currentView = convertView;
        RecipesView recipe = getItem(pos);

        if (currentView == null)
            currentView = LayoutInflater.from(mContext).inflate(R.layout.recipe_card, parent, false);

        LinearLayout linLayout = (LinearLayout) currentView.findViewById(R.id.recipe_card);
        TextView recipeName = (TextView) currentView.findViewById(R.id.recipe_card_textview);
        ImageView recipeImg = (ImageView) currentView.findViewById(R.id.recipe_card_imageview);


        linLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = recipeName.getText().toString();

                for (Recipe r : SharedData.recipeSet) {
                    if (r.getName().equals(name)) {
                        SharedData.choosenRecipe = r;
                        Log.i("Recipe", r.getName());

                        //NavController navController = Navigation.findNavController(R.id.mobile_navigation);
                        //navController.navigate(R.id);
                        //Intent intent = new Intent(getContext(), RecipeFragment.class);
                        //getContext().startActivity(intent);
                        break;
                    }
                }
            }
        });


//        boolean cookable = RecipeBank.getRecipe(recipe.getImg()).canBeCookedWith(SharedData.ingQtySet);
//        Log.i(TAG, "recipe " + recipe.getImg() + " cookable: " + cookable);

        recipeName.setTextColor(recipe.getColor());
        recipeName.setText(recipe.getName());
        recipeImg.setImageResource(SharedData.recipeImgs[recipe.getImg() - 1]);
        return currentView;
    }
}
