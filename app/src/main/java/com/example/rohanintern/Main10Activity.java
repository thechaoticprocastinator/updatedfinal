package com.example.rohanintern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main10Activity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    Button b1;

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        e1 = (EditText)findViewById(R.id.idate);
        b1 = (Button)findViewById(R.id.bout);
        t1 = (TextView)findViewById(R.id.tout);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String s1 = e1.getText().toString();

                int i1 = Integer.parseInt(s1);

                int fine = i1 * 1;
                String s2 = Integer.toString(fine);
                t1.setText(s2);

            }
        });








    }
}
