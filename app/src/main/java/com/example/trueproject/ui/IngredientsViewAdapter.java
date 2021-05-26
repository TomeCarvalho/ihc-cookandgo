package com.example.trueproject.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.trueproject.R;
import com.example.trueproject.custom_classes.IngredientQuantity;
import com.example.trueproject.custom_classes.SharedData;

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
        TextView qntd = currentItemView.findViewById(R.id.ing_edit1);
        qntd.setText(currentNumberPosition.getQuantity());

        TextView unit = currentItemView.findViewById(R.id.ing_unit);
        unit.setText(currentNumberPosition.getUnit().getName());

        Button minus = currentItemView.findViewById(R.id.ing_minus);
        EditText change = currentItemView.findViewById(R.id.ing_edit2);
        Button plus = currentItemView.findViewById(R.id.ing_plus);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation("-", change, qntd, currentNumberPosition);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operation("+", change, qntd, currentNumberPosition);
            }
        });


        return currentItemView;
    }

    public void operation(String str, EditText change, TextView qntd, IngredientsView currentNumberPosition) {
        if (change.getText().length() <= 0) {
            Toast toast = Toast.makeText(getContext(), R.string.toast_message, Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        double val = Double.parseDouble(currentNumberPosition.getQuantity());
        if (str.equals("-")) val -= Double.parseDouble(change.getText().toString());
        else if (str.equals("+")) val += Double.parseDouble(change.getText().toString());

        if (val < 0) val = 0.0;

        String qtd = String.valueOf(val);
        currentNumberPosition.setQuantity(qtd);
        qntd.setText(qtd);
        Log.i("TAG", "teste");
        for (IngredientQuantity ig : SharedData.ingQtySet) {
            Log.i("TAG", "ig.getName(): " + ig.getIngredient().getName());
            Log.i("TAG", "currentNumberPosition.getName(): " + currentNumberPosition.getName());
            if (ig.getIngredient().getName().equals(currentNumberPosition.getName())) {
                ig.setQuantity(Double.parseDouble(qtd));
                Log.i("TAG", "houve update em " + currentNumberPosition.getName() + " para " + ig.getQuantity());
                break;
            }
        }
        //Log.i("TAG", "change: " + change.getText());

    }

}
