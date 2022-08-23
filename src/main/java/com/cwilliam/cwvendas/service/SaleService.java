package com.cwilliam.cwvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwilliam.cwvendas.entities.Sale;
import com.cwilliam.cwvendas.repository.SaleRepository;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
        return repository.findAll();
    }
    
}
