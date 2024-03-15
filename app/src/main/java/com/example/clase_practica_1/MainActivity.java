package com.example.clase_practica_1;

import android.content.Intent;
import android.icu.text.Edits;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mpas.R;
import com.example.mpas.resta;

public class MainActivity extends AppCompatActivity {

    EditText edtNum1, edtNum2;
    TextView txtResult;

    Button btnCalculate, btnSubstract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        txtResult = findViewById(R.id.txtResult);

        btnCalculate = findViewById(R.id.btnCalculate);
        btnSubstract = findViewById(R.id.btnSubstract);

        btnCalculate.setOnClickListener(view -> calculate(edtNum1, edtNum2, txtResult));
        btnSubstract.setOnClickListener(view -> substract());


    }

    public void substract() {
        Intent i = new Intent(MainActivity.this, resta.class);
        startActivity(i);
    }

    public void calculate(EditText edtNum1, EditText edtNum2, TextView txtResult) {

        String val1 = edtNum1.getText().toString();
        String val2 = edtNum2.getText().toString();
        if (!val1.isEmpty() && !val2.isEmpty()) {
            int num1 = Integer.parseInt(val1);
            int num2 = Integer.parseInt(val2);

            txtResult.setText(String.valueOf(addTwoNumbers(num1, num2)));
        } else {
            Toast.makeText(MainActivity.this, "Debe poner los numeros a sumar", Toast.LENGTH_LONG).show();
            txtResult.setText("0");
            edtNum2.setText("");
            edtNum1.setText("");
        }
    }

    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}