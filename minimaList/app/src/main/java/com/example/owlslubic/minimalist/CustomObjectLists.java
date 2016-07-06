package com.example.owlslubic.minimalist;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomObjectLists {

    String mTitle;

    public CustomObjectLists(){
        mTitle = "Title";
    }
    public CustomObjectLists(String title){
        mTitle = title;
    }

    public String getTitle(){
        return mTitle;
    }
    public void setTitle(String title){
        mTitle = title;
    }

}
