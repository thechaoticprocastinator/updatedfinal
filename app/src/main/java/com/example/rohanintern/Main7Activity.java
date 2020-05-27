package com.example.rohanintern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] syll = {"sem1","sem2","sem3","sem4","sem5","sem6","sem7","sem8"};
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Spinner sp = (Spinner)findViewById(R.id.spinner);
        t1 = (TextView)findViewById(R.id.textView8);
        t2 = (TextView)findViewById(R.id.textView9);
        sp.setOnItemSelectedListener(this);
        ArrayAdapter a = new ArrayAdapter(this,android.R.layout.simple_spinner_item,syll);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(a);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:t1.setText(syllabus.SEM_12_PPS_SYLLABUS);
                t2.setText(syllabus.SEM_12_PPS_BOOKS);
                break;

            case 1:t1.setText(syllabus.SEM_12_PPS_SYLLABUS);
                t2.setText(syllabus.SEM_12_PPS_BOOKS);
                break;

            case 2:t1.setText(syllabus.SEM_3_DS_SYLLABUS);
                t2.setText(syllabus.SEM_3_DS_BOOKS);
                break;

            case 3:t1.setText(syllabus.SEM_4_FLAT_SYLLABUS);
                t2.setText(syllabus.SEM_4_FLAT_BOOKS);
                break;

            case 4:t1.setText(syllabus.SEM_5_DBMS_SYLLABUS);
                t2.setText(syllabus.SEM_5_DBMS_BOOKS);
                break;

            case 5:t1.setText(syllabus.SEM_6_CD_SYLLABUS);
                t2.setText(syllabus.SEM_6_CD_BOOKS);
                break;

            case 6:t1.setText(syllabus.SEM_7_CNT_SYLLABUS);
                t2.setText(syllabus.SEM_7_CNT_BOOKS);
                break;

            case 7:t1.setText(syllabus.SEM_8_VLSI_SYLLABUS);
                t2.setText(syllabus.SEM_8_VLSI_BOOKS);
                break;


        }



    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
