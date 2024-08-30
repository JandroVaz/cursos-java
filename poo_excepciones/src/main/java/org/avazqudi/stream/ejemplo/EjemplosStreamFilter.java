package org.avazqudi.stream.ejemplo;

import org.avazqudi.stream.ejemplo.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamFilter {

    public static void main(String[] args) {

        Stream<Usuario> nombresObject = Stream.of("pato vazquez", "pepe gomez", "manuel gutierrez", "manolo perez", "pepe garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("pepe"))
                .peek(e -> System.out.println(e.getNombre())) //se inspecciona
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> listaUsuarios = nombresObject.collect(Collectors.toList());
        listaUsuarios.forEach(u -> System.out.println(u));

    }
}
