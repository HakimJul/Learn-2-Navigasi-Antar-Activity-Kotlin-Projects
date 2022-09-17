package com.example.learn2navigasiantaractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBukaSatu, btnBukaDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBukaSatu = (Button) findViewById(R.id.btnBukaSatu);
        btnBukaDua = (Button) findViewById(R.id.btnBukaDua);

        btnBukaSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActSatu = new Intent(getApplicationContext(),MainActivity1.class);
                startActivity(BukaActSatu);
            }
        });

        btnBukaDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaActDua();
            }
        });
    }

    public void BukaActDua(){
        Intent BukaActDua = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(BukaActDua);
    }
}