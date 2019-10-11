package domain;

import java.util.List;
import java.util.stream.Collectors;

public class Empleado {

    private List<Operacion> operaciones;

    private List<Operacion> operacionesCerradas(){
        return this.operaciones
                .stream()
                .filter( o -> o.estaCerrada())
                .collect(Collectors.toList());
    }

    private List<Zona> zonasOperacionesCerradas(){
        return this.operaciones
                .stream()
                .map(o -> o.zonaDelInmueble())
                .collect(Collectors.toList());
    }

    public boolean podesTenerProblemasCon(Empleado otroEmpleado){
        return cerrasteOperacionesEnLaMismaZonaQue(otroEmpleado)
                && concretasteOperacionesReservadasPor(otroEmpleado);
    }

    private boolean cerrasteOperacionesEnLaMismaZonaQue(Empleado otroEmpleado){
        List<Zona> misZonas = zonasOperacionesCerradas();
        final List<Zona> zonasDelOtro = otroEmpleado.zonasOperacionesCerradas();
        return misZonas.stream().anyMatch(z -> zonasDelOtro.contains(z));
    }

    private boolean concretasteOperacionesReservadasPor(Empleado otroEmpleado){
        final List<Operacion> operacionesReservadasPorElOtro = otroEmpleado.operacionesReservadas();
        return this.operacionesCerradas()
                .stream()
                .anyMatch( o -> operacionesReservadasPorElOtro.contains(o));
    }

}
