package com.example.gleitonvilarim.exerciciodupla2;



import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class LigarActivity extends AppCompatActivity implements View.OnClickListener {


    Button btLigar;
    EditText campoTelefone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligar);

        Button btnPhone = (Button) findViewById(R.id.btnPhone);
        btnPhone.setOnClickListener(this);

        Button buttonVoltar10 = (Button) findViewById(R.id.buttonVoltar2);

        buttonVoltar10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(LigarActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
    public void onClick(View view) {

        EditText campoTelefone = (EditText) findViewById(R.id.edPhone);
        String telefone = campoTelefone.getText().toString();
        Uri uri = Uri.parse("tel:"+telefone);
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }
}