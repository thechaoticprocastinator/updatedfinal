package com.example.rohanintern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main14Activity extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        b1 = (Button)findViewById(R.id.bu1);
        b2 = (Button)findViewById(R.id.bu2);
        b3 = (Button)findViewById(R.id.bu3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Main14Activity.this,Main6Activity.class);
                startActivity(inte);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Main14Activity.this,Main12Activity.class);
                startActivity(inte);

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Main14Activity.this,Main13Activity.class);
                startActivity(inte);

            }
        });





    }
}
