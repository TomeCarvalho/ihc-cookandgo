package com.example.trueproject.custom_classes;


public enum Allergies {
	PEANUTS("Amendoins"),
	MILK("Leite"),
	SHELLFISH("Marisco"),
	NUTS("Nozes"),
	EGGS("Ovos"),
	FISH("Peixe"),
	SOYBEANS("Soja"),
	WHEAT("Trigo");


	private String name;
	private boolean selected = false;

	private Allergies(String name) {
		this.name = name;
	}

	public void setSelected(boolean v) {
		selected = v;
	}

	public String getName() {
		return name;
	}

	public boolean isSelected() {
		return selected;
	}

	@Override
	public String toString() {
		return name;
	}
}

/*
public class AllergiesAdapter extends ArrayAdapter<Allergies> {
	private List<Allergies> alList;
	private Context context;

	public AllergiesAdapter(List<Allergies> alList, Context context) {
		super(context, R.layout.fragment_notifications, alList);
		this.alList = alList;
		this.context = context;
	}

	private static class AllergiesHolder {
		public CheckBox chkBox;
		public TextView name;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;

		AllergiesHolder holder = new AllergiesHolder();

		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

			holder.chkBox = (CheckBox) v.findViewById(R.id.allergy_check);
			holder.chkBox.setText(R.string.teste);

			holder.chkBox.setOnCheckedChangeListener((NotificationsViewModel) context);
		}
		else {
			holder = (AllergiesHolder) v.getTag();
		}

		Allergies a = alList.get(position);
		holder.chkBox.setChecked(a.isSelected());
		holder.chkBox.setTag(a);

		return v;
	}

}
 */
