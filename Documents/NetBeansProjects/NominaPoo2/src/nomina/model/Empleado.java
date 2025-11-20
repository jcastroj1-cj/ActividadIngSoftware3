/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina.model;

/**
 *
 * @author Jean Carlos
 */
public abstract class Empleado {

    protected String nombre;
    protected String id;
    protected int aniosEmpresa;

    public Empleado(String nombre, String id, int aniosEmpresa) {
        if (aniosEmpresa < 0) {
            throw new IllegalArgumentException("Los años no pueden ser negativos.");
        }
        this.nombre = nombre;
        this.id = id;
        this.aniosEmpresa = aniosEmpresa;
    }

    public abstract double calcularSalarioBruto();
    public abstract double calcularBeneficios();

    public double calcularDeducciones() {
        double bruto = calcularSalarioBruto();
        return bruto * 0.04 + bruto * 0.04; // salud y pensión
    }

    public double calcularSalarioNeto() {
        double bruto = calcularSalarioBruto();
        double beneficios = calcularBeneficios();
        double deducciones = calcularDeducciones();
        double neto = bruto + beneficios - deducciones;

        if (neto < 0)
            throw new IllegalArgumentException("El salario neto no puede ser negativo");

        return neto;
    }

    public boolean esEmpleadoPermanente() {
        return false;
    }
}