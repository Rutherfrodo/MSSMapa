package com.example.frodo.aplikacjatestowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
   private Button mButton1;
   private Button mButton2;
    private Button mButton4;
    private Button mapaButton;
    private Button zoomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mapaButton = (Button)  findViewById(R.id.ButtonMapaNextPunkt);
        zoomButton = (Button)  findViewById(R.id.Zoombutton);
       /* mButton1 = (Button) findViewById(R.id.button);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton4 = (Button) findViewById(R.id.button5);

        final String tekst = "lalalalalalallala";

        mButton1.setOnClickListener(new ButtonClass());
        mButton2.setOnClickListener(new ButtonClass());
        */
    }

    protected void PunktNaMapie(double latitude, double longtitude , String Nazwa, GoogleMap googleMap) {
        LatLng miejsd = new LatLng(latitude,longtitude);
        googleMap.addMarker(new MarkerOptions().position(miejsd).title(Nazwa));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(miejsd));
       // googleMap.moveCamera(CameraUpdateFactory.zoomBy(9));


    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
       mapaButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               PunktNaMapie(52.27600748536289,20.93560432406821,"Mój wspaniały dom",googleMap);
           }

       });
       zoomButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               googleMap.moveCamera(CameraUpdateFactory.zoomIn());
           }
       });
    }

    /*public void TrzeciButtonHandler(View view) {
      Toast tost =  Toast.makeText(getApplicationContext(),"Fajny toast",Toast.LENGTH_SHORT);
      tost.show();


    }

    public void SnackmeHandler(View view) {
        Snackbar.make(findViewById(myCoordLayout), R.string.Snack, Snackbar.LENGTH_SHORT).show();
    }*/


}

