package org.session.com;

public class Bird extends Animal{
    public Bird(int weight,int age) {
        super(weight,age);
    }
    public void eat(){
        System.out.println("Bird eats ants");
    }
}
