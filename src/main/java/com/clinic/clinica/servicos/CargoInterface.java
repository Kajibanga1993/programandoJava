package com.clinic.clinica.servicos;

import java.util.List;

import com.clinic.clinica.modelos.Cargo;

public interface CargoInterface {



    void save(Cargo cargo);
    
	void update(Cargo cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
    
}
