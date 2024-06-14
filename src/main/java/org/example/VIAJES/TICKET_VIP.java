package org.example.VIAJES;

public class TICKET_VIP extends VIP{
    long codigo;

    public TICKET_VIP() {}
    public TICKET_VIP(String ruta, double precio,String tipo, int maleta, boolean m_adicional,String servicio1, String servicio2, String servicio3, String servicio4,long codigo) {
        super(ruta,precio,tipo,maleta,m_adicional,servicio1,servicio2, servicio3, servicio4);
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
        System.out.println("Servicio1: "+getServicio1());
        System.out.println("Servicio2: "+getServicio2());
        System.out.println("Servicio3: "+getServicio3());
        System.out.println("Servicio4: "+getServicio4());
        System.out.println("Valor: "+preciofinal());
        System.out.println("--------------------------\n");
    }
}
