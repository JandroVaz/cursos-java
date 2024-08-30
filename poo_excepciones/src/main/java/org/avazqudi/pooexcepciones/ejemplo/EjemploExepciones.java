package org.avazqudi.pooexcepciones.ejemplo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class EjemploExepciones {
    public static void main(String[] args) {


        //Unchecked que no nos obliga a manejar la excepcion

        String valor = JOptionPane.showInputDialog("Ingrese un entero:");
        int divisor;

        try {
            divisor = Integer.parseInt(valor);
            var division = 10/ divisor;
            System.out.println(division);
        } catch (ArithmeticException ex){
            System.out.println("Capturamos la excepcion en tiempo y en ejecucion por aritmeticException" +
                    ex.getMessage());
            main(args);
        } catch (NumberFormatException ex) {
            System.out.println("Capturamos la excepcion en tiempo y en ejecucion por NumberFormatException" +
                    ex.getMessage());
            main(args);
        } catch (Exception ex) {
            System.out.println("Capturamos la excepcion en tiempo y en ejecucion por exception general" +
                    ex.getMessage());
            main(args);
        }
        System.out.println("Continuamos con la ejecución.");

    }
}
