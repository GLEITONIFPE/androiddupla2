package com.example.gleitonvilarim.exerciciodupla2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonAction;
    Button buttonCam;
    Button buttonCompartilhamento2;
    Button  buttonLigar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonAction = (Button) findViewById(R.id.buttonAction);

        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, ActionBarActivity.class);
                startActivity(it);

            }


        });



        buttonCam = (Button) findViewById(R.id.buttonCam);

        buttonCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(it);

            }
        });

        buttonCompartilhamento2 = (Button) findViewById(R.id.buttonCompartilhamento2);

        buttonCompartilhamento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, CompartilharActivity.class);
                startActivity(it);

            }
        });

        buttonLigar = (Button) findViewById(R.id. buttonLigar);

        buttonLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, LigarActivity.class);
                startActivity(it);

            }
        });


    }

}
