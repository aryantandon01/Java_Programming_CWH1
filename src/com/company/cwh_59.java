package com.company;

import java.util.Arrays;

interface Camera2{
    void photo();
    void video();
    default void slomo(){    // Default methods are used to make methods in interfaces that will be applicable in every class.
        System.out.println("Taking slow motion video");
    }
}

interface Wifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class Phone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class AppleSmartPhone2 extends Phone2 implements Camera2, Wifi2{
    public void photo(){
        System.out.println("Take Photo in 4k");
    }
    public void video(){
        System.out.println("Take Video in 4k");
    }
    public String[] getNetworks(){
        String[] networkList;
        networkList = new String[]{"Aryan Wifi", "Airtel Extension"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Apple is connected to" + network);
    }
}

class NokiaSmartPhone2 extends Phone2 implements Camera2, Wifi2{
    public void photo(){
        System.out.println("Take Photo in 1080p");
    }
    public void video(){
        System.out.println("Take Video in 1080p");
    }
    public String[] getNetworks(){
        String[] networkList;
        networkList = new String[]{"Aryan Wifi", "Airtel Extension"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Nokia is connected to" + network);
    }
}

public class cwh_59 {
    public static void main(String[] args) {
        AppleSmartPhone2 x = new AppleSmartPhone2();
        x.photo();
        x.video();
        x.slomo();
        NokiaSmartPhone2 y = new NokiaSmartPhone2();
        y.photo();
        y.video();
        y.slomo();
        Camera2 z = new AppleSmartPhone2(); // If we want someone to use our smartphone as camera only.
    }
}

