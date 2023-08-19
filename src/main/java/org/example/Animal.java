package org.example;

public class Animal {

    private String nombre;
    //    String genero
    private String genero;

    //    double peso=true;
    private double peso;
    //    Animal pareja=new;
    private Animal pareja;

    public Animal(){

    }
    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

//    public void encontrarPareja(Animal pareja){
//
//    }


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", peso=" + peso +
                ", pareja=" + pareja +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Animal getPareja() {
        return pareja;
    }

    public void encontrarPareja(Animal pareja) {
        this.pareja = pareja;
    }
}
