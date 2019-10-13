package com.example.demofire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {
    ImageButton neet,jee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        neet=(ImageButton) findViewById(R.id.img_neet);
         neet.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Homepage.this,Listviews.class);
                 startActivity(intent);
             }
         });

        jee=(ImageButton) findViewById(R.id.img_jee);
        jee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Homepage.this,Listviewjee.class);
                startActivity(intent1);
            }
        });
    }
}
