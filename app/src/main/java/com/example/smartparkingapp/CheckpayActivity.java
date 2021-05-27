package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckpayActivity extends AppCompatActivity {

    private Button buttonFiniPay;

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
    }

    public void launchFiniPay() {
        Intent intent = new Intent(this, SuccessActivity2.class);
        startActivity(intent);
    }
}