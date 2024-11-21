package com.example.day3;

public class Node {
    // Data fields
    private double x;
    private double y;
    private String id;

    //constructor
    public Node(double x, double y, String id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    //getter 
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String getId(){
        return id;
    }

}


