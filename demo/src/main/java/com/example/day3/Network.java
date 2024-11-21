package com.example.day3;

public class Network {
    //datafields
    private Node[] nodes;
    private Link[] links;

    //constructor
    public Network(Node[] nodes, Link[] links){
        this.nodes = nodes;
        this.links = links;
    }

    //getter
    public Node[] getNodes(){
        return nodes;
    }
    public Link[] getLinks(){
        return links;
    }
}
