package domain;

public abstract class Inmueble {
    private int metroscuadrados;
    private int cantidadAmbientes;
    private Zona zona;
    private Operacion operacion;

    public double plus(){
        return this.zona.getPlus();
    }
    public double cambiarOperacion(Operacion){
        return this.operacion;
    }
    public double precioTotal(){
        return 0;
    }
}
