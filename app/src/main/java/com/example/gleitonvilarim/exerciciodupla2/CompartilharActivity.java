package com.example.gleitonvilarim.exerciciodupla2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class CompartilharActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartilhar);

        Button buttonCompartilhar = (Button) findViewById(R.id.buttonCompartilhamento);
        buttonCompartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBordy = "O que vai compartilhar aqui";
                String shareSub = "Compartilhar";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBordy);
                startActivity(Intent.createChooser(myIntent, "Share using"));
            }
        });
        Button buttonVoltar11 = (Button) findViewById(R.id.buttonVoltar);
        buttonVoltar11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CompartilharActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}