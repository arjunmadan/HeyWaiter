package com.orderthis.heywaiter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Starters extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_starters);
		
		Button b1 = (Button) findViewById (R.id.button1);
		Button b2 = (Button) findViewById (R.id.button2);
        
        b1.setOnClickListener(new View.OnClickListener(){
        	 public void onClick(View v){
        		 //Context context = getApplicationContext();
        		 
        		 Intent intent = new Intent(getApplicationContext(), MainCourse.class);
       	    	 startActivity(intent);
        	 }
        });
        
        b2.setOnClickListener(new View.OnClickListener(){
       	 public void onClick(View v){
       		 //Context context = getApplicationContext();
       		 
       		 Intent intent = new Intent(getApplicationContext(), WelcomePage.class);
      	    	 startActivity(intent);
       	 }
       });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.starters, menu);
		return true;
	}

}
