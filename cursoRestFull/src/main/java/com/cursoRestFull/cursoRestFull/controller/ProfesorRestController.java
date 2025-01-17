package com.cursoRestFull.cursoRestFull.controller;

import com.cursoRestFull.cursoRestFull.entity.Profesor;
import com.cursoRestFull.cursoRestFull.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfesorRestController {

    @Autowired
    IProfesorService profesorService;

    @GetMapping("/profesores")
    @ResponseStatus(HttpStatus.OK)
    public List<Profesor> getProfesores(){
        return profesorService.findAll();
    }

    @PostMapping("/sign_up")
    public ResponseEntity<Void> addProfesor(@RequestBody Profesor profesor){
        if(profesorService.findProfesor(profesor)==null){
            profesorService.save(profesor);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
}
