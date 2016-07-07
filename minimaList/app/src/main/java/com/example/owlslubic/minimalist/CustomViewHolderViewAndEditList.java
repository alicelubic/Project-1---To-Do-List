package com.example.owlslubic.minimalist;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomViewHolderViewAndEditList extends RecyclerView.ViewHolder {
    public EditText mItemInput, mDescriptionInput;
    public TextView mListTitle;
    public FloatingActionButton mFab2;

    public CustomViewHolderViewAndEditList(View itemView){
        super(itemView);

        mItemInput = (EditText) itemView.findViewById(R.id.edittext_item);
        mDescriptionInput = (EditText) itemView.findViewById(R.id.edittext_description);
        mListTitle = (TextView) itemView.findViewById(R.id.textview_main_list_title);
        mFab2 = (FloatingActionButton) itemView.findViewById(R.id.fab_new_list);

    }


}
