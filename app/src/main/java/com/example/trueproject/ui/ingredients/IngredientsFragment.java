package com.example.trueproject.ui.ingredients;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.trueproject.R;
import com.example.trueproject.custom_classes.Ingredient;
import com.example.trueproject.custom_classes.IngredientBank;
import com.example.trueproject.custom_classes.IngredientQuantity;
import com.example.trueproject.custom_classes.SharedData;
import com.example.trueproject.ui.IngredientsView;
import com.example.trueproject.ui.IngredientsViewAdapter;

import java.util.*;


public class IngredientsFragment extends Fragment {
    private IngredientsViewModel ingredientsViewModel;
    public static final String TAG = "";
    public ListView listView;
    private androidx.appcompat.widget.SearchView searchView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ingredientsViewModel =
                new ViewModelProvider(this).get(IngredientsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ingredients, container, false);

        searchView = (androidx.appcompat.widget.SearchView) root.findViewById(R.id.ingredients_searchview);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                SharedData.ingSearchQuery = query.toLowerCase();
                initIngredients();
                return true;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }
        });
        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                SharedData.ingSearchQuery = "";
                initIngredients();
                return true;
            }
        });

        listView = (ListView) root.findViewById(R.id.lv_ingredients);

        ingredientsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                // textView.setText(s);
            }
        });

        initIngredients();

        return root;
    }

    private void initIngredients() {
        ArrayList<IngredientsView> arr = new ArrayList<>();
        SharedData.updateIngQtySetFiltered();
        Set<IngredientQuantity> col = SharedData.ingQtySetFiltered;

        for (IngredientQuantity iq : col) {
            Ingredient i = iq.getIngredient();
            arr.add(new IngredientsView(i.getName(), String.valueOf(iq.getQuantity()), i.getUnit()));
        }

        IngredientsViewAdapter adap = new IngredientsViewAdapter(getActivity().getApplicationContext(), arr);
        listView.setAdapter(adap);
        SharedData.ingredientsLoaded = true;
    }

//    private void initIngredients() {
//        ArrayList<IngredientsView> arr = new ArrayList<>();
//        Set<IngredientQuantity> col = SharedData.ingQtySet;
//
//        for (IngredientQuantity iq : col) {
//            Ingredient i = iq.getIngredient();
//            arr.add(new IngredientsView(i.getName(), String.valueOf(iq.getQuantity()), i.getUnit()));
//        }
//
//        IngredientsViewAdapter adap = new IngredientsViewAdapter(getActivity().getApplicationContext(), arr);
//        listView.setAdapter(adap);
//        SharedData.ingredientsLoaded = true;
//    }
}