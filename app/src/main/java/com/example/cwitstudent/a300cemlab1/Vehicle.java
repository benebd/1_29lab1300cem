package com.example.cwitstudent.a300cemlab1;

public class Vehicle {
    public static int counter =0;
    private String make;
    private  int year;
    private String message;

    public Vehicle(){
        this.make="Volvo";
        this.year=2012;
        this.message="This is the default message.";

    }

    public Vehicle(String make,int year){
        this.make  = make;
        this.year =year;
        this.message ="There car is a "+make+"built in"+year+".";
        count();
    }

    public Vehicle(String make){
        this();
        this.make = make;
        message ="You did't type in year value";
        count();

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public  String toString(){
        return message;
    }

    private void count(){
        this.counter++;
    }

    interface Controllable{
        void control();
    }


}
