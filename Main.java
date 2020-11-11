package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setGodini(20);
        student.setIme("Martin");
        student.setPrezime("Lozanovski");
        Ocenka o1 = new Ocenka("MAT1", "11.11.2020", 10);
        Ocenka o2 = new Ocenka("MAT2", "3.04.2020", 7);
        student.setOcenka(o1);
        student.setOcenka(o2);
        System.out.println(student.getProsek());
        System.out.println(student.toString());
    }
}