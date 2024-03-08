package com.example.clase_practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mpas.R;

public class MainActivity extends AppCompatActivity {

    EditText edtNum1, edtNum2;

    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);

        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(view -> {
            int num1 = Integer.parseInt(edtNum1.getText().toString());
            int num2 = Integer.parseInt(edtNum1.getText().toString());
            System.out.println("la suma es: " + (num1 + num2));
        });
    }
}