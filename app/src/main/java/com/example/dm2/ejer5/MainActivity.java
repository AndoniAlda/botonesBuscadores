package com.example.dm2.ejer5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnYahoo;
    Button btnGoogle;
    Button btnBing;
    ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnYahoo = (Button) findViewById(R.id.btnYahoo);
        btnGoogle = (Button) findViewById(R.id.btnGoogle);
        btnBing = (Button) findViewById(R.id.btnBing);
        logo = (ImageView) findViewById(R.id.logo);

        btnYahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               logo.setImageResource(R.drawable.ic_yahoo);
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo.setImageResource(R.drawable.ic_google);
            }
        });
        btnBing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo.setImageResource(R.drawable.ic_bing);
            }
        });


    }
}
