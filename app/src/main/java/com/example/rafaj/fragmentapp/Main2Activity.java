package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text,Content;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.textId);
        Content = findViewById(R.id.TextoDcontenido);
        imagen = findViewById(R.id.ImagenPlaneta);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();

        if (Intent.ACTION_SEND.equals(intentAction)){
            {
                handleReceivedText(callingIntent);
            }
        }
    }

    private void handleReceivedText(Intent intent){

        Contenido contenido = intent.getParcelableExtra("planetas");
        if (text != null){

            text.setText(contenido.getPlanetName());
        }
        if (Content != null){
            text.setText(contenido.getContenido());
        }
        imagen.setImageResource(contenido.getImagenId());
    }
}
