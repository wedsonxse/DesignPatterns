package org.wls.structural.adapter;

public class CarAdapter extends Car{
    private Motorcycle motorcycle;

    // Since the consturctors have default string values
    // We wouldn't need to add the fields, or get method
    // but we'll add to make it more explicit;
    public CarAdapter(Motorcycle motorcycle){
        super(motorcycle.getMotorcycleType());
        this.motorcycle = motorcycle;
    }

    @Override
    public String getModel(){
        return this.motorcycle.getMotorcycleType();
    }

}
