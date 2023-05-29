package com.example.calcph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputNum;
    private Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNum = findViewById(R.id.editTextNumber);
        btnCalc = findViewById(R.id.button);
    }

    public void CalcPh(View v) {

        String numStr = inputNum.getText().toString();
        int num = Integer.parseInt(numStr);
        String res = "";

        if (num < 0 || num > 14) {
            res = "Error, ingrese un número entre 0 y 14";
        } else if (num < 7) {
            res = "La sustancia es ácida";
        } else if (num == 7) {
            res = "La sustancia es neutra";
        } else if (num > 7) {
        res = "La sustancia es básica";
        }

        Toast toast=Toast.makeText(getApplicationContext(), res,Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();

    }
}