package com.example.smartparkingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class SearchActivity extends AppCompatActivity implements OnMapReadyCallback {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);




    }

    GoogleMap map;

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;
        LatLng Aveiro = new LatLng(40.643904619668575, -8.657694437451296);
        Marker marker = map.addMarker(new MarkerOptions().position(Aveiro).title("Parque Vilamar"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Aveiro));
        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                launchFind();
                return false;
            }
        });
    }

    public void launchFind() {
        Intent intent = new Intent(this, Search2Activity.class);
        startActivity(intent);
    }
}