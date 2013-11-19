package com.orderthis.heywaiter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class Starters extends Activity {

    private MenuDAO datasource;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_starters);


        datasource = ((ContextSaver)getApplication()).datasource;

		Button b1 = (Button) findViewById (R.id.button1);
		Button b2 = (Button) findViewById (R.id.button2);
        
        b1.setOnClickListener(new View.OnClickListener(){
        	 public void onClick(View v){
                 EditText cheeseRolls=(EditText)findViewById(R.id.quantStCR);
                 EditText onionRings=(EditText)findViewById(R.id.quantStOR);
                 EditText fishSticks=(EditText)findViewById(R.id.quantStFS);
                 EditText bbqChicken=(EditText)findViewById(R.id.quantStBCW);

                 if(!cheeseRolls.getText().toString().equals(""))
                 {
                     datasource.addItem("Cheese Rolls","Starters",Integer.parseInt(cheeseRolls.getText().toString()));
                 }
                 if(!onionRings.getText().toString().equals(""))
                 {
                     datasource.addItem("Onion Rings","Starters",Integer.parseInt(onionRings.getText().toString()));
                 }
                 if(!fishSticks.getText().toString().equals(""))
                 {
                     datasource.addItem("Fish Sticks","Starters",Integer.parseInt(fishSticks.getText().toString()));
                 }
                 if(!bbqChicken.getText().toString().equals(""))
                 {
                     datasource.addItem("Barbeque Chicken Wings","Starters",Integer.parseInt(bbqChicken.getText().toString()));
                 }
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
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
