package com.example.babsatu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Biodata(View view){
        Intent a = new Intent(MainActivity.this,
                Biodata.class);
        startActivity(a);
    }

    public void Segitiga(View view){
        Intent a = new Intent(MainActivity.this,
                Segitiga.class);
        startActivity(a);
    }
}
