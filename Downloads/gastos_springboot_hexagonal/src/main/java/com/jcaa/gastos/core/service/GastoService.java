package com.jcaa.gastos.core.service;

import com.jcaa.gastos.core.domain.Gasto;
import com.jcaa.gastos.core.port.GastoRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GastoService {
    private final GastoRepositoryPort repository;

    public GastoService(GastoRepositoryPort repository) {
        this.repository = repository;
    }

    public Gasto create(Gasto gasto) {
        return repository.save(gasto);
    }

    public Optional<Gasto> findById(Long id) {
        return repository.findById(id);
    }

    public List<Gasto> findAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
