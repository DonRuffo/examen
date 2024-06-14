package org.example.VIAJES;

public class RUTAS{
    String ruta;
    double precio;

    public RUTAS() {}
    public RUTAS(String ruta, double precio) {
        this.ruta = ruta;
        this.precio = precio;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRuta() {
        return ruta;
    }

    public double getPrecio() {
        return precio;
    }

}
