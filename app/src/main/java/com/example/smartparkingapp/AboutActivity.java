package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    private Button doc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abou);

        doc = findViewById(R.id.button2);
        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDoc();
            }
        });

    }

    public void launchDoc() {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://youtu.be/ifbIBEulJdQ") );
        startActivity( browse );

    }
}