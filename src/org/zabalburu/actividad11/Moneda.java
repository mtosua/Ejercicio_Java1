/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad11;

/**
 *
 * @author ichueca
 */
public class Moneda {
    private double importe;
    private final static double ADOLAR = 1.18;
    private final static double ALIBRA = 0.90;
    private final static double AYEN = 123.01;

    public Moneda() {
    }

    public Moneda(double importe) {
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public double convertirA(int tipo){
        double resultado;
        if (tipo == 0){
            resultado = this.importe * Moneda.ADOLAR;
        } else if (tipo == 1){
            resultado = this.importe * Moneda.ALIBRA;
        } else {
            resultado = this.importe * Moneda.AYEN;
        }
        return resultado;
    }
    
    public double convertirDe(int tipo){
        double resultado;
        if (tipo == 0){
            resultado = this.importe / Moneda.ADOLAR;
        } else if (tipo == 1){
            resultado = this.importe / Moneda.ALIBRA;
        } else {
            resultado = this.importe / Moneda.AYEN;
        }
        return resultado;
    }
    
    public double mostrarCambio(int tipo){
        if (tipo == 0){
            return Moneda.ADOLAR;
        } else if (tipo == 1){
            return Moneda.ALIBRA;
        } else {
            return Moneda.AYEN;
        }
    }
}
