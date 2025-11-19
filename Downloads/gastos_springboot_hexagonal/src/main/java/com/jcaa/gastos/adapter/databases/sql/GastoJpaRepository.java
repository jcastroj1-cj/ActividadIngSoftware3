package com.jcaa.gastos.adapter.databases.sql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoJpaRepository extends JpaRepository<GastoEntity, Long> {
}
