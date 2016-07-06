package com.example.owlslubic.minimalist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomAdapterViewList extends RecyclerView.Adapter<CustomViewHolderViewList> {
    List<CustomObjectItems> mItemsList;
    //is this the wrong kind of list? should i just be instantiating the singleton list or something?
    public CustomAdapterViewList(final List<CustomObjectItems> itemsList){
        mItemsList = itemsList;

    }
    @Override
    public CustomViewHolderViewList onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_view_list, parent, false);
        CustomViewHolderViewList viewHolderViewList = new CustomViewHolderViewList(parentView);
        return viewHolderViewList;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderViewList holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
