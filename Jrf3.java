package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Jrf3 extends Activity{
	Button jfifthsem,jsixthsem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jrf3);
		jfifthsem=(Button)findViewById(R.id.button1);
		jsixthsem=(Button)findViewById(R.id.button2);
		jfifthsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent fis=new Intent(Jrf3.this,);
				startActivity(fis);
			}
		});
		jsixthsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent sis=new Intent(Jrf3.this,);
				startActivity(sis);
			}
		});
	}

}
