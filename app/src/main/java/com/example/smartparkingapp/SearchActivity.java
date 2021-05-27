package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    private Button buttonAddFav, buttonFind, buttonNoti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        buttonAddFav = findViewById(R.id.button_addfav);
        buttonAddFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SearchActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });

        buttonFind = findViewById(R.id.button_find);
        buttonFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchFind();
            }
        });

        buttonNoti = findViewById(R.id.button_noti);
        buttonNoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SearchActivity.this, "Nofitication confirm", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void launchFind() {
        Intent intent = new Intent(this, ReserFindActivity.class);
        startActivity(intent);
    }
}