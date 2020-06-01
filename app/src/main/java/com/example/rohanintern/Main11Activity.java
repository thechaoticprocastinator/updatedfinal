package com.example.rohanintern;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main11Activity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;
    EditText e1,e2,e3,e4,e5,e6;
    Button su,re;
    DatabaseReference root1,demo10,demo100,demo200,demo300,demo400,demo500,demo6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        e1 = (EditText)findViewById(R.id.editText3000);
        e2 = (EditText)findViewById(R.id.editText4000);
        e3 = (EditText)findViewById(R.id.editText5000);
        e4 = (EditText)findViewById(R.id.editText7000);
        e5 = (EditText)findViewById(R.id.editText8000);
        e6 = (EditText)findViewById(R.id.editText9000);


        su = (Button)findViewById(R.id.button6000);
        re = (Button)findViewById(R.id.button2000);
        t1 = (TextView)findViewById(R.id.textView3000);
        t2 = (TextView)findViewById(R.id.textView4000);
        t3 = (TextView)findViewById(R.id.textView5000);
        t4 = (TextView)findViewById(R.id.textView6000);
        t5 = (TextView)findViewById(R.id.textView7000);
        t6 = (TextView)findViewById(R.id.textView9000);
        root1 = FirebaseDatabase.getInstance().getReference();
        demo10 = root1.child("Timetable of Monday");
        demo100 = root1.child("Timetable of Tuesday");
        demo200 = root1.child("Timetable of Wednesday");
        demo300 = root1.child("Timetable of Thursday");
        demo400 = root1.child("Timetable of Friday");
        demo500 = root1.child("Timetable of Saturday");


        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v =e1.getText().toString();
                String v1 =e2.getText().toString();
                String v2 =e3.getText().toString();
                String v3 =e4.getText().toString();
                String v4 =e5.getText().toString();
                String v5 =e6.getText().toString();

                demo10.setValue(v);
                demo100.setValue(v1);
                demo200.setValue(v2);
                demo300.setValue(v3);
                demo400.setValue(v4);
                demo500.setValue(v5);


            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demo10.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t1.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main11Activity.this,"Error",Toast.LENGTH_LONG).show();

                    }





                });
                demo100.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t2.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main11Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });

                demo200.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t3.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main11Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });

                demo300.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t4.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main11Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });

                demo400.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t5.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main11Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });

                demo500.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t6.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main11Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });






            }
        });

    }
}
