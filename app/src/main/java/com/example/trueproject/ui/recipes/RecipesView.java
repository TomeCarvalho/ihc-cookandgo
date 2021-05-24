package com.example.trueproject.ui.recipes;

import android.graphics.drawable.Drawable;
import com.example.trueproject.R;

public class RecipesView {
    private String name;
    private int img;

    public RecipesView(String name, int img) {
        this.name = name;
        this.img = img;
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
