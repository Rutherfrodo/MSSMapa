package com.example.frodo.aplikacjatestowa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FotoActivity extends AppCompatActivity {
    private ImageView Fotki;
    private Button mNext;
    private Button mBack;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fotki_layout);
        Fotki = (ImageView) findViewById(R.id.fotoView);
        mNext = (Button) findViewById(R.id.button_next);
        mBack = (Button) findViewById(R.id.button_back);
        Fotki.setImageResource(R.drawable.foto10);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Licznik();
                count++;
                if (count>14){
                    count =0;
                }
            }
        });


        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Licznik();
                count--;
                if (count<0){
                    count =0;
                }
            }
        });

    }

    public void Licznik(){
        switch (count) {
            case 1:
                Fotki.setImageResource(R.drawable.foto1);
                break;
            case 2:
                Fotki.setImageResource(R.drawable.foto2);
                break;
            case 3:
                Fotki.setImageResource(R.drawable.foto3);
                break;
            case 4:
                Fotki.setImageResource(R.drawable.foto4);
                break;
            case 5:
                Fotki.setImageResource(R.drawable.foto5);
                break;
            case 6:
                Fotki.setImageResource(R.drawable.foto6);
                break;
            case 7:
                Fotki.setImageResource(R.drawable.foto7);
                break;
            case 8:
                Fotki.setImageResource(R.drawable.foto8);
                break;
            case 9:
                Fotki.setImageResource(R.drawable.foto9);
                break;
            case 10:
                Fotki.setImageResource(R.drawable.foto10);
                break;
            case 11:
                Fotki.setImageResource(R.drawable.foto11);
                break;
            case 12:
                Fotki.setImageResource(R.drawable.foto12);
                break;
            case 13:
                Fotki.setImageResource(R.drawable.foto13);
                break;
            case 14:
                Fotki.setImageResource(R.drawable.foto14);
                break;
            default:

                break;
        }
    }

}
