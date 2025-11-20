/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina.main;

/**
 *
 * @author Jean Carlos
 */
import nomina.model.*;
import nomina.service.NominaService;

public class Principal {

    public static void main(String[] args) {

        // Crear el servicio de nómina
        NominaService nomina = new NominaService();

        // Crear empleados de prueba
        Empleado e1 = new EmpleadoAsalariado("Ana", "001", 6, 2_000_000);
        Empleado e2 = new EmpleadoPorHoras("Pedro", "002", 2, 20000, 50, true);
        Empleado e3 = new EmpleadoPorComision("Carlos", "003", 3, 1_000_000, 25_000_000, 0.05);
        Empleado e4 = new EmpleadoTemporal("Laura", "004", 1, 1_200_000);

        // Agregar empleados al sistema
        nomina.agregarEmpleado(e1);
        nomina.agregarEmpleado(e2);
        nomina.agregarEmpleado(e3);
        nomina.agregarEmpleado(e4);

        // Imprimir resultado
        System.out.println("Nómina total = " + nomina.calcularNominaTotal());
    }
}
