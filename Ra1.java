package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ra1 extends Activity{
	Button rfirstsem,rsecondsem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ra1);
		rfirstsem=(Button)findViewById(R.id.button1);
		rsecondsem=(Button)findViewById(R.id.button2);
		rfirstsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent rfs=new Intent(Ra1.this,);
				startActivity(rfs);
			}
		});
		rsecondsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent rss=new Intent(Ra1.this,);
				startActivity(rss);
			}
		});
	}
}
