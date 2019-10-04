package domain;

public class Departamento extends Inmueble{
    private double cantidadAmbientes;
    private double precio;

    @Override
    public double precioTotal(){
        return this.precio=(350000*cantidadAmbientes);
    }
}
