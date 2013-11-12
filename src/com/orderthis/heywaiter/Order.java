package com.orderthis.heywaiter;

/**
 * Created by Mithil Arun on 12/11/13.
 */
public class Order
{
    private String dish_id;
    private String dish_category;
    private int dish_quant;

    public int getDish_quant() {
        return dish_quant;
    }

    public void setDish_quant(int dish_quant) {
        this.dish_quant = dish_quant;
    }

    public String getDish_category() {
        return dish_category;
    }

    public void setDish_category(String dish_category) {
        this.dish_category = dish_category;
    }

    public String getDish_id() {
        return dish_id;
    }

    public void setDish_id(String dish_id) {
        this.dish_id = dish_id;
    }
}
