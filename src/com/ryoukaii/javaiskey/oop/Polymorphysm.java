package com.ryoukaii.javaiskey.oop;

class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(double a, double b){
        return a + b;
    }
}

class Animal{
    public void sound(){
        System.out.println("Some animal makes a sound");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Miaw");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Aug");
    }
}

public class Polymorphysm {
    public Polymorphysm(){
        System.out.println();
        Calculator calc = new Calculator();

        System.out.println("2 + 3: " + calc.add(2,3));
        System.out.println("1 + 2 + 3: " + calc.add(1,2,3));
        System.out.println("2.5 + 3.5: " + calc.add(2.5,3.5));

        System.out.println();
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}
