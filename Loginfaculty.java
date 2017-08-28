package com.example.onlineattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Loginfaculty extends Activity {
    EditText userno,password;
    Button signin,register;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
	 // TODO Auto-generated method stub
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.loginfaculty);
	 userno=(EditText)findViewById(R.id.editText1);
	 password=(EditText)findViewById(R.id.editText2);
	 signin=(Button)findViewById(R.id.button1);
	 register=(Button)findViewById(R.id.button2);
	 register.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent f=new Intent(Loginfaculty.this,Register.class);
			startActivity(f);
			
		}
	});
	 signin.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent f1=new Intent(Loginfaculty.this,);
			startActivity(f1);
		}
	});
	
}
}
