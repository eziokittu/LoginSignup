package com.example.loginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // create an array of options
        String[] options = { "Sweden", "France", "England", "Russia", "Spain", "India" };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, options);

        Spinner spinner = findViewById(R.id.id_signup_country);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedOption = (String) parent.getItemAtPosition(position);
                // do something with the selected option
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // do something when nothing is selected
            }
        });

        EditText input_signup_label = findViewById(R.id.id_signup_label);
        input_signup_label.setBackgroundTintList(ColorStateList.valueOf(Color.TRANSPARENT));

        Button continueButton = findViewById(R.id.id_signup_continuebutton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, Activity3.class);
                startActivity(intent);
            }
        });
    }
}