package com.jcaa.gastos.adapter.databases.sql;

import com.jcaa.gastos.core.domain.Gasto;
import com.jcaa.gastos.core.port.GastoRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class GastoRepositoryAdapter implements GastoRepositoryPort {

    private final GastoJpaRepository jpa;

    public GastoRepositoryAdapter(GastoJpaRepository jpa) {
        this.jpa = jpa;
    }

    private Gasto toDomain(GastoEntity e) {
        if (e == null) return null;
        return new Gasto(e.getId(), e.getFecha(), e.getValorTotalSinIVA(), e.getIvaTotal(),
                e.getValorTotalConIVA(), e.getNombreUsuario(), e.getLugar(), e.getDescripcion());
    }

    private GastoEntity toEntity(Gasto g) {
        if (g == null) return null;
        GastoEntity e = new GastoEntity();
        e.setId(g.getId());
        e.setFecha(g.getFecha());
        e.setValorTotalSinIVA(g.getValorTotalSinIVA());
        e.setIvaTotal(g.getIvaTotal());
        e.setValorTotalConIVA(g.getValorTotalConIVA());
        e.setNombreUsuario(g.getNombreUsuario());
        e.setLugar(g.getLugar());
        e.setDescripcion(g.getDescripcion());
        return e;
    }

    @Override
    public Gasto save(Gasto gasto) {
        GastoEntity e = toEntity(gasto);
        GastoEntity saved = jpa.save(e);
        return toDomain(saved);
    }

    @Override
    public Optional<Gasto> findById(Long id) {
        return jpa.findById(id).map(this::toDomain);
    }

    @Override
    public List<Gasto> findAll() {
        return jpa.findAll().stream().map(this::toDomain).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        jpa.deleteById(id);
    }
}
