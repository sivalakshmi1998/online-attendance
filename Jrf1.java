package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Jrf1 extends Activity{
	Button jfirstsem,jsecondsem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jrf1);
		jfirstsem=(Button)findViewById(R.id.button1);
		jsecondsem=(Button)findViewById(R.id.button2);
		jfirstsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent fs=new Intent(Jrf1.this,);
				startActivity(fs);
			}
		});
		jsecondsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ss=new Intent(Jrf1.this,);
				startActivity(ss);
			}
		});
	}

}
