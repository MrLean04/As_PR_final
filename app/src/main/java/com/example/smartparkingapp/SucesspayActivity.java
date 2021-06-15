package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SucesspayActivity extends AppCompatActivity {


    private Button buttonSucConf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sucesspay);

        buttonSucConf = findViewById(R.id.button_succonf);
        buttonSucConf.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            launchSucConf();
        }
        });


    }


    public void launchSucConf() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}