package com.orderthis.heywaiter;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class WelcomePage extends Activity {
	private MenuDAO datasource;
	static boolean flag = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_page);
		Button b1 = (Button) findViewById (R.id.button1);
        
        b1.setOnClickListener(new View.OnClickListener(){
        	 public void onClick(View v){
        		 //Context context = getApplicationContext();
        		 
        		 Intent intent = new Intent(getApplicationContext(), Starters.class);
       	    	 startActivity(intent);
        	 }
        });
        
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome_page, menu);
		return true;
	}

    @Override
    protected void onResume() {
        super.onResume();
        if(flag)
        	{
        		datasource = ((ContextSaver)getApplication()).datasource;
        		datasource.open();
        		Confirm.flag = false;
        		Desserts.flag = false;
        		MainCourse.flag = false;
        		Starters.flag = false;
        		WelcomePage.flag = false;
        		finish();
        	}
    }

    @Override
    protected void onPause() {
        super.onPause();
        
    }
}
