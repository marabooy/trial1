package com.davie.trial1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class dashBoard extends ListActivity {

	String classes[] = { "Trial1Activity", "text", "Trial1Activity" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(dashBoard.this,
				android.R.layout.simple_list_item_1, classes));

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String mystring = classes[position];
		super.onListItemClick(l, v, position, id);
		try {
			Class ourClass = Class.forName("com.davie.trial1." + mystring);

			Intent ourIntent = new Intent(dashBoard.this, ourClass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
