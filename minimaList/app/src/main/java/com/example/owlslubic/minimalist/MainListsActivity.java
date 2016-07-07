package com.example.owlslubic.minimalist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainListsActivity extends AppCompatActivity {
    RecyclerView mRecyclerViewMain;
    Singleton lists = Singleton.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lists);

        mRecyclerViewMain = (RecyclerView) findViewById(R.id.recyclerview_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerViewMain.setLayoutManager(linearLayoutManager);

        //set adapter
     //  CustomAdapterMain adapter = new CustomAdapterMain(lists.getListsList());
     //  RecyclerView.setAdapter(adapter);


    }
}
