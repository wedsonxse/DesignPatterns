package org.wls.structural.adapter;

public class CarMuncher {
    public void destroyCar(Car carJunk){
        System.out.println("O carro " + carJunk.getModel() + " foi destruído!");
    }
}
