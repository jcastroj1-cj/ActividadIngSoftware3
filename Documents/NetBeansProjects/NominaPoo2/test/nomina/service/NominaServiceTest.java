/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nomina.service;

import org.junit.Test;
import static org.junit.Assert.*;
import nomina.model.*;

public class NominaServiceTest {

    @Test
    public void testCalcularNominaTotal() {

        NominaService nomina = new NominaService();

        Empleado e1 = new EmpleadoAsalariado("Ana", "001", 6, 2000000);
        Empleado e2 = new EmpleadoTemporal("Luis", "002", 1, 1200000);

        nomina.agregarEmpleado(e1);
        nomina.agregarEmpleado(e2);

        double total = nomina.calcularNominaTotal();

        assertTrue(total > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHorasNegativas() {
        new EmpleadoPorHoras("Pedro", "003", 1, 20000, -5, false);
    }
}
