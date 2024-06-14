package org.example.VIAJES;

public class SERVICIOS extends RUTAS{
    String tipo;
    int maleta;
    boolean m_adicional;

    public SERVICIOS() {}
    public SERVICIOS(String ruta, double precio,String tipo, int maleta, boolean m_adicional) {
        super(ruta, precio);
        this.tipo = tipo;
        this.maleta = maleta;
        this.m_adicional = m_adicional;

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMaleta(int maleta) {
        this.maleta = maleta;
    }

    public void setM_adicional(boolean m_adicional) {
        this.m_adicional = m_adicional;
    }

    public String getTipo() {
        return tipo;
    }

    public int getMaleta() {
        return maleta;
    }

    public boolean isM_adicional() {
        return m_adicional;
    }

    public Double preciofinal(){
        return getPrecio();
    }

    public void imprimirdetalles(){
        System.out.println(getTipo());
        System.out.println(getMaleta());
        System.out.println(getPrecio());
        System.out.println(getPrecio());
        System.out.println(getPrecio());
    }
}
