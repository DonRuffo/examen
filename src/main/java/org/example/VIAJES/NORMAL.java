package org.example.VIAJES;

public class NORMAL extends SERVICIOS{
    String asiento;

    public NORMAL() {}
    public NORMAL(String ruta, double precio,String tipo, int maleta, boolean m_adicional,String asiento) {
        super(ruta,precio,tipo,maleta,m_adicional);
        this.asiento=asiento;

    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getAsiento() {
        return asiento;
    }

    @Override
    public Double preciofinal() {
        return getPrecio();
    }
}
