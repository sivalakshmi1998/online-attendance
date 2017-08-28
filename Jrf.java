package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Jrf extends Activity{
	Button first,second,third,fourth;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jrf);
		first=(Button)findViewById(R.id.button1);
		second=(Button)findViewById(R.id.button2);
		third=(Button)findViewById(R.id.button3);
		fourth=(Button)findViewById(R.id.button4);
		first.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent fi=new Intent(Jrf.this,Jrf1.class);
				startActivity(fi);
			}
		});
		second.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent se=new Intent(Jrf.this,Jrf2.class);
				startActivity(se);
			}
		});
		third.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent th=new Intent(Jrf.this,);
				startActivity(th);
			}
		});
		fourth.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent fo=new Intent(Jrf.this,);
				startActivity(fo);
				
			}
		});
	}

}
