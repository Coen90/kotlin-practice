package com.test.kotlinpractice.study.chap10;

public class JavaPenguin extends JavaAnimal implements Swimable, Flyable {

    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄이 움직입니다! 꿱꿱");
    }

    @Override
    public int getLegCount() {
        return this.getLegCount() + this.wingCount;
    }

    @Override
    public void act() {
        Swimable.super.act();
        Flyable.super.act();
    }
}
