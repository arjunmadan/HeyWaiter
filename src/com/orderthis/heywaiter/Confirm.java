package com.orderthis.heywaiter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

/**
 * Created by Mithil Arun on 10/11/13.
 */
public class Confirm extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        TableLayout layout=(TableLayout)findViewById(R.id.tablelayout);
        while(/*something*/layout!=null/*sample condition*/)
        {
            TableRow tr=new TableRow(this);
            tr.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
            TextView textview = new TextView(this);
            textview.setText("data"/*sample*/);
            tr.addView(textview);
            layout.addView(tr);
        }
    }
}