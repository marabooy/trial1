package com.davie.trial1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Trial1Activity extends Activity {
	/** Called when the activity is first created. */
	String gender;
	TextView display;
	Button male, female;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		male = (Button) findViewById(R.id.male);
		female = (Button) findViewById(R.id.female);
		display = (TextView) findViewById(R.id.displayer);
		// male onclick listener
		male.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				Context context = getApplicationContext();
				CharSequence text = "You should love women!";
				int duration = Toast.LENGTH_LONG;
				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
					
			}
		});

		// female onclick listener
		female.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				
				// TODO Auto-generated method stub
				Context context = getApplicationContext();
				CharSequence text = "loving women is not acrime!";
				int duration = Toast.LENGTH_LONG;
				Toast toast = Toast.makeText(context, text, duration);
				toast.show();

			}
		});

	}


	
	
}