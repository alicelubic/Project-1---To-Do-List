package com.example.owlslubic.minimalist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomObjectLists {

    String mTitle;
    ArrayList<CustomObjectItems> mItemList;

    public CustomObjectLists(){
        mTitle = "Title";

    }
    public CustomObjectLists(String title){
        mTitle = title;
        mItemList = new ArrayList();
        //when created, it is given an empty list


    }

    public String getTitle(){
        return mTitle;
    }
    public void setTitle(String title){
        mTitle = title;
    }

    public void addItem(CustomObjectItems item){
        mItemList.add(item);


    }
    public void removeItem(CustomObjectItems item){
        mItemList.remove(item);
    }
    public ArrayList<CustomObjectItems> getItemList(){
        return mItemList;
    }



}
