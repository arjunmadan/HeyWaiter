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

        datasource=new MenuDAO(this);
        datasource.open();

        List<Order> values=datasource.getOrder();

        ArrayAdapter<Order> adapter = new ArrayAdapter<Order>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
        TableLayout layout=(TableLayout)findViewById(R.id.tablelayout);
        /*while(/*somethinglayout!=null/*sample condition)
        {
            TableRow tr=new TableRow(this);
            tr.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
            TextView textview = new TextView(this);
            textview.setText("data"/*sample);
            tr.addView(textview);
            layout.addView(tr);
        }*/
    }


}