package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Search2Activity extends AppCompatActivity {

    private Button buttonAddFav, buttonFind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);



        buttonAddFav = findViewById(R.id.button_addfav);
        buttonAddFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Search2Activity.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });

        buttonFind = findViewById(R.id.button_find);
        buttonFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchHome();
            }
        });


    }

    p
}