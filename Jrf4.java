package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Jrf4 extends Activity {
	Button jseventhsem, jeighthsem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jrf4);
		jseventhsem=(Button)findViewById(R.id.button1);
		jeighthsem=(Button)findViewById(R.id.button2);
		jseventhsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ses=new Intent(Jrf4.this,);
				startActivity(ses);
			}
		});
		jeighthsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent es=new Intent(Jrf4.this,);
				startActivity(es);
			}
		});
	}
}
