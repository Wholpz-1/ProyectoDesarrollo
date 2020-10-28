package com.example.prodes.Entidades;

public class Grado {
    private Integer id;
    private String grado;
    private String maestro;
    private String aula;

    public Grado(Integer id, String grado, String maestro, String aula) {
        this.id = id;
        this.grado = grado;
        this.maestro = maestro;
        this.aula = aula;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;

    }
    public String getMaestro() {
        return maestro;
    }
    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }
    public String getAula() {
        return aula;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }
}
