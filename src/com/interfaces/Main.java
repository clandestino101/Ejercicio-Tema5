package com.interfaces;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();

        cocheCrud.findAll();

        String papelera = cocheCrud.delete();

        System.out.println(papelera);


    }
}
