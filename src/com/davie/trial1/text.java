package com.davie.trial1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class text extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		Button myButton = (Button) findViewById(R.id.textbutton1);
		final ToggleButton myToggle = (ToggleButton) findViewById(R.id.texttogbutton1);
		final EditText myEditor = (EditText) findViewById(R.id.etCommands);
		final TextView myText = (TextView) findViewById(R.id.textyatextView1);

		myToggle.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (myToggle.isChecked()) {
					myEditor.setInputType(InputType.TYPE_CLASS_TEXT
							| InputType.TYPE_TEXT_VARIATION_PASSWORD);
				} else {
					myEditor.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});
		myButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				myText.setText(myEditor.getText().toString());
				myText.setTextColor(Color.CYAN);

			}
		});
	}

}
