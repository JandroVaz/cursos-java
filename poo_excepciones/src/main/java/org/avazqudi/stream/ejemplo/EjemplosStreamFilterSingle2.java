package org.avazqudi.stream.ejemplo;

import org.avazqudi.stream.ejemplo.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFilterSingle2 {

    public static void main(String[] args) {

        Usuario usuario = Stream.of("pato vazquez", "pepe gomez", "manuel gutierrez", "manolo perez", "pepe garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("pepe")).findFirst().get();
        System.out.println(usuario);

        // por ID

        Usuario usuario2 = Stream.of("pato vazquez", "pepe gomez", "manuel gutierrez", "manolo perez", "pepe garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId().equals(5))
                .findFirst().get();
        System.out.println(usuario2);

    }
}
