package com.cwilliam.cwvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cwilliam.cwvendas.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
