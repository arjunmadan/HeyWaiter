package com.orderthis.heywaiter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Mithil Arun on 10/11/13.
 */
public class Confirm extends Activity
{
    private MenuDAO datasource;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        Button b1 = (Button) findViewById (R.id.button1);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Context context = getApplicationContext();

                Intent intent = new Intent(getApplicationContext(), ThankYou.class);
                startActivity(intent);
            }
        });

        datasource = ((ContextSaver)getApplication()).datasource;

        List<Order> values=datasource.getOrder();
        TableLayout layout=(TableLayout)findViewById(R.id.tablelayout);
        for(Order value:values)
        {
            TableRow tr=new TableRow(this);
            tr.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
            TextView dishID = new TextView(this);
            dishID.setText(value.getDish_id());
            TextView dishCat = new TextView(this);
            dishCat.setText(value.getDish_category());
            TextView dishQuant = new TextView(this);
            dishQuant.setText(value.getDish_quant());
            tr.addView(dishID);
            tr.addView(dishCat);
            tr.addView(dishQuant);
            layout.addView(tr);
        }
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