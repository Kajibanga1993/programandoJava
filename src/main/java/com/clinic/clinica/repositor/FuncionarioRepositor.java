package com.clinic.clinica.repositor;



import com.clinic.clinica.modelos.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepositor extends JpaRepository<Funcionario,Long> {
    
}