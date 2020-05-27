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

public class Main8Activity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button su,re;
    TextView t1,t2,t3,t4,t5,t6,t7;
    DatabaseReference root,demo,demo1,demo2,demo3,demo4,demo5,demo6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        e1 = (EditText)findViewById(R.id.namestu);
        e2 = (EditText)findViewById(R.id.registration);
        e3 = (EditText)findViewById(R.id.semester);
        e4 = (EditText)findViewById(R.id.phone);
        e5 = (EditText)findViewById(R.id.subject);
        e6 = (EditText)findViewById(R.id.emailstu);
        e7 = (EditText)findViewById(R.id.paper);

        su = (Button)findViewById(R.id.button20);
        re = (Button)findViewById(R.id.retrive);
        t1 = (TextView)findViewById(R.id.textView60);
        t2 = (TextView)findViewById(R.id.textView70);
        t3 = (TextView)findViewById(R.id.textView80);
        t4 = (TextView)findViewById(R.id.textView90);
        t5 = (TextView)findViewById(R.id.textView100);
        t6 = (TextView)findViewById(R.id.textView110);
        t7 = (TextView)findViewById(R.id.textView120);
        root = FirebaseDatabase.getInstance().getReference();
        demo = root.child("name");
        demo1 = root.child("reg no");
        demo2 = root.child("mail");
        demo3 = root.child("phone no");
        demo4 = root.child("subject");
        demo5 = root.child("sem");
        demo6 = root.child("sem");

        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v =e1.getText().toString();
                String v1 =e2.getText().toString();
                String v2 =e3.getText().toString();
                String v3 =e4.getText().toString();
                String v4 =e5.getText().toString();
                String v5 =e6.getText().toString();
                String v6 =e7.getText().toString();
                demo.setValue(v);
                demo1.setValue(v1);
                demo2.setValue(v2);
                demo3.setValue(v3);
                demo4.setValue(v4);
                demo5.setValue(v5);
                demo6.setValue(v6);

            }
        });

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demo.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t1.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main8Activity.this,"Error",Toast.LENGTH_LONG).show();

                    }





                });
                demo1.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t2.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main8Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });

                demo2.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t3.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main8Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });

                demo3.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t4.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main8Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });

                demo4.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t5.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main8Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });

                demo5.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t6.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main8Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });

                demo6.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String val = dataSnapshot.getValue(String.class);
                        t7.setText(val);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Main8Activity.this, "Error", Toast.LENGTH_LONG).show();

                    }
                });





            }
        });



    }
}
