package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    @Override
    public String toString() {
        return "Raton{idRaton=" + idRaton + ", " + super.toString() + "}";
    }
}
