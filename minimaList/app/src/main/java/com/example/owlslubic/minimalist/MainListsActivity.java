package com.example.owlslubic.minimalist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainListsActivity extends AppCompatActivity {
    RecyclerView mRecyclerViewMain;
    Singleton lists = Singleton.getInstance();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout_main_lists);

        mRecyclerViewMain = (RecyclerView) findViewById(R.id.recyclerview_main);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerViewMain.setLayoutManager(linearLayoutManager);

        //set adapter
       final CustomAdapterMain adapter = new CustomAdapterMain(lists.getListsList());
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
                builder.setPositiveButton("ok", null);
                builder.setNegativeButton("cancel", null);

                builder.setTitle("Create New List");
                final AlertDialog dialog = builder.create();
                dialog.show();

                dialog.getButton(DialogInterface.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (input.getText().toString().length()==0){
                            input.setError("Name your list!");
                        }
                        else {
            //                Toast.makeText(view.getContext(), "hold title to delete", Toast.LENGTH_SHORT).show();
                            lists.addList(new CustomObjectLists(input.getText().toString()));
                            adapter.notifyDataSetChanged();
                            dialog.dismiss();
                        }

                    }
                });

                dialog.getButton(DialogInterface.BUTTON_NEGATIVE).setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
            }
        });


    //a method that can be called to create dialog?
    //  public void deployDeleteListDialog(){
    //  AlertDialog.Builder builder = new AlertDialog.Builder(this);
    //  builder.setMessage("Are you sure you want to delete?");
    //  builder.setPositiveButton("yeah", new DialogInterface.OnClickListener() {
    //      @Override
    //      public void onClick(DialogInterface dialogInterface, int i) {
    //
    //      }
    //  });


    }

}

