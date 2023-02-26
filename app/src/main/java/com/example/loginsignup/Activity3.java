package com.example.loginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button button_statistics = findViewById(R.id.id_activity3_button_statistics);
        Button button_journey = findViewById(R.id.id_activity3_button_journey);
        View parentView1 = (View) button_statistics.getParent();
        parentView1.setBackgroundColor(Color.BLACK);
        button_statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_statistics.setBackgroundColor(getColor(R.color.button_color));
                button_journey.setBackgroundColor(Color.WHITE);
                button_statistics.setTextColor(Color.WHITE);
                button_journey.setTextColor(Color.BLACK);
            }
        });
        button_journey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_statistics.setBackgroundColor(Color.WHITE);
                button_journey.setBackgroundColor(getColor(R.color.button_color));
                button_statistics.setTextColor(Color.BLACK);
                button_journey.setTextColor(Color.WHITE);
            }
        });

        Button button_week = findViewById(R.id.id_activity3_button_week);
        Button button_month = findViewById(R.id.id_activity3_button_month);
        Button button_year = findViewById(R.id.id_activity3_button_year);
        View parentView2 = (View) button_week.getParent();
        parentView2.setBackgroundColor(Color.BLACK);
        button_week.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_week.setBackgroundColor(getColor(R.color.button_color));
                button_month.setBackgroundColor(Color.WHITE);
                button_year.setBackgroundColor(Color.WHITE);
                button_week.setTextColor(Color.WHITE);
                button_month.setTextColor(Color.BLACK);
                button_year.setTextColor(Color.BLACK);
            }
        });
        button_month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_week.setBackgroundColor(Color.WHITE);
                button_month.setBackgroundColor(getColor(R.color.button_color));
                button_year.setBackgroundColor(Color.WHITE);
                button_week.setTextColor(Color.BLACK);
                button_month.setTextColor(Color.WHITE);
                button_year.setTextColor(Color.BLACK);
            }
        });
        button_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_week.setBackgroundColor(Color.WHITE);
                button_month.setBackgroundColor(Color.WHITE);
                button_year.setBackgroundColor(getColor(R.color.button_color));
                button_week.setTextColor(Color.BLACK);
                button_month.setTextColor(Color.BLACK);
                button_year.setTextColor(Color.WHITE);
            }
        });
    }
}