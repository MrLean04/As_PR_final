package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

    Button buttonSearchInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        buttonSearchInfo = findViewById(R.id.button_searchinfo);
        buttonSearchInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSearchInfo();
            }
        });
    }

    public void launchSearchInfo() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }
}