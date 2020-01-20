package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        System.out.println(boss.getHealth());
        boss.setDamage(45);

        Warrior warrior = new Warrior();
        warrior.setHealth(200);
        warrior.setDamage(20);
        warrior.superAbility();

        Magical magical = new Magical();
        magical.setHealth(200);
        magical.setDamage(15);
        magical.superAbility();

        Mental mental = new Mental();
        mental.setHealth(200);
        magical.setDamage(15);
        mental.superAbility();



    }

}

    

