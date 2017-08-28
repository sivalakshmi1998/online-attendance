package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class Att extends Activity {
	Button consol;
	Spinner month;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.att);
		consol = (Button) findViewById(R.id.button1);
		month = (Spinner) findViewById(R.id.spinner1);
		consol.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent con=new Intent(Att.this,);
				startActivity(con);
			}
		});
	}
}
