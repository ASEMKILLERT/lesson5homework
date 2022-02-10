package com.company;

public class Hero {
    String Hero;
    int health;
    int damage;
    String superpower;

     public Hero(int health, int damage, String superpower) {
this.health = health;
this.damage = damage;
this.superpower = superpower;
     }
     public Hero (int health, int damage){
         this.health = health;
         this.damage = damage;
     }

    public int getHealth() {return this.health;}
    public int getDamage() {return this.damage;}
    public String getHero() {return this.superpower;}
}
