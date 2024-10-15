package com.example.ex08_1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnCall, btnSMS;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnCall = findViewById(R.id.btn_call);
        btnSMS = findViewById(R.id.btn_sms);
        btnCall.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CallActivity.class);
            startActivity(intent);
        });
        btnSMS.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SMSActivity.class);
            startActivity(intent);
        });
    }
}