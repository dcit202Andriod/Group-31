package com.example.salesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup extends AppCompatActivity {

    EditText signupName, signupEmail,signupNumber,signupPassword;
    Button Registerbtn;
    FirebaseDatabase database;
    DatabaseReference reference;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_signup);

            signupEmail = findViewById(R.id.Email);
            signupName = findViewById(R.id.username);
            signupPassword = findViewById(R.id.password);
            signupNumber = findViewById(R.id.phone);
            Registerbtn = findViewById(R.id.Registerbtn);

            Registerbtn.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    database = FirebaseDatabase.getInstance();
                    reference = database.getReference("users");

                    String name = signupName.getText().toString();
                    String Email = signupEmail.getText().toString();
                    String Number = signupNumber.getText().toString();
                    String Password = signupPassword.getText().toString();

                    Helperclass helperclass = new Helperclass(name,Email,Password,Number);
                    reference.child(name).setValue(helperclass);

                    Toast.makeText(Signup.this, "Signup Successfull!", Toast.LENGTH_SHORT).show();

                }
            }
            );

        }
        public void openMain (View v){
            startActivity(new Intent(this, Signin.class));
        }

    }
