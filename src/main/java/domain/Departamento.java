package domain;

public class Departamento extends Inmueble{
    private double cantidadAmbientes;
    private static double precioxAmbiente=350000;

    @Override
    public double precioTotal(){
        return (precioxAmbiente*cantidadAmbientes);
    }
}
