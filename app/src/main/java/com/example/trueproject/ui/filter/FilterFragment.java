package com.example.trueproject.ui.filter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trueproject.R;
import com.example.trueproject.custom_classes.RecipeType;

public class FilterFragment extends Fragment {
    private GridView gridView;
    private FilterViewModel filterViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        filterViewModel =
                new ViewModelProvider(this).get(FilterViewModel.class);
        View root = inflater.inflate(R.layout.fragment_filter, container, false);

        gridView = (GridView) root.findViewById(R.id.filter_gridview);
        initGridViewData();

        return root;
    }

    private void initGridViewData() {
        RecipeType[] recipeTypes = RecipeType.values();
        ArrayAdapter<RecipeType> arrayAdapter
                = new ArrayAdapter<>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_multiple_choice, recipeTypes);

        gridView.setAdapter(arrayAdapter);

        for (int i = 0; i < recipeTypes.length; i++)
            gridView.setItemChecked(i, recipeTypes[i].isSelected());
    }
}
