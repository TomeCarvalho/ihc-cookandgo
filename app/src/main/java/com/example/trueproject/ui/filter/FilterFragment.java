package com.example.trueproject.ui.filter;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trueproject.R;
import com.example.trueproject.custom_classes.Difficulty;
import com.example.trueproject.custom_classes.RecipeType;
import com.example.trueproject.custom_classes.SharedData;
import com.example.trueproject.custom_classes.SortType;
import com.example.trueproject.ui.recipe.RecipeFragment;
import com.example.trueproject.ui.recipes.RecipesFragment;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class FilterFragment extends Fragment {
    private final String TAG = "FilterFragment";
    private SwitchMaterial reverseSwitch;
    private GridView recipeTypesGV;
    private GridView difficultyGV;
    private RadioButton sortName;
    private RadioButton sortTime;
    private RadioButton sortDifficulty;
    private Button saveButton;
    private CheckBox onlyCookables;
    // private SearchView searchView;
//    private EditText searchEditText;
//    private Button searchButton;
    private FilterViewModel filterViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        filterViewModel =
                new ViewModelProvider(this).get(FilterViewModel.class);
        View root = inflater.inflate(R.layout.fragment_filter, container, false);

        recipeTypesGV = (GridView) root.findViewById(R.id.filter_gridview_recipetypes);
        recipeTypesGV.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        recipeTypesGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG, "onItemClick: " + position);
                CheckedTextView v = (CheckedTextView) view;
                boolean currentCheck = v.isChecked();
                Log.i("isChecked", String.valueOf(currentCheck));
                RecipeType recipeType = (RecipeType) recipeTypesGV.getItemAtPosition(position);
                recipeType.setSelected(currentCheck);
            }
        });

        difficultyGV = (GridView) root.findViewById(R.id.filter_gridview_difficulty);
        difficultyGV.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        difficultyGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG, "difficultyGV onItemClick: " + position);
                CheckedTextView v = (CheckedTextView) view;
                boolean currentCheck = v.isChecked();
                Log.i("isChecked", String.valueOf(currentCheck));
                Difficulty difficulty = (Difficulty) difficultyGV.getItemAtPosition(position);
                difficulty.setSelected(currentCheck);
            }
        });

        reverseSwitch = (SwitchMaterial) root.findViewById(R.id.sort_switch);
        reverseSwitch.setChecked(SharedData.reverseSort);

        sortName = (RadioButton) root.findViewById(R.id.sort_name);
        sortTime = (RadioButton) root.findViewById(R.id.sort_time);
        sortDifficulty = (RadioButton) root.findViewById(R.id.sort_difficulty);

        RadioButton rb = null;
        switch (SharedData.sortType) {
            case NAME:
                rb = sortName;
                break;
            case TIME:
                rb = sortTime;
                break;
            case DIFFICULTY:
                rb = sortDifficulty;
        }
        rb.setChecked(true);

        onlyCookables = (CheckBox) root.findViewById(R.id.cookable_checkbox);
        onlyCookables.setChecked(!SharedData.showUncookables);

        saveButton = (Button) root.findViewById(R.id.filter_save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save(v);
            }
        });

//        searchEditText = (EditText) root.findViewById(R.id.search_edittext);
//        searchButton = (Button) root.findViewById(R.id.search_button);
//        searchButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "searchButton onClick");
//                SharedData.searchQuery = searchEditText.getText().toString();
//                SharedData.updateRecipes();
//            }
//        });
//        searchView = (SearchView) root.findViewById(R.id.recipes_searchview);
//        searchView.setOnSearchClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "searchView onClick");
//                SharedData.searchQuery = (String) searchView.getQuery();
//                SharedData.updateRecipes();
//            }
//        });
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                Log.i(TAG, "onQueryTextSubmit - query: " + query);
//                SharedData.searchQuery = query;
//                SharedData.updateRecipes();
//                return true;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                Log.i(TAG, "onQueryTextChange - newText" + newText);
//                return true;
//            }
//        });

        initRecipeTypesGVData();
        initDifficultiesGVData();
        return root;
    }

    private void initRecipeTypesGVData() {
        RecipeType[] recipeTypes = RecipeType.values();
        ArrayAdapter<RecipeType> arrayAdapter
                = new ArrayAdapter<>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_multiple_choice, recipeTypes);

        recipeTypesGV.setAdapter(arrayAdapter);
        RecipeType rt;
        for (int i = 0; i < recipeTypes.length; i++) {
            rt = (RecipeType) recipeTypesGV.getItemAtPosition(i);
            recipeTypesGV.setItemChecked(i, rt.isSelected());
        }
    }

    private void initDifficultiesGVData() {
        Difficulty[] difficulties = Difficulty.values();
        ArrayAdapter<Difficulty> arrayAdapter
                = new ArrayAdapter<>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_multiple_choice, difficulties);

        difficultyGV.setAdapter(arrayAdapter);
        Difficulty difficulty;
        for (int i = 0; i < difficulties.length; i++) {
            difficulty = (Difficulty) difficultyGV.getItemAtPosition(i);
            difficultyGV.setItemChecked(i, difficulty.isSelected());
        }
    }

    public void save(View view) {
        SharedData.reverseSort = reverseSwitch.isChecked();
        SharedData.showUncookables = !onlyCookables.isChecked();
        if (sortName.isChecked())
            SharedData.sortType = SortType.NAME;
        else if (sortTime.isChecked())
            SharedData.sortType = SortType.TIME;
        else if (sortDifficulty.isChecked())
            SharedData.sortType = SortType.DIFFICULTY;
        else
            Log.i(TAG, "bug on save: no sort is selected");
        saveRecipeTypes(view);
        saveDifficulty(view);
        SharedData.updateRecipes();
        Toast.makeText(getActivity().getApplicationContext(), "Guardado", Toast.LENGTH_SHORT).show();
        // go back to recipes page
        RecipesFragment recipesFragment = new RecipesFragment();
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.filter_constraint, recipesFragment, "findThisFragment")
                .commit();
    }

    public void saveRecipeTypes(View view) {
        for (int i = 0; i < recipeTypesGV.getCount(); i++) {
            Log.i(TAG, String.valueOf(i));
            RecipeType rt = (RecipeType) recipeTypesGV.getItemAtPosition(i);
            Log.i(TAG, String.valueOf(rt.isSelected()));

            if (rt.isSelected())
                SharedData.recipeTypeSet.add(rt);
            else
                SharedData.recipeTypeSet.remove(rt);
        }
    }

    public void saveDifficulty(View view) {
        for (int i = 0; i < difficultyGV.getCount(); i++) {
            Log.i(TAG, String.valueOf(i));
            Difficulty difficulty = (Difficulty) difficultyGV.getItemAtPosition(i);
            Log.i(TAG, String.valueOf(difficulty.isSelected()));

            if (difficulty.isSelected())
                SharedData.difficultySet.add(difficulty);
            else
                SharedData.difficultySet.remove(difficulty);
        }
    }
}
