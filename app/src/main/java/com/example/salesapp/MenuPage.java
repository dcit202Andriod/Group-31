package com.example.salesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPage extends AppCompatActivity {

     ListView listView;
    private ArrayAdapter<String> adapter;

    private String[] selectableItems = {"Table 1", "Table 2", "Table 3", "Table 4", "Table 5","Table 6","Table 7","Table 8","Table 9","Table 10","Table 11","Table 12","Table 13","Table 14","Table 15","Table 16","Table 17","Table 18","Table 19," };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, selectableItems);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Table Booked Successfully: " + selectedItem, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MenuPage.this, ConfirmationPage.class);
                startActivity(intent);
            }

            });
        }
    }

