package com.example.prodes.Utilidades;

public class Utilidades_grado {

    public static final String TABLA_GRADO="grado";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_GRADO="grado";
    public static final String CAMPO_MAESTRO="maestro";
    public static final String CAMPO_AULA="aula";

    public static  final String  CREAR_TABLA_GRADO=" CREATE TABLE " + TABLA_GRADO + " ( " + CAMPO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + CAMPO_GRADO + " TEXT, " + CAMPO_MAESTRO +" TEXT, " +CAMPO_AULA + " TEXT ) ";

}
