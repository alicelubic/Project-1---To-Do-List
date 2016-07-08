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
    public Singleton lists = Singleton.getInstance();


    public CustomAdapterViewAndEditList(final List<CustomObjectItems> itemsList ){
        mItemsList = itemsList;
    }

    @Override
    public CustomViewHolderViewAndEditList onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_info, parent, false);
        CustomViewHolderViewAndEditList viewHolderNewList = new CustomViewHolderViewAndEditList(parentView);
        return viewHolderNewList;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderViewAndEditList holder, int position) {
//      holder.mListTitle.setText(mItemsList.get(position).toString());

//        holder.mItemName.setText(mItemsList.get(position).toString());


        holder.mItemName.setText(lists.getListByPosition(position).getItemList().get(position).getItem().toString());
        holder.mDescription.setText(lists.getListByPosition(position).getItemList().get(position).getDescription().toString());
        //i am trying to get the item list to display in the recyclerview




    }

    @Override
    public int getItemCount() {
        if(mItemsList==null){return 0;}else{
            return mItemsList.size();}
    }
}
