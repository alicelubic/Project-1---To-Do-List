package com.example.owlslubic.minimalist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ViewListActivity extends AppCompatActivity {
    RecyclerView mRecyclerViewViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);

        mRecyclerViewViewList = (RecyclerView) findViewById(R.id.recyclerview_view_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerViewViewList.setLayoutManager(linearLayoutManager);
    }
}
