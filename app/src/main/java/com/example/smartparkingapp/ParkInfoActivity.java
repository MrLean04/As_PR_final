package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParkInfoActivity extends AppCompatActivity {

    private Button piConfirm, piProcPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parkinginfo);

        piConfirm = findViewById(R.id.button_piconfirm);
        piConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchPIConfirm();
            }
        });

        piProcPay = findViewById(R.id.button_piprocpay);
        piProcPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchPIProcPay();
            }
        });
    }

    public void launchPIConfirm() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void launchPIProcPay() {
        Intent intent = new Intent(this, CheckpayActivity.class);
        startActivity(intent);
    }
}