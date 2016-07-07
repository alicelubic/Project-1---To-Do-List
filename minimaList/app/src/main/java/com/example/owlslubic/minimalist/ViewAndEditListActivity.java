package com.example.owlslubic.minimalist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class ViewAndEditListActivity extends AppCompatActivity {
    RecyclerView mRecyclerViewNewList;
    Singleton lists = Singleton.getInstance();
    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout_view_and_edit_list);

        mRecyclerViewNewList = (RecyclerView) findViewById(R.id.recyclerview_new_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerViewNewList.setLayoutManager(linearLayoutManager);

        //set adapter

        final CustomAdapterMain adapter = new CustomAdapterMain(lists.getListsList());
        mRecyclerViewNewList.setAdapter(adapter);


        int position = getIntent().getIntExtra(KEY, -1);
        ;

        if (position >= 0) {
            lists.getListByPosition(position);
            //this gives us the list, adn thus the info that the lsit holds - title and list of items
        }
        final AlertDialog.Builder builder = new AlertDialog.Builder(ViewAndEditListActivity.this);
        final EditText input = new EditText(ViewAndEditListActivity.this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        input.setLayoutParams(lp);
        builder.setView(input);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                lists.addList(new CustomObjectLists(input.getText().toString()));
                adapter.notifyDataSetChanged();

                builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });

                builder.setTitle("Create New List");
                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });
    }
}