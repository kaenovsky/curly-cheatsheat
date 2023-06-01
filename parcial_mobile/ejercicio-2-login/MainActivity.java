package com.example.parcialmkaenv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextText;
    private EditText editTextTextPassword;
    private EditText editTextNumberPassword;
    private Button button;
    private RadioGroup radioGroup;
    private RadioButton radioButton, radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText = findViewById(R.id.editTextText);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        editTextNumberPassword = findViewById(R.id.editTextNumberPassword);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
    }

    public void Login(View v) {

        // Hardcodeo datos de login correcto
        String validUser = "loganroy";
        String validPass = "toomuchmoney";
        String validPin  = "1958";

        // Traigo los valores ingresados como String
        String nameStr = editTextText.getText().toString();
        String passStr = editTextTextPassword.getText().toString();
        String npinStr = editTextNumberPassword.getText().toString();
        String isAdmin = "";

        // Chequeo si el usuario es admin o user
        if (radioButton.isChecked()) {
            isAdmin = "admin";
        } else {
            isAdmin = "user";
        }

        // Valido datos de login
        if (nameStr.equals(validUser) && passStr.equals(validPass) && npinStr.equals(validPin)) {
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("isAdmin", isAdmin);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),"Falló el login",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}