package com.example.ex07_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnRes;
    private EditText editTextA, editTextB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.edittextB);
        btnRes = findViewById(R.id.btn_res);



        btnRes.setOnClickListener(v -> {
            if(editTextA.getText().toString().isEmpty() || editTextB.getText().toString().isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập a và b", Toast.LENGTH_SHORT).show();
            }
            float a = Float.parseFloat(editTextA.getText().toString());

            float b = Float.parseFloat(editTextB.getText().toString());
            String res = calculate(a, b);

            Intent intent = new Intent(this, SubActivity.class);
            intent.putExtra("res", res);
            startActivity(intent);
        });

    }
    // ax + b =0
    private String calculate(float a, float b) {

        if(a ==0) {
            if(b==0) {
                return "Phương trình vô số nghiệm";
            }else {
                return "Phương trình vô nghiệm";
            }
        }
        return -b/a + "";
    }
}