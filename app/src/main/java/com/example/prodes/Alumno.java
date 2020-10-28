package com.example.prodes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.prodes.Utilidades.Utilidades;

public class Alumno extends AppCompatActivity {
    EditText  campoNombre, campoApellido, campoTelefono, campoCorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);

        campoNombre=(EditText) findViewById(R.id.campoNombre);
        campoApellido=(EditText)findViewById(R.id.campoApellido);
        campoTelefono=(EditText)findViewById(R.id.campoTelefono);
        campoCorreo=(EditText)findViewById(R.id.campoCorreo);



    }
    public void onClick(View view){
         Alumno();


    }
    private void Alumno(){
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_usuarios",null,1);
        SQLiteDatabase db= conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
        values.put(Utilidades.CAMPO_APELLIDO,campoApellido.getText().toString());
        values.put(Utilidades.CAMPO_TELFONO,campoTelefono.getText().toString());
        values.put(Utilidades.CAMPO_CORREO,campoCorreo.getText().toString());


        Long idResultante=db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_ID,values);
        Toast.makeText(getApplicationContext(),"Id Registro:"+idResultante,Toast.LENGTH_SHORT).show();
    }
}