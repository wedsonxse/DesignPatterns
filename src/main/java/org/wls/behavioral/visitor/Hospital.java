package org.wls.behavioral.visitor;

public class Hospital extends Build implements  Visitable{
    public Hospital(String name){
        super(name);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void getBuildingName() {
        System.out.println(this.getName());
    }
}
