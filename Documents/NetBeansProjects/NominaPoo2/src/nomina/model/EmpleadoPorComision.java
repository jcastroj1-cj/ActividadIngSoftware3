/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina.model;

/**
 *
 * @author Jean Carlos
 */
public class EmpleadoPorComision extends Empleado {

    private double salarioBase;
    private double ventas;
    private double porcentajeComision;

    public EmpleadoPorComision(String nombre, String id, int aniosEmpresa,
                               double salarioBase, double ventas, double porcentajeComision) {
        super(nombre, id, aniosEmpresa);

        if (ventas < 0) {
            throw new IllegalArgumentException("Las ventas no pueden ser negativas.");
        }

        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioBase + (ventas * porcentajeComision);
    }

    @Override
    public double calcularBeneficios() {
        double bonoAdicional = (ventas > 20_000_000) ? ventas * 0.03 : 0;
        double bonoAlimentacion = 1_000_000; // empleado permanente
        return bonoAdicional + bonoAlimentacion;
    }

    @Override
    public boolean esEmpleadoPermanente() {
        return true;
    }
}