package com.example.owlslubic.minimalist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomAdapterMain extends RecyclerView.Adapter<CustomViewHolderMain> {
    List<CustomObjectLists> mListsList;
    //expects list of lists
    Singleton lists = Singleton.getInstance();


    public CustomAdapterMain(final List<CustomObjectLists> listsList ){
        mListsList = listsList;
    }

    @Override
    public CustomViewHolderMain onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_main_lists, parent, false);
        CustomViewHolderMain viewHolderMain = new CustomViewHolderMain(parentView);
        return viewHolderMain;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderMain holder, final int position) {

        //just want to give it the whole list of lists to bind to the textview

       holder.mListTitle.setText(mListsList.get(position).getTitle());
       // holder.mMainTitle.setText() set to the input from the dialog box


        holder.mListTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lists.getList();
                //should retrieve an object CustomObjectLists which contains the list title and items list within
            }
        });


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
