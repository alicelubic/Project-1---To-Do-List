package com.example.owlslubic.minimalist;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
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
public class CustomAdapterMain extends RecyclerView.Adapter<CustomViewHolderMain> {
    List<CustomObjectLists> mListsList;
    private EditText mTitleInput;
    Singleton lists = Singleton.getInstance();


    public CustomAdapterMain(final List<CustomObjectLists> listsList ){
        mListsList = listsList;
    }

    @Override
    public CustomViewHolderMain onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_main_list_title, parent, false);
        //changed R.layout.custom... to a custom xml with just the textview, upon exiting dialog box,
        CustomViewHolderMain viewHolderMain = new CustomViewHolderMain(parentView);
        return viewHolderMain;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderMain holder, final int position) {
        //sets the list title to the input
       holder.mListTitle.setText(lists.getListsList().get(position).getTitle());
       // holder.mMainTitle.setText() set to the input from the dialog box



        holder.mListTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ViewAndEditListActivity.class);
                intent.putExtra(ViewAndEditListActivity.KEY, position);
                //intent.putExtra(key,value)
                //above line sends data from clicked list to second activity
               view.getContext().startActivity(intent);
               //should open next activity which will be populated with that list's items
            }
        });
        //this removes list from listofLists on long click -- add a dialog!
        holder.mListTitle.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                //calldialogmethod?

                lists.removeList(lists.getListByPosition(position));
                notifyDataSetChanged();
                return false;
            }
        });

    }

    @Override
    public int getItemCount() {
        if(mListsList==null){return 0;}else{
        return mListsList.size();}
    }


}

