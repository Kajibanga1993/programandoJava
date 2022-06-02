package com.clinic.clinica.servicos;

import java.util.List;

import com.clinic.clinica.modelos.Funcionario;

public interface FuncionarioInterface {



    void save(Funcionario funcionario);
    
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
    
}
