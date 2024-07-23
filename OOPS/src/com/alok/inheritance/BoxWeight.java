package com.alok.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }
//    @Override
    static void greeting(){
        System.out.println("I am in boxweight greeting");
    }
        BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
        }
        BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
        }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
//        System.out.println(super.weight);
        this.weight = weight;
    }
}
