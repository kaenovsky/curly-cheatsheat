package com.example.parcialmkaenv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.Context;
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
        SharedPreferences pref = getSharedPreferences("ph", Context.MODE_PRIVATE);
        inputNum.setText(pref.getString("ph",""));
    }

    public void CalcPh(View v) {

        String numStr = inputNum.getText().toString();

        SharedPreferences sharedPref = getSharedPreferences("ph", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("ph", numStr);
        editor.commit();

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
        toast.show();

    }

}