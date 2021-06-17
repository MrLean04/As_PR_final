package com.example.smartparkingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class ManageActivity extends AppCompatActivity implements OnMapReadyCallback {

    private ImageButton buttonsettings;
    private Button buttonAdd, buttonRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        buttonsettings = findViewById(R.id.imageButton);
        buttonsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSettings();
            }
        });

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManageActivity.this, "Success!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        buttonRemove = findViewById(R.id.buttonRemove);
        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManageActivity.this, "Success!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    GoogleMap map;

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;

        LatLng Aveiro = new LatLng(40.643904619668575, -8.657694437451296);
        Marker marker1 = map.addMarker(new MarkerOptions().position(Aveiro).title("Parque Vilamar"));

        LatLng Lisboa = new LatLng(38.73755038183533, -9.134404385710498);
        Marker marker2 = map.addMarker(new MarkerOptions().position(Lisboa).title("Parque AlfaceCity"));

        map.moveCamera(CameraUpdateFactory.newLatLng(Aveiro));

        marker2.showInfoWindow();
        marker1.showInfoWindow();

        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                    launchReserve2();
                return false;
            }
        });
    }

    public void launchReserve2() {
        Intent intent = new Intent(this, Reserve2Activity.class);
        startActivity(intent);
    }

    public void launchSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}