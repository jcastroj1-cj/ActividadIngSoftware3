/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.miempresa.nomina;

/**
 *
 * @author Jean Carlos
 */
public class NominaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        empleado e1 = new Asalariado("Neyla Castilla", 6, 2500000);
        empleado e2 = new empleadoPorHoras("Luis Eduardo Mercado", 2, 30000, 45, true);
        empleado e3 = new empleadoPorComision("Carlos Paternina", 4, 1800000, 25000000, 0.05);
        empleado e4 = new empleadoTemporal("Maria Blanco", 1, 1500000);

        empleado[] empleados = {e1, e2, e3, e4};

        for (empleado emp : empleados) {
            System.out.println(emp);
        }
    }
}


