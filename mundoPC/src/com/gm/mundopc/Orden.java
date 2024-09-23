package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("No se pueden agregar más computadoras a la orden");
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + idOrden);
        System.out.println("Computadoras en la orden:");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}

