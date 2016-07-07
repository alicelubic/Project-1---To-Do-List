package com.example.owlslubic.minimalist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainListsActivity extends AppCompatActivity {
    RecyclerView mRecyclerViewMain;
    Singleton lists = Singleton.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout_main_lists);

        mRecyclerViewMain = (RecyclerView) findViewById(R.id.recyclerview_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerViewMain.setLayoutManager(linearLayoutManager);

        //set adapter
       CustomAdapterMain adapter = new CustomAdapterMain(lists.getListsList());
       mRecyclerViewMain.setAdapter(adapter);


        FloatingActionButton mFabMain = (FloatingActionButton) findViewById(R.id.fab_main);
        mFabMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainListsActivity.this);
                final EditText input = new EditText(MainListsActivity.this);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                builder.setView(input);
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //this is where the list title must be saved or wahtever--see ntoes

                    }
                });
                builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //make it return to main activity.... maybe something with finish();
                    }
                });

                builder.setTitle("Create New List");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });


    }
}
