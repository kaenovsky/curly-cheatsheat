package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton, radioButton2, radioButton3,
            radioButton4, radioButton5,radioButton6;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);
        radioButton6 = findViewById(R.id.radioButton6);

    }

    public void ShowPrice(View v) {

        int price = 0;

        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.radioButton:
                price = 30;
                break;
            case R.id.radioButton2:
                price = 36;
                break;
            case R.id.radioButton3:
                price = 560;
                break;
            case R.id.radioButton4:
                price = 320;
                break;
            case R.id.radioButton5:
                price = 200;
                break;
            case R.id.radioButton6:
                price = 70;
                break;
            default:
                System.out.println("Error");
                break;
        }

        Toast toast=Toast.makeText(getApplicationContext(),"El precio es $" + price,Toast.LENGTH_SHORT);
        toast.show();

    }
}