package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CheckpayActivity extends AppCompatActivity {

    private Button buttonFiniPay;
    private ImageButton buttonsettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkpay);

        buttonFiniPay = findViewById(R.id.button_finipay);
        buttonFiniPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchFiniPay();
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

    public void launchFiniPay() {
        Intent intent = new Intent(this, SucesspayActivity.class);
        startActivity(intent);
    }

    public void launchSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}