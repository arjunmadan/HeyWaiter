package com.orderthis.heywaiter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;


/**
 * Created by Mithil Arun on 10/11/13.
 */
public class ThankYou extends Activity {

	private MenuDAO datasource;

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        
        datasource = ((ContextSaver)getApplication()).datasource;
		Button b1 = (Button) findViewById (R.id.button1);
    
		b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            	datasource.close();
            	Confirm.flag = true;
            	Desserts.flag = true;
            	MainCourse.flag = true;
            	Starters.flag = true;
            	WelcomePage.flag = true;
            	finish();
            }
		});
		
		

		Button b2 = (Button) findViewById (R.id.button2);
	    
		b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
            	emailIntent.setType("text/html");
            	emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, "heywaitertheapp@outlook.com");
            	emailIntent.putExtra(android.content.Intent.EXTRA_CC, "heywaitertheapp@outlook.com");
            	emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Feedback for HeyWaiter!");
            	emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Send this message to heywaitertheapp@outlook.com");
            	startActivity(Intent.createChooser(emailIntent, "Send Mail"));
            }
		});
	
	}
}