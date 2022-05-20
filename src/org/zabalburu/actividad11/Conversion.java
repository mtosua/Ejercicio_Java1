/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.zabalburu.actividad11;

/**
 *
 * @author ichueca
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moneda m1 = new Moneda();
        m1.setImporte(125.5);
        Moneda m2 = new Moneda(200);
        System.out.println("Cambio de € a \u00A5 : " + m1.mostrarCambio(2));
        System.out.println(m1.getImporte() + "€ son " + m1.convertirA(0) + "$");
        System.out.println(m2.getImporte() + "€ son " + m2.convertirA(0) + "$");
        System.out.println(m1.getImporte() + "€ son " + m1.convertirA(1) + "\u00A3");
        System.out.println(m2.getImporte() + "€ son " + m2.convertirA(1) + "\u00A3");
        System.out.println(m1.getImporte() + "€ son " + m1.convertirA(2) + "\u00A5");
        System.out.println(m2.getImporte() + "€ son " + m2.convertirA(2) + "\u00A5");
        System.out.println(m1.getImporte() + "$ son " + m1.convertirDe(0) + "€");
        System.out.println(m2.getImporte() + "$ son " + m2.convertirDe(0) + "€");
        System.out.println(m1.getImporte() + "\u00A3 son " + m1.convertirDe(1) + "€");
        System.out.println(m2.getImporte() + "\u00A3 son " + m2.convertirDe(1) + "€");
        System.out.println(m1.getImporte() + "\u00A5 son " + m1.convertirDe(2) + "€");
        System.out.println(m2.getImporte() + "\u00A5 son " + m2.convertirDe(2) + "€");
        double dolares = 300;
        Moneda m3 = new Moneda(dolares);
        double euros = m3.convertirDe(0);
        m3.setImporte(euros);
        double yenes = m3.convertirA(2);
        System.out.println(dolares + "$ son " + yenes + "\u00A5");
    }
    
}
