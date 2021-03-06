package com.example.trueproject.ui.profile;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trueproject.custom_classes.*;

import com.example.trueproject.R;

public class ProfileFragment extends Fragment {
    private ProfileViewModel profileViewModel;
    public static final String TAG = "";
    private ListView listView;
    private Button button;
    private Switch vegan;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profileViewModel =
                new ViewModelProvider(this).get(ProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        listView = (ListView) root.findViewById(R.id.listView);
        vegan = (Switch) root.findViewById(R.id.switch_vegan);
        button = (Button) root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save(view);
            }
        });

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG, "onItemClick: " + position);
                CheckedTextView v = (CheckedTextView) view;
                boolean currentCheck = v.isChecked();
                Log.i("isChecked", String.valueOf(currentCheck));
                Allergies al = (Allergies) listView.getItemAtPosition(position);
                al.setSelected(currentCheck);
            }
        });

        initListViewData();

        return root;
    }

    private void initListViewData() {
        Allergies[] als = Allergies.values();

        // android.R.layout.simple_list_item_checked:
        // ListItem is very simple (Only one CheckedTextView).
        ArrayAdapter<Allergies> arrayAdapter
                = new ArrayAdapter<>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_multiple_choice, als);

        listView.setAdapter(arrayAdapter);

        for (int i = 0; i < als.length; i++)
            listView.setItemChecked(i, als[i].isSelected());
    }

    public void save(View view) {
        for (int i = 0; i < listView.getCount(); i++) {
            Log.i("allergyLV", String.valueOf(i));
            Allergies al = (Allergies) listView.getItemAtPosition(i);
            Log.i("allergyLV", String.valueOf(al.isSelected()));
            // SharedData.allergies[i].setSelected(al.isSelected());
            if (al.isSelected())
                SharedData.allergySet.add(al);
            else
                SharedData.allergySet.remove(al);
        }
        SharedData.debugAllergies();
        SharedData.vegetarian = vegan.isChecked();
        Log.i("vegan: ", String.valueOf(vegan.isChecked()));
        Toast.makeText(getActivity().getApplicationContext(), "Guardado", Toast.LENGTH_SHORT).show();
        SharedData.updateRecipes();
    }
}

