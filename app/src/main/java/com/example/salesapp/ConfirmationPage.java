package com.example.salesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationPage extends AppCompatActivity {
    Button SignoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        
         Button myButton = findViewById(R.id.SignoutButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform the action to go to the new page
                Intent intent = new Intent(ConfirmationPage.this, Signup.class);
                startActivity(intent);
            }
        });
    }
     public void openMenuPage (View v){
        startActivity(new Intent(this, MenuPage.class));
    }
}
