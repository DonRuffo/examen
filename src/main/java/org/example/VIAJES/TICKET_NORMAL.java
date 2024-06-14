package org.example.VIAJES;

public class TICKET_NORMAL extends NORMAL{
    long codigo;

    public TICKET_NORMAL() {}
    public TICKET_NORMAL(String ruta, double precio,String tipo, int maleta, boolean m_adicional,String asiento,long codigo) {
        super(ruta,precio,tipo,maleta,m_adicional,asiento);
        this.codigo = codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    @Override
    public void imprimirdetalles() {
        System.out.println("Código: "+getCodigo());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Maletas: "+getMaleta());
        System.out.println("Maleta adicional: "+isM_adicional());
        System.out.println("Valor: "+getPrecio());
    }
}
