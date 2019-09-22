package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Para obtener un 'item' tenemos que llamar a findViewById
        Button helloBt = (Button) findViewById(R.id.helloBt);
        helloBt.setOnClickListener(new View.OnClickListener() { // No se permiten expresiones lambda

            @Override
            public void onClick(View view)  {
                System.out.println("Hola Mundo");
            }
        });
    }
}
