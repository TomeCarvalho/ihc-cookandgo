package com.example.trueproject.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.trueproject.R;

import java.util.*;

public class IngredientsViewAdapter extends ArrayAdapter<IngredientsView> {

    public IngredientsViewAdapter(@NonNull Context context, ArrayList<IngredientsView> arrayList) {
        super(context,0,arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentItemView = convertView;

        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.ingredients_listview, parent, false);
        }

        // get the position of the view from the ArrayAdapter
        IngredientsView currentNumberPosition = getItem(position); // AKA a "for each" selecionado

        // then according to the position of the view assign the desired name for the same
        TextView name = currentItemView.findViewById(R.id.ing_name);
        name.setText(currentNumberPosition.getName());

        // Obter a view para o edit
        EditText qntd = currentItemView.findViewById(R.id.ing_edit1);
        qntd.setText(currentNumberPosition.getQuantity());

        TextView unit = currentItemView.findViewById(R.id.ing_unit);
        unit.setText(currentNumberPosition.getUnit().getName());

        // Button minus = currentItemView.findViewById(R.id.ing_minus);

        // EditText change = currentItemView.findViewById(R.id.ing_edit2);

        // Button plus = currentItemView.findViewById(R.id.ing_plus);

        return currentItemView;
    }

}
