package com.example.frodo.aplikacjatestowa;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FirstActivity extends AppCompatActivity {

    LinearLayout mLinearLayout;
    private Button LayoutButton;
    private Button WycieczkaButton;
    private ImageView foto;
    private ImageView foto2;
    private ImageView foto3;
    private ImageView foto4;
    MediaPlayer muzyka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        muzyka = MediaPlayer.create(FirstActivity.this,R.raw.poopooo);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = new LinearLayout(this);
        LayoutButton = (Button) findViewById(R.id.button5);
        WycieczkaButton = (Button) findViewById(R.id.button);
        foto = (ImageView) findViewById(R.id.imageView);
        foto2 = (ImageView) findViewById(R.id.imageView3);
        foto3 = (ImageView) findViewById(R.id.imageView4);
        foto4 = (ImageView) findViewById(R.id.imageView5);

        akcja();
        WycieczkaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZmianaLayoutTrzy();
            }
        });

        LayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZmianaLayout();
            }
        });
        Animation animation;
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        animation.setRepeatCount(5);
        foto.startAnimation(animation);
        foto2.startAnimation(animation);
        foto3.startAnimation(animation);
        foto4.startAnimation(animation);
        animation.setRepeatCount(5);

    }

    /*
    Zmiana obecnie obsługiwanego pliku XML oraz clasy Java
     */
    public void ZmianaLayout(){
        Intent intent = new Intent(this, com.example.frodo.aplikacjatestowa.MainActivity.class);
        finish();
        startActivity(intent);
    }
    public void ZmianaLayoutDwa(){
        Intent intentcik = new Intent(this,com.example.frodo.aplikacjatestowa.WycieczkiClass.class);
        finish();
        startActivity(intentcik);
    }

    public void ZmianaLayoutTrzy(){
        Intent intentcik = new Intent(this,com.example.frodo.aplikacjatestowa.FotoActivity.class);
        finish();
        startActivity(intentcik);
    }
    public void akcja()
    {
        if(muzyka.isPlaying())
        {
            muzyka.pause();
        }else
        {
            muzyka.start();
        }
    }
}
