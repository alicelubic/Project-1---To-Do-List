package com.example.owlslubic.minimalist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomAdapterViewAndEditList extends RecyclerView.Adapter<CustomViewHolderViewAndEditList>{
   List<CustomObjectItems> mItemsList;
//    public Singleton lists = Singleton.getInstance();


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
    public void onBindViewHolder(CustomViewHolderViewAndEditList holder, final int position) {
//      holder.mListTitle.setText(mItemsList.get(position).toString());

//        holder.mItemName.setText(mItemsList.get(position).toString())


//        holder.mItemName.setText(lists.getListByPosition(position).getItemList().get(position).getItem().toString());
        holder.mItemName.setText(mItemsList.get(position).getItem());
        holder.mDescription.setText(mItemsList.get(position).getDescription());
        //i am trying to get the item list to display in the recyclerview




        //below is clicking on the item name, maybe make a second one for description or combine them somehow
        holder.mItemName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mItemsList.remove(mItemsList.get(position));
                //tryint to get the item object itself to delete it, above code does not work

                notifyDataSetChanged();

                return false;
            }
        });
        }



    @Override
    public int getItemCount() {
        if(mItemsList==null){return 0;}else{
            return mItemsList.size();}
    }
}
