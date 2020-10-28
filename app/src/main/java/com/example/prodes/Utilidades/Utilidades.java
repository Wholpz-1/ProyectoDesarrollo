package com.example.prodes.Utilidades;

public class Utilidades {

    //Constantes campos tablas usuario

    public static final String TABLA_USUARIO=" usuario";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_TELFONO="telefono";
    public static final String CAMPO_CORREO="correo";

    public static  final String  CREAR_TABLA_ALUMNO=" CREATE TABLE " +TABLA_USUARIO+ " ( " + CAMPO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + CAMPO_NOMBRE + " TEXT, " + CAMPO_APELLIDO +" TEXT, " +CAMPO_TELFONO + " TEXT " +CAMPO_CORREO+ " TEXT) ";

}
