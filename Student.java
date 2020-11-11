package com.company;

import java.util.Arrays;

public class Student extends Covek{
    private Ocenka [] ocenki = {};

    @Override
    public String toString() {
        return "Student: {" +
                "godini=" + this.godini +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }

    public void setOcenka(Ocenka o) {
        this.ocenki = Arrays.copyOf(this.ocenki, this.ocenki.length + 1);
        this.ocenki[this.ocenki.length - 1] = o;
    }
    
    public Ocenka[] getOcenki(){
        return this.ocenki;
    }

    public float getProsek() {
        float suma=0;
        for(int i=0; i<this.ocenki.length; i++)
            suma += this.ocenki[i].getOcenka();
        return suma/this.ocenki.length;
        }

    }