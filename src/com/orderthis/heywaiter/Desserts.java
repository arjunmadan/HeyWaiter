package com.orderthis.heywaiter;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Desserts extends Activity {

    private MenuDAO datasource;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_desserts);

        datasource = ((ContextSaver)getApplication()).datasource;

        Button b1 = (Button) findViewById (R.id.button1);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Context context = getApplicationContext();
                EditText raspTrifle=(EditText)findViewById(R.id.quantDeRT);
                EditText caramelCustard=(EditText)findViewById(R.id.quantDeCC);
                EditText applePie=(EditText)findViewById(R.id.quantDeAPI);
                EditText chocMousse =(EditText)findViewById(R.id.quantDeCMC);
                if(!raspTrifle.getText().toString().equals(""))
                {
                    datasource.addItem("Raspberry Trifle","Desserts",Integer.parseInt(raspTrifle.getText().toString()));
                }
                if(!caramelCustard.getText().toString().equals(""))
                {
                    datasource.addItem("Caramel Custard","Desserts",Integer.parseInt(caramelCustard.getText().toString()));
                }
                if(!applePie.getText().toString().equals(""))
                {
                    datasource.addItem("Apple Pie with Ice Cream","Desserts",Integer.parseInt(applePie.getText().toString()));
                }
                if(!chocMousse.getText().toString().equals(""))
                {
                    datasource.addItem("Chocolate Mousse Cake","Desserts",Integer.parseInt(chocMousse.getText().toString()));
                }
                Intent intent = new Intent(getApplicationContext(), Confirm.class);
                startActivity(intent);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.desserts, menu);
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
