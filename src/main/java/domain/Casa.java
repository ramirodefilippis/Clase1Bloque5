package domain;

public class Casa extends Inmueble{
    private double precio;

    @Override
    public double precioTotal(){
        return this.precio;
    }

}
