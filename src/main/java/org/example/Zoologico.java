package org.example;

public class Zoologico {
    public static void main(String[] args) {


//        Animal animal1 = new Animal();
        Animal animal1 = new Animal();
        animal1.setNombre("Cebra");
        animal1.setGenero("F");


//        animal animal2 = new animal();
//        animal2.nombre="Caballo";
//        animal2.genero="M";
        Animal animal2 = new Animal();
        animal2.setNombre("Caballo");
        animal2.setGenero("M");


//        animal1.encontrarpareja(animal2); //Un animal consigue pareja
        animal2.encontrarPareja(animal1);

//        Familia familia = new Familia(animal2;animal1);
        Familia familia = new Familia(animal2, animal1);


//        familia.tenerhijo("Cebrallo")
        familia.tenerHijo("Cebrallo");

        familia.imprimirFamilia();
    }
}