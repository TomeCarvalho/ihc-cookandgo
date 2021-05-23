package com.example.trueproject.ui.recipes; //

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.trueproject.custom_classes.Recipe;
import com.example.trueproject.R;
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
        String name = recipe.getName();
        int img = recipe.getImg();

        if (currentView == null)
            currentView = LayoutInflater.from(mContext).inflate(R.layout.recipe_card, parent, false);

        TextView recipeName = (TextView) currentView.findViewById(R.id.recipe_card_textview);
        ImageView recipeImg = (ImageView) currentView.findViewById(R.id.recipe_card_imageview);

        recipeName.setText(name);
        recipeImg.setImageResource(R.drawable.test_img); // TODO: replace with image

        return currentView;
    }
}
