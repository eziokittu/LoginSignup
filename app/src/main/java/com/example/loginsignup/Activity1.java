package com.example.loginsignup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.id_login_text_signup);
        String text = "Don't have an account? Sign up";
        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                ds.setUnderlineText(false);
                ds.setColor(Color.BLACK);
            }
        };
        ss.setSpan(clickableSpan, 23, text.length(), 0);
        ss.setSpan(new ForegroundColorSpan(Color.BLUE), 23, text.length(), 0);
        ss.setSpan(new UnderlineSpan(), 23, text.length(), 0);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        EditText input_email = findViewById(R.id.id_login_email);
        input_email.setBackgroundTintList(ColorStateList.valueOf(Color.TRANSPARENT));
        EditText input_password = findViewById(R.id.id_login_password);
        input_password.setBackgroundTintList(ColorStateList.valueOf(Color.TRANSPARENT));

        Button loginButton = findViewById(R.id.id_login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, Activity3.class);
                startActivity(intent);
            }
        });
    }
}