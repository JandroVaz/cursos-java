package org.avazqudi.stream.ejemplo;

import org.avazqudi.stream.ejemplo.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamMap {

    public static void main(String[] args) {

        // 4 formas de crear un stream
        /*Stream.of("pato", "pepe", "manuel", "manolo")
                .map(nombre -> {
                    return nombre.toUpperCase();
                }).forEach(System.out::println);
*/
/*        Stream.of("pato", "pepe", "manuel", "manolo")
                .peek(e -> System.out.println(e)) //se inspecciona
                .map(nombre -> {
                    return nombre.toUpperCase(); // luego se devuelve resultado final
                }).forEach(System.out::println);*/

        Stream.of("pato", "pepe", "manuel", "manolo")
                .map(nombre -> {
                    return nombre.toUpperCase(); // luego se devuelve resultado final
                })
                .peek(e -> System.out.println(e)) //se inspecciona
                .map(el -> el.toLowerCase())
                .forEach(System.out::println);

        // más optimizado


        Stream.of("pato", "pepe", "manuel", "manolo")
                .map(String::toUpperCase)
                .peek(e -> System.out.println(e)) //se inspecciona
                .map(String::toLowerCase)
                .forEach(System.out::println);

        // transformamos a una lista

        Stream<String> nombres = Stream.of("pato", "pepe", "manuel", "manolo")
                .map(String::toUpperCase)
                .peek(e -> System.out.println(e)) //se inspecciona
                .map(String::toLowerCase);

        List<String> lista = nombres.collect(Collectors.toList());


        // Ahora con objetos

        Stream<Usuario> nombresObject = Stream.of("pato vazquez", "pepe gomez", "manuel gutierrez", "manolo perez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
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
