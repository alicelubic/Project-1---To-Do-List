package com.example.owlslubic.minimalist;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by owlslubic on 7/6/16.
 */
public class Singleton {

    private static Singleton toDoList = null;
    private static ArrayList<String> listsList;
    private static ArrayList<String> itemsList;

    private Singleton(){
        listsList = new ArrayList<String>();
        itemsList = new ArrayList<String>();
    }

    public static Singleton getInstance(){
        if(toDoList == null){
            toDoList = new Singleton();
        }
        return toDoList;
    }
    public void addItem(String item){
        itemsList.add(item);
    }
    public void addList(String list){
        listsList.add(list);
    }

    public ArrayList<String> getLists(){
        return listsList;
    }
    public ArrayList<String> getItems(){
        return itemsList;
    }


}
