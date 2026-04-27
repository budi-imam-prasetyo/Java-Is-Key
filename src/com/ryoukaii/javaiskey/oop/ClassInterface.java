package com.ryoukaii.javaiskey.oop;

import java.util.ArrayList;
import java.util.List;

public class ClassInterface {

    public ClassInterface() {
            String stringValue = "Hello, Java!";
            System.out.println("String: " + stringValue);

            int[] arrayValue = {1, 2, 3, 4, 5};
            System.out.print("Array: ");
            for(int num : arrayValue) {
                System.out.print(num + " ");
            }
            System.out.println();

            Person person = new Person("John", 30);
            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());

            Animal dog = new Dog();
            dog.sound();

            Day today = Day.MONDAY;
            System.out.println("Today is: " + today);

            List<String> listValue = new ArrayList<>();
            listValue.add("Java");
            listValue.add("Python");
            listValue.add("C++");
            System.out.println("List: " + listValue);
        }

    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    interface Animal {
        void sound();
    }

    class Dog implements Animal {
        public void sound() {
            System.out.println("Woof Woof!");
        }
    }

    enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
}
