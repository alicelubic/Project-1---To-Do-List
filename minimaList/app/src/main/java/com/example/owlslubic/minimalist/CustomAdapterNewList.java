package com.example.owlslubic.minimalist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomAdapterNewList extends RecyclerView.Adapter<CustomViewHolderNewList>{
   List<CustomObjectItems> mItemsList;

    public CustomAdapterNewList(final List<CustomObjectItems> itemsList ){
        mItemsList = itemsList;
    }

    @Override
    public CustomViewHolderNewList onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_new_list, parent, false);
        CustomViewHolderNewList viewHolderNewList = new CustomViewHolderNewList(parentView);
        return viewHolderNewList;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderNewList holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
