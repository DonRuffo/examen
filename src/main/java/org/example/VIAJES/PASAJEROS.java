package org.example.VIAJES;

public class PASAJEROS {
    long CI;
    String nombre;
    int edad;

    public PASAJEROS() {}
    public PASAJEROS(long CI, String nombre, int edad) {
        this.CI = CI;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setCI(long CI) {
        this.CI = CI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getCI() {
        return CI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void imprimir_datos(){
        System.out.println("CI: " + CI);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("------------------------- \n");
    }

}
