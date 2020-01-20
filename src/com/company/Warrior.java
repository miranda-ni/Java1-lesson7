package com.company;

public class Warrior extends Player implements Super,Privet {


    @Override
    public void superAbility() {
        System.out.println("Ударил мечом");
    }

    @Override
    public void Hi() {
        System.out.println("Privet");

    }
}
