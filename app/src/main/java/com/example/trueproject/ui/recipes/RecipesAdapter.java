package com.example.trueproject.ui.recipes;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.trueproject.R;
import com.example.trueproject.custom_classes.RecipeBank;
import com.example.trueproject.custom_classes.SharedData;
import com.example.trueproject.ui.recipe.RecipeFragment;

import java.util.ArrayList;

public class RecipesAdapter extends ArrayAdapter<RecipesView> {
    private static final String TAG = "RecipesAdapter";
    private Context mContext;
    private FragmentManager fragMan;
    int mResource = 0;

    public RecipesAdapter(Context context, ArrayList<RecipesView> personList, FragmentManager fragmentManager) {
        super(context, 0, personList);
        mContext = context;
        fragMan = fragmentManager;
        Log.i(TAG, "RecipesAdapter (constructor)");
    }

    public View getView(int pos, View convertView, ViewGroup parent) {
        Log.i(TAG, "getView");
        View currentView = convertView;
        RecipesView recipesView = getItem(pos);

        if (currentView == null)
            currentView = LayoutInflater.from(mContext).inflate(R.layout.recipe_card, parent, false);

        LinearLayout linLayout = (LinearLayout) currentView.findViewById(R.id.recipe_card);
        TextView recipeName = (TextView) currentView.findViewById(R.id.recipe_card_textview);
        ImageView recipeImg = (ImageView) currentView.findViewById(R.id.recipe_card_imageview);

        recipeName.setTextColor(recipesView.getColor());
        recipeName.setText(recipesView.getName());
        recipeImg.setImageResource(SharedData.recipeImgs[recipesView.getImg() - 1]);
        return currentView;
    }
}
