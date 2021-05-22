package com.example.trueproject.custom_classes;

import android.util.Log;
import java.util.*;

public class SharedData {
    public static Set<Allergies> allergySet = new HashSet<>();

    public static void debugAllergies() {
        for (Allergies a : allergySet)
            Log.i("SharedData allergy", a.getName());
    }
}
