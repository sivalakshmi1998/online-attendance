package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ra2 extends Activity{
	Button rthirdsem,rfourthsem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ra2);
		rthirdsem=(Button)findViewById(R.id.button1);
		rfourthsem=(Button)findViewById(R.id.button2);
		rthirdsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent rts=new Intent(Ra2.this,);
				startActivity(rts);
			}
		});
		rfourthsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent rfs=new Intent(Ra2.this,);
				startActivity(rfs);
			}
		});
	}
}
