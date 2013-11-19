package com.orderthis.heywaiter;

import android.app.Application;

/**
 * Created by Mithil Arun on 18/11/13.
 */
public class ContextSaver extends Application
{
    MenuDAO datasource;
    @Override
    public void onCreate()
    {
        super.onCreate();
        datasource=new MenuDAO(getApplicationContext());
        datasource.open();
    }
    @Override
    public void onTerminate()
    {
        super.onTerminate();
        datasource.close();
    }
}
