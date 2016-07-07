package com.example.owlslubic.minimalist;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by owlslubic on 7/6/16.
 */
public class CustomViewHolderMain extends RecyclerView.ViewHolder {

    public TextView mMainTitle, mListTitle;



    public CustomViewHolderMain(View itemView) {
        super(itemView);

        mMainTitle = (TextView) itemView.findViewById(R.id.textview_main1);
        mListTitle = (TextView) itemView.findViewById(R.id.textview_main_list_title);

    }
}
