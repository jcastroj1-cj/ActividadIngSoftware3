/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina.model;

/**
 *
 * @author Jean Carlos
 */
public class EmpleadoTemporal extends Empleado {

    private double salario;

    public EmpleadoTemporal(String nombre, String id, int aniosEmpresa, double salario) {
        super(nombre, id, aniosEmpresa);
        this.salario = salario;
    }

    @Override
    public double calcularSalarioBruto() {
        return salario;
    }

    @Override
    public double calcularBeneficios() {
        // No tiene beneficios adicionales según las reglas
        return 0;
    }
}
