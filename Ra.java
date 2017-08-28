package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ra extends Activity{
	Button rfirst,rsecond;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ra);
		rfirst=(Button)findViewById(R.id.button1);
		rsecond=(Button)findViewById(R.id.button2);
		rfirst.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent rf=new Intent(Ra.this,);
				startActivity(rf);
			}
		});
		rsecond.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent rs=new Intent(Ra.this,);
				startActivity(rs);
			}
		});
	}

}
