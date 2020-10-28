package com.example.prodes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prodes.Utilidades.Utilidades;
import com.example.prodes.Utilidades.Utilidades_grado;

public class Grado extends AppCompatActivity {
    EditText campoGrado, campoMaestro, campoAula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grado);

        campoGrado=(EditText) findViewById(R.id.campoGrado);
        campoMaestro=(EditText)findViewById(R.id.campoMaestro);
        campoAula=(EditText)findViewById(R.id.campoAula);


    }
    public void onClick(View view){
        Grado();


    }
    private void Grado(){
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_grado",null,1);
        SQLiteDatabase db= conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades_grado.CAMPO_GRADO,campoGrado.getText().toString());
        values.put(Utilidades_grado.CAMPO_MAESTRO,campoMaestro.getText().toString());
        values.put(Utilidades_grado.CAMPO_AULA,campoAula.getText().toString());


        Long idResultante=db.insert(Utilidades_grado.TABLA_GRADO,Utilidades.CAMPO_ID,values);
        Toast.makeText(getApplicationContext(),"Id Registro:"+idResultante,Toast.LENGTH_SHORT).show();
    }
}