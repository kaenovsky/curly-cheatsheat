package com.example.parcialmkaenv4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber;
    private Button button;
    private TextView textView3, textView4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
    }

    public void CalcM3(View v) {

        String numStr = editTextNumber.getText().toString();
        int num = Integer.parseInt(numStr);

        double resDeca = num * 1000;
        double resDeci = num * 0.001;

        String resDecaStr = String.valueOf(resDeca);
        String resDeciStr = String.valueOf(resDeci);
        textView3.setText("El total en decametros es: " + resDecaStr);
        textView4.setText("El total en decimetros es: " + resDeciStr);
    }
}