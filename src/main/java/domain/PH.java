package domain;

public class PH extends Inmueble {
    private double metroscuadrados;
    private static double precioxMetrocuadrado;
    private static double montoMinimo;

    @Override
    public double precioTotal(){
        return (precioxMetrocuadrado*metroscuadrados)+montoMinimo;
    }
}
