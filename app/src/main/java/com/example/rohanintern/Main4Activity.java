package com.example.rohanintern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Main4Activity extends AppCompatActivity {
    private Button b,b1,b2,b3,b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b = (Button)findViewById(R.id.bottom);
        b1 = (Button)findViewById(R.id.button4);
        b2 = (Button)findViewById(R.id.button3);
        b3 = (Button)findViewById(R.id.button10);
        b4 = (Button) findViewById(R.id.button40);
        b5 = (Button) findViewById(R.id.lib);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent inte =new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(inte);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_APP_CALCULATOR);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Main4Activity.this,Main14Activity.class);
                startActivity(inte);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Main4Activity.this,Main7Activity.class);
                startActivity(inte);


            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Main4Activity.this,Main8Activity.class);
                startActivity(inte);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(Main4Activity.this,Main10Activity.class);
                startActivity(inte);

            }
        });


    }
}
