package com.usa.ciclo3.retociclo3.repository;

import com.usa.ciclo3.retociclo3.crudrepository.OrthopedicCrudRepository;
import com.usa.ciclo3.retociclo3.model.Ortopedic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrtopedicRepository {
    @Autowired
    private OrthopedicCrudRepository orthopedicCrudRepository;

    public List<Ortopedic> getAll() {
        return (List<Ortopedic>)  orthopedicCrudRepository.findAll();
    }

    public Optional<Ortopedic> getOrtopedic(int id){
        return orthopedicCrudRepository.findById(id);
    }

    public Ortopedic save(Ortopedic ortopedic){
        return orthopedicCrudRepository.save(ortopedic);
    }

    public void delete(Ortopedic ortopedic){
        orthopedicCrudRepository.delete(ortopedic);}
}
