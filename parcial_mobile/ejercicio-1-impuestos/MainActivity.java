package com.example.parcialmkaenv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText amount;
    private Button btn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = findViewById(R.id.editTextNumber);
        btn = findViewById(R.id.button);
        result = findViewById(R.id.textView3);
    }
    public void CalcAmount(View v) {

        String numStr = amount.getText().toString();
        int num = Integer.parseInt(numStr);
        int iva = 21;
        int iibb = 3;

        // Calculo monto de IVA, IIBB y total

        double resIva = (num * iva) / 100;
        double resIibb = (num * iibb) / 100;
        double total = num + resIva + resIibb;

        // Muestro resultado en TextView
        result.setText("El total del monto sumando los impuestos es: $" + total);

        // Toast para mostrar alerta si el monto es > 100k
        Toast toast=Toast.makeText(getApplicationContext(),"Atención, su monto supera los $100k",Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        if (total > 100000) {
            toast.show();
        }

    }
}