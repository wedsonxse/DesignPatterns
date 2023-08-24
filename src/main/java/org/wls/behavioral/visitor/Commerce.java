package org.wls.behavioral.visitor;

public class Commerce extends Build implements Visitable{

    public Commerce(String name){
        super(name);
    }

    //Accept passando a instancia atual para o visitor realizar sua operação
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // Implementação do método que ser[a invocado pelo visitor
    @Override
    public void getBuildingName() {
        System.out.println(this.getName());
    }
}
