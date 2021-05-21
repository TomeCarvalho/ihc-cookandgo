package com.example.trueproject.custom_classes;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.example.trueproject.R;

import java.util.List;

public enum Allergies {
	MILK("leite"),
	EGGS("ovos"),
	FISH("peixe"),
	SHELLFISH("marisco"),
	NUTS("nozes"),
	PEANUTS("amendoins"),
	WHEAT("trigo"),
	SOYBEANS("soja");

	private String name;

	private Allergies(String name) {
		this.name = name;
	}
}

public class AllergiesAdapter extends ArrayAdapter<Allergies> {
	private List<Allergies> alList;
	private Context context;

	public AllergiesAdapter(List<Allergies> alList, Context context) {
		super(context, R.layout);
	}

}