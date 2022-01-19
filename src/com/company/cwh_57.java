package com.company;

import java.util.Arrays;

interface Camera{
    void photo();
    void video();
    default void slomo(){    // Default methods are used to make methods in interfaces that will be applicable in every class.
        System.out.println("Taking slow motion video");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class Phone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class AppleSmartPhone extends Phone implements Camera, Wifi{
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

class NokiaSmartPhone extends Phone implements Camera, Wifi{
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

public class cwh_57 {
    public static void main(String[] args) {
        AppleSmartPhone x = new AppleSmartPhone();
        x.photo();
        x.video();
        x.slomo();
        NokiaSmartPhone y = new NokiaSmartPhone();
        y.photo();
        y.video();
        y.slomo();
    }
}

