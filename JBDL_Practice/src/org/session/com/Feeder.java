package org.session.com;

public class Feeder {
    Animal animal;
    public void feed(Animal animal){
        System.out.println(animal.getWeight());
        animal.eat();
    }
}
