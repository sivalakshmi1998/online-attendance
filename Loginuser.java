package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Loginuser extends Activity {
	EditText username, password;
	Button signin, register;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user);
		username = (EditText) findViewById(R.id.editText1);
		password = (EditText) findViewById(R.id.editText2);
		register=(Button)findViewById(R.id.button1);
		signin=(Button)findViewById(R.id.button2);
		register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent r = new Intent(Loginuser.this, Register.class);
				startActivity(r);

			}
		});
		signin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Loginuser.this,);
				startActivity(i);
				
			}
		});
	}
}
