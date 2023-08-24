package org.wls.structural.adapter;

public class Motorcycle {
    private String motorcycleType;

    public Motorcycle(String treeType){
        this.setMotorcycleType(treeType);
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String treeType) {
        this.motorcycleType = treeType;
    }
}
