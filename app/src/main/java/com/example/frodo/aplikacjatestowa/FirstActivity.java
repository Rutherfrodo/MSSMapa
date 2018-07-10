package com.example.frodo.aplikacjatestowa;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class FirstActivity extends AppCompatActivity {

    LinearLayout mLinearLayout;
    private Button LayoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = new LinearLayout(this);
        LayoutButton = (Button) findViewById(R.id.button5);


        LayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZmianaLayout();
            }
        });
        Animation animation;
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        LayoutButton.startAnimation(animation);
    }

    /*
    Zmiana obecnie obsługiwanego pliku XML oraz clasy Java
     */
    public void ZmianaLayout(){
        Intent intent = new Intent(this, com.example.frodo.aplikacjatestowa.MainActivity.class);
        finish();
        startActivity(intent);
    }
}
