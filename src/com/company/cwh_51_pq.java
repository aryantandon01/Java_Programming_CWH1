package com.company;

import java.sql.SQLOutput;

class Circle{
    int radius;
    Circle(int r){
        this.radius = r;
    }
    double area(){
        return this.radius * this.radius;
    }
}
class Cylinder1 extends Circle{
    int height;
    Cylinder1(int r, int h){
        super(r);
        this.height = h;
    }
    double vol(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}
public class cwh_51_pq {
    public static void main(String[] args) {
        Cylinder1 c = new Cylinder1(4, 4);
        System.out.println(c.vol());
    }
}
