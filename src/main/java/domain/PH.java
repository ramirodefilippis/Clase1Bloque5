package domain;

public class PH extends Inmueble {
    private double metroscuadrados;
    private double precio;

    @Override
    public double precioTotal(){
        return this.precio=(14000*metroscuadrados)+50000;
    }
}
