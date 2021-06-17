package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Reserve2Activity extends AppCompatActivity {

    private Button buttonConfereser;
    private ImageButton buttonsettings;

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

        buttonsettings = findViewById(R.id.imageButton);
        buttonsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSettings();
            }
        });


    }

    public void launchConfReser() {
        Intent intent = new Intent(this, ConfParkActivity.class);
        startActivity(intent);
    }



    public void launchSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}