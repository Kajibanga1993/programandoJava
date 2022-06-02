package com.clinic.clinica.controller;



import java.util.List;
import java.util.Optional;

import com.clinic.clinica.modelos.Funcionario;
import com.clinic.clinica.repositor.FuncionarioRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
   
    FuncionarioRepositor repositorio;


    @GetMapping("/{id}")
    @CrossOrigin
    public Optional<Funcionario> procurarPor_id(@PathVariable("id") long id){
     return repositorio.findById(id);

    }

    @GetMapping
    @CrossOrigin
    public List<Funcionario> ListarTodos(){
      return repositorio.findAll();
    }




    @PostMapping
    @CrossOrigin
    public void Salvar(@RequestBody Funcionario funcionario){
    repositorio.save(funcionario);

    }



    @DeleteMapping("/{id}")
    @CrossOrigin
    public void deletar_id(@PathVariable("id") long id){
    repositorio.deleteById(id);

    }


    @PutMapping("/{id}")
    @CrossOrigin
    public void actualizar(@PathVariable("id") long id, @RequestBody Funcionario funcionario){
    repositorio.save(funcionario).setId(id);

    }

    
}
