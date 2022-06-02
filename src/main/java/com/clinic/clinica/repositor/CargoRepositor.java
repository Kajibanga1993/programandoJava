package com.clinic.clinica.repositor;

import com.clinic.clinica.modelos.Cargo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepositor extends JpaRepository<Cargo,Long> {
    
}
