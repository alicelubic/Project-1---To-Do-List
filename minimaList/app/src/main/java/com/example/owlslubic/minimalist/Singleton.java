package com.example.owlslubic.minimalist;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by owlslubic on 7/6/16.
 */
public class Singleton {

    private static Singleton toDoLists = null;
    private static ArrayList<CustomObjectLists> listsList;
    private static CustomObjectLists mList;

    private Singleton(){
        listsList = new ArrayList<>();
    }

    public static Singleton getInstance(){
        if(toDoLists == null){
            toDoLists = new Singleton();
        }
        return toDoLists;
    }
 //   public void addItem(String item){
 //       itemsList.add(item);
 //   }
    public void addList(CustomObjectLists list){
        listsList.add(list);
        //this adds list to the singleton COllection Of Lists
    }
    public void removeList(CustomObjectLists list){
        listsList.remove(list);

    }
    public CustomObjectLists getList(){
        return mList;
    }
    //this retrieves a list from the collection of lists

    public ArrayList<CustomObjectLists> getListsList(){
        return listsList;
    }
  //  }

//add lists and get

}
