package com.example.frodo.aplikacjatestowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD


import com.google.android.gms.maps.CameraUpdate;
=======
import android.widget.TextView;


>>>>>>> Dodanie kilku puntków na mapie
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
<<<<<<< HEAD
   private Button mButton1;
   private Button mButton2;
    private Button mButton4;
    private Button mapaButton;
    private Button zoomButton;

=======

    private Button mapaButton;
    private TextView mapaTextView;
    public  int PunktID = 0;
>>>>>>> Dodanie kilku puntków na mapie
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);
<<<<<<< HEAD


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


=======
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
                mapaTextView.setText(" To tutaj mieszkam \n Moja wspaniała norka");
                break;
            case 1:
               PunktNaMapie(50.221744768411334, 18.67082302651943, "Knurów", googleMap);
                mapaTextView.setText(" Tam gdzieś, \n mieszka Ona, \n dziewczyna w kebabie urodzona");
                break;
            case 2:
                PunktNaMapie(50.26262313230343, 19.023603145527204, "Ławeczka", googleMap);
                mapaTextView.setText(" Nasza pierwsza ławka! \n pierwsze frisbee \n oraz posiadówka ;)");
                break;
            case 3:
                PunktNaMapie(50.25581364549814, 19.014651677698907, "Ciekawsza ławeczka", googleMap);
                mapaTextView.setText(" A tutaj na ławce \n Monika oszalała!");
                break;
            case 4:
                PunktNaMapie(52.22884101560918, 21.003273725509644, "Dworzec Centralny", googleMap);
                mapaTextView.setText(" Nasze miejsce spotkań i \n pożegnań :(");
                break;
            case 5:
                PunktNaMapie(52.23248600014032, 21.01985285310775, "KEBAB KING", googleMap);
                mapaTextView.setText(" W tym kebabie \n odzyskałaś radość z \n jedzenia kebabów!");
                break;
            case 6:
                PunktNaMapie(52.22970318214281, 20.999372683984234, "Nocleg", googleMap);
                mapaTextView.setText(" Tutaj znowu przy Tobie \n oszalałem ja!");
                break;
            case 7:
                PunktNaMapie(52.24185711340347, 21.028722524642944, "Kopernik", googleMap);
                mapaTextView.setText(" Spacer po rozpalonym dahu \n nie należał do najprzyjemniejszych :D");
                break;
            case 8:
                PunktNaMapie(52.24185711340347, 21.028722524642944, "Coral", googleMap);
                mapaTextView.setText(" Tutaj uciekłaś!\n");
                break;
            default:

                break;
        }
>>>>>>> Dodanie kilku puntków na mapie
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
<<<<<<< HEAD
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
=======
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
>>>>>>> Dodanie kilku puntków na mapie
      Toast tost =  Toast.makeText(getApplicationContext(),"Fajny toast",Toast.LENGTH_SHORT);
      tost.show();


    }

<<<<<<< HEAD
    public void SnackmeHandler(View view) {
=======
    public void SnackmeHandler(View view) { // Schemat do SnackBara
>>>>>>> Dodanie kilku puntków na mapie
        Snackbar.make(findViewById(myCoordLayout), R.string.Snack, Snackbar.LENGTH_SHORT).show();
    }*/


}

