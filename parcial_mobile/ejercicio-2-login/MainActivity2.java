package com.example.parcialmkaenv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView3 = findViewById(R.id.textView3);
        Bundle bundle = getIntent().getExtras();
        textView3.setText("Usted ingresó como: " + bundle.getString("isAdmin"));
    }
}