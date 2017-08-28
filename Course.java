package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Course extends Activity {
	RadioButton jrf, bitp, ra;
	Button next;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.course);
		jrf=(RadioButton)findViewById(R.id.radioButton1);
		bitp=(RadioButton)findViewById(R.id.radioButton2);
		ra=(RadioButton)findViewById(R.id.radioButton3);
		next=(Button)findViewById(R.id.button1);
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent j=new Intent(Course.this,);
				startActivity(j);
			}
		});
		
	}
}
