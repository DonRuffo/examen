package org.example.VIAJES;

public class VIP extends SERVICIOS{
    String servicio1, servicio2, servicio3, servicio4;
    double valorfinal;

    public VIP() {}
    public VIP(String ruta, double precio,String tipo, int maleta, boolean m_adicional,String servicio1, String servicio2, String servicio3, String servicio4) {
        super(ruta, precio, tipo, maleta, m_adicional);
        this.servicio1 = servicio1;
        this.servicio2 = servicio2;
        this.servicio3 = servicio3;
        this.servicio4 = servicio4;
    }

    public void setServicio1(String servicio1) {
        this.servicio1 = servicio1;
    }

    public void setServicio2(String servicio2) {
        this.servicio2 = servicio2;
    }

    public void setServicio3(String servicio3) {
        this.servicio3 = servicio3;
    }

    public void setServicio4(String servicio4) {
        this.servicio4 = servicio4;
    }


    public String getServicio1() {
        return servicio1;
    }

    public String getServicio2() {
        return servicio2;
    }

    public String getServicio3() {
        return servicio3;
    }

    public String getServicio4() {
        return servicio4;
    }

    @Override
    public Double preciofinal() {
        return getPrecio()+(getPrecio()*0.3);
    }
}
