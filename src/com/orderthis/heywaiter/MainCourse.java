package com.orderthis.heywaiter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainCourse extends Activity {
	static boolean flag = false; 
    private MenuDAO datasource;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_course);
		this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        datasource = ((ContextSaver)getApplication()).datasource;

		Button b1 = (Button) findViewById (R.id.button1);
		
		b1.setOnClickListener(new View.OnClickListener(){
       	 public void onClick(View v){
             EditText eggSaladSandwich=(EditText)findViewById(R.id.quantMcESS);
             EditText mushLasagna=(EditText)findViewById(R.id.quantMcML);
             EditText vegQuiche=(EditText)findViewById(R.id.quantMcVCQ);
             EditText lambBurger=(EditText)findViewById(R.id.quantMcSLB);
             EditText hamSteak=(EditText)findViewById(R.id.quantMcHS);
             EditText fenAlfredo=(EditText)findViewById(R.id.quantMcFA);
             EditText basilPasta=(EditText)findViewById(R.id.quantMcBTP);
             if(!eggSaladSandwich.getText().toString().equals(""))
             {
                 datasource.addItem("Egg Salad Sandwich","Main Course",Integer.parseInt(eggSaladSandwich.getText().toString()));
             }
             if(!mushLasagna.getText().toString().equals(""))
             {
                 datasource.addItem("Mushroom Lasagna","Main Course",Integer.parseInt(mushLasagna.getText().toString()));
             }
             if(!vegQuiche.getText().toString().equals(""))
             {
                 datasource.addItem("Veg Country Quiche","Main Course",Integer.parseInt(vegQuiche.getText().toString()));
             }
             if(!lambBurger.getText().toString().equals(""))
             {
                 datasource.addItem("Spiced Lamb Burger","Main Course",Integer.parseInt(lambBurger.getText().toString()));
             }
             if(!hamSteak.getText().toString().equals(""))
             {
                 datasource.addItem("Hamburger Steak","Main Course",Integer.parseInt(hamSteak.getText().toString()));
             }
             if(!fenAlfredo.getText().toString().equals(""))
             {
                 datasource.addItem("Fettuccine Alfredo","Main Course",Integer.parseInt(fenAlfredo.getText().toString()));
             }
             if(!basilPasta.getText().toString().equals(""))
             {
                 datasource.addItem("Basil Tomato Pasta","Main Course",Integer.parseInt(basilPasta.getText().toString()));
             }
       		 Intent intent = new Intent(getApplicationContext(), Desserts.class);
      	    	 startActivity(intent);
       	 }
       });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_course, menu);
		return true;
	}
    @Override
    protected void onResume() {
        super.onResume();
        if(flag)
        	finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
    
    }

}
