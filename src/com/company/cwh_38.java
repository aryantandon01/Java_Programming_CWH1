package com.company;

class Emp {
    int id;
    String name;
    int sal;
    public void show(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary (in Lakh ₹ per annum): " + sal);
        System.out.print("\n");
    }
}


public class cwh_38 {
    public static void main(String[] args) {
        Emp a = new Emp();
        Emp b = new Emp();
        Emp c = new Emp();
        a.id = 148;
        b.id = 147;
        c.id = 146;
        a.name = "Aryan";
        b.name = "Uday";
        c.name = "Amlan";
        a.sal = 15;
        b.sal = 17;
        c.sal = 18;
        a.show();
        b.show();
        c.show();
    }
}
