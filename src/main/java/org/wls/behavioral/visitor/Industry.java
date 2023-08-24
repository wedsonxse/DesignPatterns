package org.wls.behavioral.visitor;

public class Industry extends Build implements  Visitable{

    public Industry(String name){
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
