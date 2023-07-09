package com.example.salesapp;


import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationPage extends AppCompatActivity {
    Button SignoutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);



    }
     public void openMenuPage (View v){
        startActivity(new Intent(this, MenuPage.class));
    }
}
