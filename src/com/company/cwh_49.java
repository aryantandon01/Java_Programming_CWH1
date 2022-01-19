package com.company;

class phone {
    public void call()
    {
        System.out.println("Call");
    }
}

class smartPhone extends phone {
    public void call()
    {
        System.out.println("Video Call");
    }
    public void web()
    {
        System.out.println("Browse");
    }
}

public class cwh_49 {
    public static void main(String[] args) {
        phone obj = new smartPhone(); //This is dynamic method dispatch
//        smartPhone obj2 = new phone();
//        This will give an error, only the superclass can be called.
//        Every smartphone is a phone but not every phone is a smartphone. Same analogy can be applied here.
        obj.call();

        phone obj2 = new phone();
        obj2.call();
    }
}
