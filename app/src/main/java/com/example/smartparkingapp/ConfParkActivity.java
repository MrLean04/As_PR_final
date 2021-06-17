package com.example.smartparkingapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ConfParkActivity extends AppCompatActivity {

    private Button buttonConfPark;
    private ImageButton buttonsettings;
    private EditText matricula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmpark);

        matricula = findViewById(R.id.matricula);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(ConfParkActivity.this);
        builder1.setCancelable(true);
        builder1.setTitle("Invalid License Plate");
        builder1.setMessage("Invalid license plate. Retry again!");
        builder1.setPositiveButton("OK", null);

        buttonConfPark = findViewById(R.id.button_resereturn);
        buttonConfPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matri = matricula.getText().toString();
                if(matri.equals(""))
                    builder1.show();
                else
                    launchConfPark();
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

    public void launchConfPark() {


        Intent intent = new Intent(this, CheckpayActivity.class);
        startActivity(intent);
    }

    public void launchSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}