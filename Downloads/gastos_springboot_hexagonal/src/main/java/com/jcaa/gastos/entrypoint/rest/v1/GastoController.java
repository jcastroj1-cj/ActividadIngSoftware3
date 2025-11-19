package com.jcaa.gastos.entrypoint.rest.v1;

import com.jcaa.gastos.core.domain.Gasto;
import com.jcaa.gastos.core.service.GastoService;
import com.jcaa.gastos.entrypoint.rest.v1.dto.GastoRequest;
import com.jcaa.gastos.entrypoint.rest.v1.dto.GastoResponse;
import com.jcaa.gastos.entrypoint.rest.v1.mappers.GastoRestMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/gastos")
public class GastoController {

    private final GastoService service;

    public GastoController(GastoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<GastoResponse> create(@Validated @RequestBody GastoRequest request) {
        Gasto saved = service.create(GastoRestMapper.toDomain(request));
        return ResponseEntity.created(URI.create("/api/v1/gastos/" + saved.getId()))
                .body(GastoRestMapper.toResponse(saved));
    }

    @GetMapping
    public List<GastoResponse> list() {
        return service.findAll().stream().map(GastoRestMapper::toResponse).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GastoResponse> get(@PathVariable Long id) {
        return service.findById(id).map(g -> ResponseEntity.ok(GastoRestMapper.toResponse(g)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
