/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina.model;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jean Carlos
 */
public class EmpleadoAsalariadoTest {

    @Test
    public void testCalcularSalarioNeto() {
        EmpleadoAsalariado e = new EmpleadoAsalariado("Ana", "001", 6, 2000000);
        double salario = e.calcularSalarioNeto();
        assertTrue(salario > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSalarioNegativo() {
        new EmpleadoAsalariado("Ana", "001", 6, -2000000);
    }
}