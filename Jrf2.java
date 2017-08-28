package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Jrf2 extends Activity {
	Button jthirdsem, jfourthsem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jrf2);
		jthirdsem=(Button)findViewById(R.id.button1);
		jfourthsem=(Button)findViewById(R.id.button2);
		jthirdsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ts=new Intent(Jrf2.this,);
				startActivity(ts);
			}
		});
		jfourthsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent fos=new Intent(Jrf2.this,);
				startActivity(fos);
			}
		});
	}
}
