package com.clasejava.cuatro;

import java.util.ArrayList;
import java.util.Comparator;

public class ListarPersonaRaspoFranco {
    public static void main(String[] args) {

        //creamos 5 objetos personas con nombre y apellidos en español

        ClasePersona persona1 = new ClasePersona("Franco", "Raspo");
        ClasePersona persona2 = new ClasePersona("Pablo", "Zanutti");
        ClasePersona persona3 = new ClasePersona("Nair", "Palacios");
        ClasePersona persona4 = new ClasePersona("Matías", "Maini");
        ClasePersona persona5 = new ClasePersona("Nicolás", "Fabucci");

        //declaramos una lista y agregamos los 5 objetos persona

        ArrayList<ClasePersona> listaPersona = new ArrayList<ClasePersona>();
        listaPersona.add(persona1);
        listaPersona.add(persona2);
        listaPersona.add(persona3);
        listaPersona.add(persona4);
        listaPersona.add(persona5);


        //ordenarlo por nombre
        listaPersona.sort(new Comparator<>() {
            @Override
            public int compare(ClasePersona o1, ClasePersona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println("Lista ordenada por nombre:");
        listaPersona.forEach(System.out::println);

        //ordenarlo por apellido ascendente
        listaPersona.sort(new Comparator<>() {
            @Override
            public int compare(ClasePersona o1, ClasePersona o2) {
                return o1.getApellido().compareTo(o2.getApellido());
            }
        });
        System.out.println("\nLista ordenada por apellido ascendente:");
        listaPersona.forEach(System.out::println);

        //ordenarlo por apellido descendente
        listaPersona.sort(new Comparator<>() {
            @Override
            public int compare(ClasePersona o1, ClasePersona o2) {
                return o2.getApellido().compareTo(o1.getApellido());
            }
        });
        System.out.println("\nLista ordenada por apellido descendente:");
        listaPersona.forEach(System.out::println);
    }
}
