package org.example;

abstract class Bike {
    Bike(){
        System.out.println("This is a Bike");
    }

    abstract void run();

    int num(){

        int num=5;
        System.out.println(num);
        return num;
    }
}
