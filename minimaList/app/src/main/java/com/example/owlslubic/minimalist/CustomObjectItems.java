package com.example.owlslubic.minimalist;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomObjectItems {
    String mItem, mDescription;

    public CustomObjectItems(){
        mItem = "Item";
        mDescription = "Description";
    }

    public CustomObjectItems(String item, String description){
        mItem = item;
        mDescription = description;
    }

    public String getItem(){
        return mItem;
    }
    public String getDescription(){
        return mDescription;
    }
    public void setItem(String item){
        mItem = item;
    }
    public void setmDescription(String description){
        mDescription = description;
    }

}
