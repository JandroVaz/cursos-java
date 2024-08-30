package org.avazqudi.stream.ejemplo;

import org.avazqudi.stream.ejemplo.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamFilterSingle {

    public static void main(String[] args) {

        Stream<Usuario> usuario = Stream.of("pato vazquez", "pepe gomez", "manuel gutierrez", "manolo perez", "pepe garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("pepe"))
                .peek(e -> System.out.println(e.getNombre())); //se inspecciona;

        Optional<Usuario> primerUsuario = usuario.findFirst();
        System.out.println(primerUsuario);

    }
}
