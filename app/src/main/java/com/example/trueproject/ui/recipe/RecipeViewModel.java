package com.example.trueproject.ui.recipe;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trueproject.custom_classes.Recipe;
import com.example.trueproject.custom_classes.RecipeBank;

public class RecipeViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    private Recipe rec;
    public RecipeViewModel(int id) {
        rec= RecipeBank.getRecipe(id); //maybe idk
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }
    public Recipe getRec(){
        return rec;
    }
    public LiveData<String> getText() {
        return mText;
    }
}