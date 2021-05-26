package com.example.trueproject.ui.ingredients;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;


public class IngredientsFragment extends Fragment {
    private IngredientsViewModel ingredientsViewModel;
    public static final String TAG = "";
    public ListView listView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ingredientsViewModel =
                new ViewModelProvider(this).get(IngredientsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ingredients, container, false);

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
        if (!SharedData.ingredientsLoaded)
            SharedData.loadJoaquina();

        //ArrayList<IngredientsView> arr = new ArrayList<>();
        Set<IngredientQuantity> col = SharedData.ingQtySet;
        IngredientsView[] arr2 = new IngredientsView[IngredientBank.size()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new IngredientsView(IngredientBank.get(i+1).getName(), String.valueOf(0), IngredientBank.get(i+1).getUnit());
        }
        for (IngredientQuantity iq : col) {
            Ingredient i = iq.getIngredient();
            int id = i.getId();
            arr2[id - 1] = new IngredientsView(i.getName(), String.valueOf(iq.getQuantity()), i.getUnit());
            //arr.add(new IngredientsView(i.getName(), String.valueOf(iq.getQuantity()), i.getUnit()));
        }
        ArrayList<IngredientsView> arr = new ArrayList<IngredientsView>(Arrays.asList(arr2));
        //for (IngredientQuantity iq : col) {
        //    Ingredient i = iq.getIngredient();
        //    arr.add(new IngredientsView(i.getName(), String.valueOf(iq.getQuantity()), i.getUnit()));
        //}
        IngredientsViewAdapter adap = new IngredientsViewAdapter(getActivity().getApplicationContext(), arr);
        listView.setAdapter(adap);
        SharedData.ingredientsLoaded = true;
    }
}