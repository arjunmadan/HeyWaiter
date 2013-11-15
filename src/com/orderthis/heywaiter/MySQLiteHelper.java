package com.orderthis.heywaiter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Mithil Arun on 12/11/13.
 */
public class MySQLiteHelper extends SQLiteOpenHelper
{
    public static final String menu_table="menu";
    public static final String dish_ID="_id";
    public static final String dish_category="dish_category";
    public static final String dish_quant="dish_quant";

    private static final String DATABASE_NAME = "menu.db";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE = "create table "
            + menu_table + "(" + dish_ID
            + " text primary key, " + dish_category
            + " text not null, " + dish_quant
            + " integer not null);";

    public MySQLiteHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2)
    {

    }
}
