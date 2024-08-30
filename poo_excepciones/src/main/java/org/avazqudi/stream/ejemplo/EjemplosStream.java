package org.avazqudi.stream.ejemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemplosStream {

    public static void main(String[] args) {

        // 4 formas de crear un stream
        Stream<String> nombres = Stream.of("pato", "pepe", "manuel", "manolo");

        nombres.forEach(e -> System.out.println(e));

        String[] arr = {"pato", "pepe", "manuel", "manolo"};
        Stream<String> nombres2 = Arrays.stream(arr);

        nombres2.forEach(e -> System.out.println(e));

        Stream<String> nombres3 = Stream.<String>builder().add("Pato").add("pepe").build();

        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("pepe");
        listaNombres.add("manolo");
        listaNombres.add("maria");

        Stream<String> nombres4 = listaNombres.stream();
        listaNombres.stream().forEach(System.out::println);





    }
}
