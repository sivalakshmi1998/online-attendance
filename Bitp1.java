package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Bitp1 extends Activity{
	Button bfirstsem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bitp1);
		bfirstsem=(Button)findViewById(R.id.button1);
		bfirstsem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent bfs=new Intent(Bitp1.this,);
				startActivity(bfs);
			}
		});
	}

}
