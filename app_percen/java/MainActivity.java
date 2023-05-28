package com.example.percentagedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText input1, input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textView3);
        input1 = findViewById(R.id.editTextNumberDecimal);
        input2 = findViewById(R.id.editTextNumberDecimal2);
    }
    public void CalcPerc(View v) {
        String numStr = input1.getText().toString();
        String perStr = input2.getText().toString();
        int num = Integer.parseInt(numStr);
        int per = Integer.parseInt(perStr);
        double res = (num * per) / 100;
        double total = num + res;
        String resStr = String.valueOf(res);
        result.setText("El total de " + numStr + " sumándole un " + perStr + "% es igual a: " + total);
    }
}