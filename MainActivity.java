package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button faculty, student;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        faculty=(Button)findViewById(R.id.button1);
        student=(Button)findViewById(R.id.button2);
        student.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent s=new Intent(MainActivity.this,Loginuser.class);
				startActivity(s);
				
			}
		});
        faculty.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent f=new Intent(MainActivity.this,Loginfaculty.class);
				startActivity(f);
				
			}
		});
	}
}