package com.jcaa.gastos.adapter.databases.sql;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "gastos")
public class GastoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private Double valorTotalSinIVA;
    private Double ivaTotal;
    private Double valorTotalConIVA;
    private String nombreUsuario;
    private String lugar;

    @Column(length = 1000)
    private String descripcion;

    // getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
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
