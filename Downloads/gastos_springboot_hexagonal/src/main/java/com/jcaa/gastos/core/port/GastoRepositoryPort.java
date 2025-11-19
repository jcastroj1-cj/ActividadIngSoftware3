package com.jcaa.gastos.core.port;

import com.jcaa.gastos.core.domain.Gasto;

import java.util.List;
import java.util.Optional;

public interface GastoRepositoryPort {
    Gasto save(Gasto gasto);
    Optional<Gasto> findById(Long id);
    List<Gasto> findAll();
    void deleteById(Long id);
}
