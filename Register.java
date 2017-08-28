package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Register extends Activity {
	EditText name, rollno, password, reenter, email, contact;
	Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		name = (EditText) findViewById(R.id.editText1);
		rollno = (EditText) findViewById(R.id.editText2);
		password = (EditText) findViewById(R.id.editText3);
		reenter = (EditText) findViewById(R.id.editText4);
		email = (EditText) findViewById(R.id.editText5);
		contact = (EditText) findViewById(R.id.editText6);
		submit = (Button) findViewById(R.id.button1);
		submit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent s = new Intent(Register.this, Course.class);
				startActivity(s);

			}
		});
	}
}
