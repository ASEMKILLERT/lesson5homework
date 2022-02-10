package com.company;

public class Main {

    public static void main(String[] args) {
	Hero c1 = new Hero(300,60,"Physical");
        Hero c2 = new Hero(250, 55);
    } public static void Boss(String[] args) {
        Boss bs1 = new Boss();
        bs1.setbHealth(800);
        bs1.setbDamage(100);
        bs1.setbDef("Physical");
        System.out.println("Boss " + bs1.getbHealth() + " Health " + bs1.getbDamage() + " Damage " + bs1.getbDef());
        

    }
}
