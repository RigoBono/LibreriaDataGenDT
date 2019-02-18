package com.company;

import com.company.DataGeneration.ListaGeneration;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListaGeneration lista=new ListaGeneration();
        System.out.println(lista.toString());
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.toString());
        lista.remove(0);
        System.out.println(lista.toString());
        lista.add(4);
        System.out.printf(lista.toString());

        System.out.println(lista.get(2));


    }
}
