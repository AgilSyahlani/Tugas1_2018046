package com.example.babsatu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText)findViewById(R.id.input_alas);
        final EditText tinggi = (EditText)findViewById(R.id.input_tinggi);

        final TextView luas = (TextView)findViewById(R.id.output_hasil);

        final Button hitung = (Button)findViewById(R.id.btn_hitung);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Double value1 = Double.parseDouble(tinggi.getText().toString());
                Double value2 = Double.parseDouble(alas.getText().toString());
                Double hitung_luas = (value1*value2)/2;
                luas.setText(hitung_luas.toString());
            }
        });
    }
}