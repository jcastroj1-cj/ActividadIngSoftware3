package com.jcaa.gastos.entrypoint.rest.v1.mappers;

import com.jcaa.gastos.core.domain.Gasto;
import com.jcaa.gastos.entrypoint.rest.v1.dto.GastoRequest;
import com.jcaa.gastos.entrypoint.rest.v1.dto.GastoResponse;

public class GastoRestMapper {
    public static Gasto toDomain(GastoRequest r) {
        if (r == null) return null;
        Gasto g = new Gasto();
        g.setFecha(r.getFecha());
        g.setValorTotalSinIVA(r.getValorTotalSinIVA());
        g.setIvaTotal(r.getIvaTotal());
        g.setValorTotalConIVA(r.getValorTotalConIVA());
        g.setNombreUsuario(r.getNombreUsuario());
        g.setLugar(r.getLugar());
        g.setDescripcion(r.getDescripcion());
        return g;
    }

    public static GastoResponse toResponse(Gasto g) {
        if (g == null) return null;
        GastoResponse r = new GastoResponse();
        r.setId(g.getId());
        r.setFecha(g.getFecha());
        r.setValorTotalSinIVA(g.getValorTotalSinIVA());
        r.setIvaTotal(g.getIvaTotal());
        r.setValorTotalConIVA(g.getValorTotalConIVA());
        r.setNombreUsuario(g.getNombreUsuario());
        r.setLugar(g.getLugar());
        r.setDescripcion(g.getDescripcion());
        return r;
    }
}
