package com.example.clase_practica_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

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
            int num2 = Integer.parseInt(edtNum2.getText().toString());
            int sum = num1 + num2;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("La suma de los numeros " + num1 + " y " + num2 + " es:")
                    .setMessage(String.valueOf(sum))
                    .show();
        });
    }
}