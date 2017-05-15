package com.example.ahmed.tumblrsearchapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Search extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        Intent in = getIntent();
        String tv1= in.getStringExtra("searchEntry");
      //  View.setText(tv1);
        Toast.makeText(Search.this , tv1 , Toast.LENGTH_LONG).show();
    }
}
