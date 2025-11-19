package com.jcaa.gastos.core.domain;

import java.time.LocalDate;

public class Gasto {
    private Long id;
    private LocalDate fecha;
    private Double valorTotalSinIVA;
    private Double ivaTotal;
    private Double valorTotalConIVA;
    private String nombreUsuario;
    private String lugar;
    private String descripcion;

    public Gasto() {}

    public Gasto(Long id, LocalDate fecha, Double valorTotalSinIVA, Double ivaTotal, Double valorTotalConIVA, String nombreUsuario, String lugar, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.valorTotalSinIVA = valorTotalSinIVA;
        this.ivaTotal = ivaTotal;
        this.valorTotalConIVA = valorTotalConIVA;
        this.nombreUsuario = nombreUsuario;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }

    // getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public java.time.LocalDate getFecha() { return fecha; }
    public void setFecha(java.time.LocalDate fecha) { this.fecha = fecha; }
    public Double getValorTotalSinIVA() { return valorTotalSinIVA; }
    public void setValorTotalSinIVA(Double valorTotalSinIVA) { this.valorTotalSinIVA = valorTotalSinIVA; }
    public Double getIvaTotal() { return ivaTotal; }
    public void setIvaTotal(Double ivaTotal) { this.ivaTotal = ivaTotal; }
    public Double getValorTotalConIVA() { return valorTotalConIVA; }
    public void setValorTotalConIVA(Double valorTotalConIVA) { this.valorTotalConIVA = valorTotalConIVA; }
    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
