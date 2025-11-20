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
public class EmpleadoTemporalTest {

    @Test
    public void testCalcularSalarioNeto() {
        EmpleadoTemporal e = new EmpleadoTemporal("Luis", "002", 1, 1200000);
        double salario = e.calcularSalarioNeto();
        assertTrue(salario > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMesesNegativos() {
        new EmpleadoTemporal("Luis", "002", -1, 1200000);
    }
}