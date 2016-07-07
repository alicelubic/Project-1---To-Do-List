package com.example.owlslubic.minimalist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ViewAndEditListActivity extends AppCompatActivity {
    RecyclerView mRecyclerViewNewList;
    Singleton lists = Singleton.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_list);

        mRecyclerViewNewList = (RecyclerView) findViewById(R.id.recyclerview_new_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerViewNewList.setLayoutManager(linearLayoutManager);

        //set adapter
        //  CustomAdapterViewAndEditList adapter = new CustomAdapterViewAndEditList(lists.getListsList());
        //  RecyclerView.setAdapter(adapter);
    }
}
