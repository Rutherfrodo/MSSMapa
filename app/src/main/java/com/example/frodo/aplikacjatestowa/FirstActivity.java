package com.example.frodo.aplikacjatestowa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    private Button LayoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutButton = (Button) findViewById(R.id.button5);

        LayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZmianaLayout();
            }
        });


    }
    public void ZmianaLayout(){
        Intent intent = new Intent(this, com.example.frodo.aplikacjatestowa.MainActivity.class);
        finish();
        startActivity(intent);
    }
}
