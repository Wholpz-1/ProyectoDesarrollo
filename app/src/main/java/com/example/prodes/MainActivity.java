package com.example.prodes;

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

        public void onClick (View view){

            Intent miIntent = null;

            switch (view.getId()) {
                case R.id.img_alumno:
                    miIntent = new Intent(MainActivity.this, Alumno.class);
                    break;
                case R.id.Line_grado:
                    miIntent = new Intent(MainActivity.this, Grado.class);
                    break;
                case R.id.Line_ins:
                    miIntent = new Intent(MainActivity.this, Inscripcion.class);
                    break;


            }
            startActivity(miIntent);
        }


    }
