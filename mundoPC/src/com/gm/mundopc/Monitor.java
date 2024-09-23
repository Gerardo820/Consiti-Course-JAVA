package com.gm.mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    public Monitor(String marca, double tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.idMonitor = ++contadorMonitores;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{idMonitor=" + idMonitor + ", marca='" + marca + '\'' + ", tamaño=" + tamaño + " pulgadas" + "}";
    }
}

