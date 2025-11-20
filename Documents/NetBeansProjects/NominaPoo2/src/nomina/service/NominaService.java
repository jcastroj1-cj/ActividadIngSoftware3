/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina.service;

import nomina.model.Empleado;
import java.util.ArrayList;
import java.util.List;

public class NominaService {

    private List<Empleado> empleados = new ArrayList<>();

    // Agregar empleado a la lista
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    // Calcular el total de la nómina sumando el salario neto de cada empleado
    public double calcularNominaTotal() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalarioNeto();
        }
        return total;
    }

    // Obtener lista de empleados (opcional, útil para pruebas)
    public List<Empleado> getEmpleados() {
        return empleados;
    }
}