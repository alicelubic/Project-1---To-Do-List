package com.example.owlslubic.minimalist;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ViewAndEditListActivity extends AppCompatActivity {
    RecyclerView mRecyclerViewNewList;
    Singleton lists = Singleton.getInstance();
    public static final String KEY = "key";
    EditText editTextItem, editTextDescription;
    TextView mListTitle;
    CustomObjectLists mList;
    //i have the list global variable now,
    // so i dont have to call the singleton if i wanna access whichever list shows up in this activity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout_view_and_edit_list);

        mListTitle = (TextView) findViewById(R.id.textview_main_list_title);

        mRecyclerViewNewList = (RecyclerView) findViewById(R.id.recyclerview_new_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerViewNewList.setLayoutManager(linearLayoutManager);
        editTextItem = (EditText) findViewById(R.id.edittext_item);
        editTextDescription = (EditText) findViewById(R.id.edittext_description);

        //set adapter
        final int position = getIntent().getIntExtra(KEY, -1); //that way we know it was bad if it's -1 because there is no negative index
        final CustomAdapterViewAndEditList adapter = new CustomAdapterViewAndEditList(lists.getListByPosition(position).getItemList());
        mRecyclerViewNewList.setAdapter(adapter);

        //using customobjectlists method requires:lists.getListByPosition(position).getItemList()

        if (position >= 0) {
           mList = lists.getListByPosition(position);
            mListTitle.setText(mList.getTitle());
            //this gives us the list, adn thus the info that the lsit holds - title and list of items
            //alo sets title textview to title of list
        }






        FloatingActionButton mFab2 = (FloatingActionButton) findViewById(R.id.fab_new_list);
        mFab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomObjectItems item = new CustomObjectItems(editTextItem.getText().toString(), editTextDescription.getText().toString());

                CustomObjectLists currentList = lists.getListByPosition(position);
                currentList.addItem(item);
//                lists.getListByPosition(position).addItem(item);
                adapter.notifyDataSetChanged();

                //this clears edittexts after adding item
                editTextDescription.setText("");
                editTextItem.setText("");



            }
        });


    }
}