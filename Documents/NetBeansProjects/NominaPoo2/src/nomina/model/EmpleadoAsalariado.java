/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina.model;

/**
 *
 * @author Jean Carlos
 */

public class EmpleadoAsalariado extends Empleado {

    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, String id, int aniosEmpresa, double salarioMensual) {
        super(nombre, id, aniosEmpresa);
        

    if (salarioMensual < 0) {
        throw new IllegalArgumentException("El salario no puede ser negativo");
    }
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioMensual;
    }

    @Override
    public double calcularBeneficios() {
        double bonoAntiguedad = (aniosEmpresa > 5) ? salarioMensual * 0.10 : 0;
        double bonoAlimentacion = 1_000_000; // beneficio extra para empleados permanentes
        return bonoAntiguedad + bonoAlimentacion;
    }

    @Override
    public boolean esEmpleadoPermanente() {
        return true;
    }
}
