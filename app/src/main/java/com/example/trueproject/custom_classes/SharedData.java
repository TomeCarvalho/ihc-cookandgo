package com.example.trueproject.custom_classes;

import android.util.Log;

public class SharedData {
    public static Allergies[] allergies = Allergies.values();

    public static void debugAllergies() {
        for (Allergies a : allergies)
            Log.i("SharedData allergy", String.valueOf(a.isSelected()));
    }
}
