package com.example.owlslubic.minimalist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomAdapterViewAndEditList extends RecyclerView.Adapter<CustomViewHolderViewAndEditList>{
   List<CustomObjectItems> mItemsList;


    public CustomAdapterViewAndEditList(final List<CustomObjectItems> itemsList ){
        mItemsList = itemsList;
    }

    @Override
    public CustomViewHolderViewAndEditList onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_view_and_edit_list, parent, false);
        CustomViewHolderViewAndEditList viewHolderNewList = new CustomViewHolderViewAndEditList(parentView);
        return viewHolderNewList;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderViewAndEditList holder, int position) {
      //  holder.mListTitle.setText() set this text to the input from the dialog box
        //i am trying to get the itemlist to display in the recyclerview


    }

    @Override
    public int getItemCount() {
        if(mItemsList==null){return 0;}else{
            return mItemsList.size();}
    }
}
