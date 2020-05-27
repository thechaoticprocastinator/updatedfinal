package com.example.rohanintern;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Main3Activity extends AppCompatActivity {
    public EditText inputEmail, inputPassword;
    public Button btnSignU;
    public TextView t1;
    public FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        inputEmail = (EditText) findViewById(R.id.editText);
        inputPassword = (EditText) findViewById(R.id.editText2);
        auth = FirebaseAuth.getInstance();
        btnSignU = (Button) findViewById(R.id.button);

        t1 = (TextView) findViewById(R.id.textView);
        btnSignU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = inputEmail.getText().toString();
                String pass = inputPassword.getText().toString();
                if (email.isEmpty()) {
                    inputEmail.setError("Enter email id");

                } else if (pass.isEmpty()) {
                    inputPassword.setError("Enter password");
                } else if (email.isEmpty() && pass.isEmpty()) {
                    Toast.makeText(Main3Activity.this, "Fields are empty", Toast.LENGTH_SHORT);
                } else if (!(email.isEmpty() && pass.isEmpty())) {
                    auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(Main3Activity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Main3Activity.this, "sucess", Toast.LENGTH_SHORT);
                                startActivity(new Intent(Main3Activity.this, Main4Activity.class));

                            } else {

                                Toast.makeText(Main3Activity.this, "Failed", Toast.LENGTH_SHORT);
                            }
                        }
                    });
                } else {
                    Toast.makeText(Main3Activity.this, "Error", Toast.LENGTH_SHORT);
                }

            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(i);
            }
        });

    }
}
