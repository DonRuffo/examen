package org.example;

import org.example.VIAJES.PASAJEROS;
import org.example.VIAJES.RUTAS;
import org.example.VIAJES.TICKET_NORMAL;
import org.example.VIAJES.TICKET_VIP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PASAJEROS pj = new PASAJEROS();
        PASAJEROS pj2 = new PASAJEROS();
        PASAJEROS pj3 = new PASAJEROS();
        PASAJEROS pj4 = new PASAJEROS();
        PASAJEROS pj5 = new PASAJEROS();

        pj.setCI(1721119942);
        pj.setEdad(18);
        pj.setNombre("Daniel Díaz");

        pj2.setCI(1726398352);
        pj2.setEdad(18);
        pj2.setNombre("Flavio Díaz");

        pj3.setCI(1726371003);
        pj3.setEdad(23);
        pj3.setNombre("Dennis Díaz");

        pj4.setCI(1826379942);
        pj4.setEdad(45);
        pj4.setNombre("Camila Chavez");

        pj5.setCI(1799835942);
        pj5.setEdad(50);
        pj5.setNombre("Andrea Rodriguez");

        pj.imprimir_datos();
        pj2.imprimir_datos();
        pj3.imprimir_datos();
        pj4.imprimir_datos();
        pj5.imprimir_datos();



        TICKET_VIP n1=new TICKET_VIP("Quito-Guayaquil",20.0, "VIP", 2, false,"Televisión", "Internet", "Lonch", "Música",1234);
        TICKET_VIP n2=new TICKET_VIP("Quito-Tulcán",17.50, "VIP", 2, true,"Televisión", "Internet", "Lonch", "Música",1235);
        TICKET_VIP n3=new TICKET_VIP("Quito-Riobamba",17.50, "VIP", 2, false,"Televisión", "Internet", "Lonch", "Música",1424);
        TICKET_NORMAL n4=new TICKET_NORMAL("Quito-Guayaquil",20.0, "NORMAL", 2, false,"Ventana",1453);
        TICKET_NORMAL n5=new TICKET_NORMAL("Quito-Puyo",15.0, "NORMAL", 2, true,"Pasillo",1795);

        n1.imprimirdetalles();
        n2.imprimirdetalles();
        n3.imprimirdetalles();
        n4.imprimirdetalles();
        n5.imprimirdetalles();


    }
}