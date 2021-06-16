package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reserve2Activity extends AppCompatActivity {

    private Button buttonConfereser, buttonMyReser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserve);

        buttonConfereser = findViewById(R.id.button_confreser);
        buttonConfereser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchConfReser();
            }
        });

        buttonMyReser = findViewById(R.id.button_myreser);
        buttonMyReser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchMyReser();
            }
        });
    }

    public void launchConfReser() {
        Intent intent = new Intent(this, ConfParkActivity.class);
        startActivity(intent);
    }

    public void launchMyReser() {
        Intent intent = new Intent(this, FavActivity.class);
        startActivity(intent);
    }
}