package com.example.tasas;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputNum;
    private Button btnCalc;
    // private TextView result;

    private RadioButton radioButton, radioButton2, radioButton3;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // result = findViewById(R.id.textView2);
        inputNum = findViewById(R.id.editTextNumber);
        btnCalc = findViewById(R.id.button);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);

    }

    public void CalcIncome(View v) {
        String numStr = inputNum.getText().toString();
        int num = Integer.parseInt(numStr);
        double res=0, total=0;

        if (radioButton.isChecked()) {
            res = (num * 20) / 100;
        } else if (radioButton2.isChecked()) {
            res = (num * 30) / 100;
        } else if (radioButton3.isChecked()) {
            res = (num * 35) / 100;
        }

        total = num + res;

        // result.setText("Su ganancia será de $" + total);

        Toast toast=Toast.makeText(getApplicationContext(),"Su ganancia será de $" + total,Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();

    }
}