package com.example.frodo.aplikacjatestowa;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class NaMapie {

  public NaMapie(LatLng Gdzies){
      Gdzies = getGdzies();
  }
  public String getNazwaPunktu(){
      return NazwaPunktu;
  }
  public void setName(String NazwaPunktu) {
        this.NazwaPunktu = NazwaPunktu;
  }
  public LatLng getGdzies(){
      return Gdzies;
  }
  public void setGdzies(LatLng Gdzies){
      this.Gdzies = Gdzies;
  }


  private LatLng Gdzies;
  private String NazwaPunktu;
  private double lat;
  private double lng;
}
