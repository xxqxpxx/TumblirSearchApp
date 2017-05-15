package com.example.ahmed.tumblrsearchapi.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.ahmed.tumblrsearchapi.R;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void searchbutton(View v)
    {
        EditText word = (EditText) findViewById(R.id.searchEntry);
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        intent.putExtra("searchEntry", word.getText().toString() );
        startActivity(intent);
    }
}
