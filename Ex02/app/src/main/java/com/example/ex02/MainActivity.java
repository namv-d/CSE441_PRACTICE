package com.example.ex02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    View btncall;

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this," CR424 - onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this," CR424 - onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"CR424 - on Destroy()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this," CR424 - onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this," CR424 - onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this," CR424 - onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"CR424 - onCreat()", Toast.LENGTH_SHORT).show();
        btncall = findViewById(R.id.btncall);
        btncall.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this,Subactivity.class); startActivity(intent1);
            }
        });
    }
}