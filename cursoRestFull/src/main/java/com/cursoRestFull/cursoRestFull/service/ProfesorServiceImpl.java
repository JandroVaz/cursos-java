package com.cursoRestFull.cursoRestFull.service;

import com.cursoRestFull.cursoRestFull.dao.IProfesorDao;
import com.cursoRestFull.cursoRestFull.entity.Profesor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServiceImpl implements IProfesorService{

    @Autowired
    private IProfesorDao profesorDao;
    @Override
    @Transactional(readOnly = true)
    public List<Profesor> findAll() {
        return (List<Profesor>) profesorDao.findAll();
    }

    @Override
    @Transactional
    public void save(Profesor profesor) {
        profesorDao.save(profesor);
    }

    @Override
    @Transactional(readOnly = true)
    public Profesor findProfesor(Profesor profesor) {
        return (Profesor) profesorDao.findByEmail(profesor.getEmail());
    }

    @Override
    @Transactional(readOnly = true)
    public Profesor checkProfesorLogin(Profesor profesor) {
        return (Profesor) profesorDao.findByEmailAndPassword(profesor.getEmail(),profesor.getPassword());
    }

    @Override
    public void deleteProfesor(Profesor profesor) {
        profesorDao.delete(profesor);
    }

    @Override
    @Transactional
    public Profesor updateProfesor(Profesor profesor) {
        return (Profesor) profesorDao.save(profesor);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Profesor> findProfesorById(Long id) {
        return (Optional<Profesor>) profesorDao.findById(id);
    }

    @Override
    @Transactional
    public void deleteProfesor(Long id) {
        profesorDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Profesor findById(Long id) {
        return (Profesor) profesorDao.findById(id).orElse(null);
    }

    @Override
    public Profesor findByIdSQL(Long id) {
        return profesorDao.findByIdSQL(id);
    }
}
