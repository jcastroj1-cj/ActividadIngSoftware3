/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomina.model;

/**
 *
 * @author Jean Carlos
 */
public class EmpleadoPorHoras extends Empleado {

    private double tarifaHora;
    private int horasTrabajadas;
    private boolean aceptaFondo;

    public EmpleadoPorHoras(String nombre, String id, int aniosEmpresa,
                            double tarifaHora, int horasTrabajadas, boolean aceptaFondo) {
        super(nombre, id, aniosEmpresa);

        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas no pueden ser negativas.");
        }

        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
        this.aceptaFondo = aceptaFondo;
    }

    @Override
    public double calcularSalarioBruto() {
        int extras = Math.max(0, horasTrabajadas - 40);
        int normales = horasTrabajadas - extras;

        return normales * tarifaHora + extras * tarifaHora * 1.5;
    }

    @Override
    public double calcularBeneficios() {
        if (aniosEmpresa > 1 && aceptaFondo) {
            // fondo de ahorro 2% del salario
            return calcularSalarioBruto() * 0.02;
        }
        return 0;
    }
}
