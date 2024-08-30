package com.cursoRestFull.cursoRestFull.dao;

import com.cursoRestFull.cursoRestFull.entity.Profesor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IProfesorDao extends CrudRepository<Profesor, Long> {


    public Profesor findByEmail(String email);

    public Profesor findByEmailAndPassword(String email, String Password);

    public Optional<Profesor> findById(Long id);

    @Query("select p from Profesor p where p.id=?1")
    public Profesor findByIdSQL(Long id);
}
