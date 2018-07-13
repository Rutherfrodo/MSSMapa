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

    private Button mapaButton;
    private TextView mapaTextView;
    public  int PunktID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wycieczki_map_layout);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mapaButton = (Button)  findViewById(R.id.ButtonMapaNextPunkt);
        mapaTextView = (TextView) findViewById(R.id.mapaTextView);

    }
    protected void PunktNaMapie (double latitude, double longtitude , String Nazwa, GoogleMap googleMap) { // Funkcja odpowiedzialna za tworzenie punktu na mapie, z okreslonym opisem oraz współrzędnymi
        LatLng miejsd = new LatLng(latitude,longtitude);
        googleMap.addMarker(new MarkerOptions().position(miejsd).title(Nazwa));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(miejsd));
        PunktID++;
       // googleMap.moveCamera(CameraUpdateFactory.zoomBy(9));
    }
    /*
    NastępnyNaMapie odpowiada za deklaracje kolejnych puntków na mapie, wraz z opisem w TXT
    Punkty w oddzielnych CASE
    TODO: W PunktNaMapie dodać objekt LatLng jako parametr
     */
    public void NastepnyNaMapie(final GoogleMap googleMap){
        switch (PunktID) {
            case 0:
                PunktNaMapie(52.27600748536289, 20.93560432406821, "Tutaj mieszkam ja!", googleMap);
                mapaTextView.setText(" ");
                break;
            default:

                break;
        }
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        googleMap.getUiSettings().setZoomControlsEnabled(true); // Uruchamia ZoomIN oraz ZoomOut w intefejsie Mapy
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(15)); // Automatyczne zoomowanie mapy na starcie (Wartosć 15 odpowiada za optymalny widok )
       mapaButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                    NastepnyNaMapie(googleMap);
               }


       });

    }


}

