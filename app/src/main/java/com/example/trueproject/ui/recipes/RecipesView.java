package com.example.trueproject.ui.recipes;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.example.trueproject.R;

public class RecipesView {
    private String name;
    private int img;
    private boolean cookable;

    public RecipesView(String name, int img, boolean cookable) {
        this.name = name;
        this.img = img;
        this.cookable = cookable;
    }

    public RecipesView(String name, int img) {
        this(name, img, false);
    }

    public int getColor() {
        return cookable ? Color.parseColor("#006400") : Color.RED;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
