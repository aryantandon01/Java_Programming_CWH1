package com.company;

// You can create properties in interfaces
// Those properties are final and you cannot modify them
// Interfaces help in achieving total abstraction
// Ek blueprint mil jaata hai with the help of interfaces
interface Horn{
    public void blowHorn();
    public void volumeHorn();
}

class HornOfCar implements Horn{
    public void blowHorn(){
        System.out.println("Horn");
    }
    public void volumeHorn(){
        System.out.println("Volume is 80");
    }
}

public class cwh_55 {
    public static void main(String[] args) {
        HornOfCar h = new HornOfCar();
        h.blowHorn();
        h.volumeHorn();
    }
}

//Multiple inheritance faces problems when there exist methods with same signature in both the subject classes.
//Due to this Java doesn't support multiple inheritance, but the same concept can be achieved through interfaces.
//A class can implement multiple interfaces and extend a class at the same time.