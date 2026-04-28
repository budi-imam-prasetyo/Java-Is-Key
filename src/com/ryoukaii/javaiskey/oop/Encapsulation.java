package com.ryoukaii.javaiskey.oop;

class Person{
    private String name;
    private int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0) {
            this.age = age;
        }else{
            System.out.println("Age must be positive");
        }
    }
}

class Programmer extends Person {
    private String BahasaProgram;
    private int pengalaman;

    public Programmer(String name, int age, String BahasaProgram, int pengalaman){
        super(name,age);
        this.BahasaProgram = BahasaProgram;
        this.pengalaman = pengalaman;
    }

    public void getInformasi(){
        System.out.println("Nama: " + this.getName());
        System.out.println("Usia: " + this.getAge());
        System.out.println("Bahasa Program: " + this.BahasaProgram);
        System.out.println("Pengalaman: " + this.pengalaman);
    }
}

public class Encapsulation {
    public Encapsulation(){
        Programmer programmer1 = new Programmer("Budi", 25, "Java, PHP", 5);
        programmer1.getInformasi();
    }
}
