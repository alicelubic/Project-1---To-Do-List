package com.example.owlslubic.minimalist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
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
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout_view_and_edit_list);

        mRecyclerViewNewList = (RecyclerView) findViewById(R.id.recyclerview_new_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerViewNewList.setLayoutManager(linearLayoutManager);
        editText1 = (EditText) findViewById(R.id.edittext_item);
        editText2 = (EditText) findViewById(R.id.edittext_description);

        //set adapter
        final int position = getIntent().getIntExtra(KEY, -1);
        final CustomAdapterViewAndEditList adapter = new CustomAdapterViewAndEditList(lists.getListByPosition(position).getItemList());
        mRecyclerViewNewList.setAdapter(adapter);

        //using customobjectlists method requires:lists.getListByPosition(position).getItemList()

        if (position >= 0) {
            lists.getListByPosition(position);
            //this gives us the list, adn thus the info that the lsit holds - title and list of items
        }
//set list name textview_main_list_title


        FloatingActionButton mFab2 = (FloatingActionButton) findViewById(R.id.fab_new_list);
        mFab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomObjectItems item = new CustomObjectItems(editText1.getText().toString(), editText2.getText().toString());

                lists.getListByPosition(position).addItem(item); //in () goes whatever makes the text get saved

                adapter.notifyDataSetChanged();

            }
        });


    }
}