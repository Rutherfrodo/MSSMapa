package com.example.frodo.aplikacjatestowa;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private Button mapaButton;
    private TextView mapaTextView;
    public  int PunktID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mapaButton = (Button)  findViewById(R.id.ButtonMapaNextPunkt);
        mapaTextView = (TextView) findViewById(R.id.mapaTextView);
        mapaTextView.setText("Zaczynamy zabawę!");


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
     */

    public void NastepnyNaMapie(final GoogleMap googleMap){
        switch (PunktID) {
            case 0:
                PunktNaMapie(52.27600748536289, 20.93560432406821, "Tutaj mieszkam ja!", googleMap);
                mapaTextView.setText("To tutaj mieszkam, moja wspaniała norka");
                break;
            case 1:
               PunktNaMapie(50.221744768411334, 18.67082302651943, "Knurów", googleMap);
                mapaTextView.setText("Tam gdzieś, mieszka Ona, dziewczyna w kebabie urodzona");
                break;
            case 2:
                PunktNaMapie(50.26262313230343, 19.023603145527204, "Ławeczka", googleMap);
                mapaTextView.setText("Nasza pierwsza ławka! Pierwsze frisbee oraz posiadówka ");
                break;
            case 3:
                PunktNaMapie(50.25581364549814, 19.014651677698907, "Ciekawsza ławeczka", googleMap);
                mapaTextView.setText("A tutaj na ławce Monika oszalała!");
                break;
            case 4:
                PunktNaMapie(52.22884101560918, 21.003273725509644, "Dworzec Centralny", googleMap);
                mapaTextView.setText("Nasze miejsce spotkań i pożegnań :(");
                break;
            case 5:
                PunktNaMapie(52.23248600014032, 21.01985285310775, "KEBAB KING", googleMap);
                mapaTextView.setText("W tym kebabie odzyskałaś radość z jedzenia kebabów!");
                break;
            case 6:
                PunktNaMapie(52.22970318214281, 20.999372683984234, "Nocleg", googleMap);
                mapaTextView.setText("Tutaj znowu przy Tobie oszalałem ja!");
                break;
            case 7:
                PunktNaMapie(52.24185711340347, 21.028722524642944, "Kopernik", googleMap);
                mapaTextView.setText("Spacer po rozpalonym dachu nie należał do najprzyjemniejszych :D");
                break;
            case 8:
                PunktNaMapie(52.24185711340347, 21.028722524642944, "Coral", googleMap);
                mapaTextView.setText("Tutaj uciekłaś!");
                break;
            case 9:
                PunktNaMapie(50.216163, 18.658845, "Dom", googleMap);
                mapaTextView.setText("Bułeczkowy dom");
                break;
            case 10:
                PunktNaMapie(50.25752867947887, 19.02665073300909, "Dom", googleMap);
                mapaTextView.setText("Bar Malinowy! ;)");
                break;
            case 11:
                PunktNaMapie(52.247021018667425, 21.014237037486396, "Dom", googleMap);
                mapaTextView.setText("Ławka warszawska, tutaj Buła została pokochana ");
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
    /*public void TrzeciButtonHandler(View view) { // Schemat do Toast
      Toast tost =  Toast.makeText(getApplicationContext(),"Fajny toast",Toast.LENGTH_SHORT);
      tost.show();
    }

    public void SnackmeHandler(View view) { // Schemat do SnackBara
        Snackbar.make(findViewById(myCoordLayout), R.string.Snack, Snackbar.LENGTH_SHORT).show();
    }*/
}

