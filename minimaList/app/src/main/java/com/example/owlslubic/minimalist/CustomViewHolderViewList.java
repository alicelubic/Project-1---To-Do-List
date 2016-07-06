package com.example.owlslubic.minimalist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomViewHolderViewList extends RecyclerView.ViewHolder {
    public TextView mListTitle,mItem, mDescription;
    public Button mButton;
    public LinearLayout mLayoutViewList;

    public CustomViewHolderViewList(View itemView) {
        super(itemView);

        mLayoutViewList = (LinearLayout) itemView.findViewById(R.id.linearlayout_view_list);
        mListTitle = (TextView) itemView.findViewById(R.id.textview_list_title);
        mItem = (TextView) itemView.findViewById(R.id.textview_item);
        mDescription = (TextView) itemView.findViewById(R.id.textview_description);
    }
}
