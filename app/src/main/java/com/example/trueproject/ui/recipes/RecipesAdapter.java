package com.example.trueproject.ui.recipes; ///

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.trueproject.custom_classes.Recipe;
import com.example.trueproject.R;
import com.example.trueproject.custom_classes.SharedData;

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
        // recipeImg.setImageResource(R.drawable.recipe1);
        // recipeImg.setImageURI(Uri.parse("app/src/main/res/drawable/recipe" + img + ".jpg")); // img ta cursed (2131165359)
        // TODO: how the fuck do you get the URI?
//        String packageName = "com.example.trueproject.ui.recipes";
//        recipeImg.setImageURI(Uri.parse("android.resource://" + packageName + "/drawable/recipe" + img + ".jpg"));
//        Log.i(TAG, "img: " + img);
//        Log.i(TAG, "Uri.parse: " + Uri.parse("recipe" + img));
        // String path = "app/src/main/res/drawable/recipe" + img + ".jpg";
        // String path = "D:\\UA\\IHC\\ihc-cookandgo\\app\\src\\main\\res\\drawable\\recipe" + img + ".jpg";
        // recipeImg.setImageBitmap(BitmapFactory.decodeFile(path));
        recipeImg.setImageResource(SharedData.recipeImgs[img - 1]);
        return currentView;
    }
}
