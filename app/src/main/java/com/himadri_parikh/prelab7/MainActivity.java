package com.himadri_parikh.prelab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNext, btnBrow, btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBrow = findViewById(R.id.btnBrowser);
        btnNext = findViewById(R.id.btnNext);
        btnCalc = findViewById(R.id.btnCalculator);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,
                        NextActivity.class);

                startActivity(i1);
            }
        });

        btnBrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.co.in"));
                startActivity(i1);
            }
        });

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("myHandler");
                startActivity(intent);
            }
        });
    }
}