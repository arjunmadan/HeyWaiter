package com.orderthis.heywaiter;

/**
 * Created by Mithil Arun on 12/11/13.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class MenuDAO
{
    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;
    private String[] allColumns={ MySQLiteHelper.dish_ID, MySQLiteHelper.dish_category, MySQLiteHelper.dish_quant};

    public MenuDAO(Context context)
    {
        dbHelper=new MySQLiteHelper(context);
    }

    public void open() throws SQLException
    {
        database = dbHelper.getWritableDatabase();
    }
    public void close()
    {
        dbHelper.close();
    }

    public void addItem(String dish_id, String dish_category, Integer dish_quant)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MySQLiteHelper.dish_ID,dish_id);
        contentValues.put(MySQLiteHelper.dish_quant, dish_quant);
        contentValues.put(MySQLiteHelper.dish_category, dish_category);
        Long insertId = database.insert(MySQLiteHelper.menu_table, null, contentValues);


    }
    public List<Order> getOrder() {
        List<Order> orders = new ArrayList<Order>();

        Cursor cursor = database.query(MySQLiteHelper.menu_table,
                allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Order item = cursorToItem(cursor);
            orders.add(item);
            cursor.moveToNext();
        }
        // make sure to close the cursor

        cursor.close();
        return orders;
    }


    private Order cursorToItem(Cursor cursor) {
        Order order = new Order();
        order.setDish_id(cursor.getString(0));
        order.setDish_category(cursor.getString(1));
        order.setDish_quant(cursor.getInt(2));
        return order;
    }
}
