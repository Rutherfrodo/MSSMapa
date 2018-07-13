package com.example.frodo.aplikacjatestowa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class WycieczkiClass extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wycieczki_map_layout);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        googleMap.getUiSettings().setZoomControlsEnabled(true); // Uruchamia ZoomIN oraz ZoomOut w intefejsie Mapy
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(15)); // Automatyczne zoomowanie mapy na starcie (Wartosć 15 odpowiada za optymalny widok )
        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                NaMapie sciana = new NaMapie(latLng);
                sciana.setGdzies(latLng);
                sciana.setName("To Jest Ściana");
                googleMap.addMarker(new MarkerOptions().position(sciana.getGdzies()).title(sciana.getNazwaPunktu()));

            }
        });

    }

}

