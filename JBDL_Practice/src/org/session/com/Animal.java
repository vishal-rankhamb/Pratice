package org.session.com;

public class Animal extends Lifeform{
    private int weight;

    public Animal(int weight,int age) {
        super(age);
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Animal eats.....");
    }
    public int getWeight(){
        return this.weight;
    }
}
