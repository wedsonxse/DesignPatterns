package org.wls.behavioral.visitor;

public interface ElementVisitor {
    //Nesta interface definimos os métodos e seus parametros de aplicação
    //Que são os tipos de objeto que serão visitados pelo nosso Visitor

    public void visit(House h);
    public void visit(Industry i);
    public void visit(Hospital hp);
    public void visit(Commerce c);
}
