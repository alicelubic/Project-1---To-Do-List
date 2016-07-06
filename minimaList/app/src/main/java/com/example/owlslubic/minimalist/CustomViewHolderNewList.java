package com.example.owlslubic.minimalist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomViewHolderNewList extends RecyclerView.ViewHolder {
    public EditText mItemInput, mDescriptionInput, mTitleInput;

    public CustomViewHolderNewList(View itemView){
        super(itemView);

        mTitleInput = (EditText) itemView.findViewById(R.id.edittext_title);
        mItemInput = (EditText) itemView.findViewById(R.id.edittext_item);
        mDescriptionInput = (EditText) itemView.findViewById(R.id.edittext_description);

    }


}
