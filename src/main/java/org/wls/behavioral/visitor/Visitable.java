package org.wls.behavioral.visitor;

public interface Visitable {
    // Nesta interface definimos as propriedades padrão
    // Dos objetos que serão visitados pelo nosso visitor
    // Aqui, estou colocando o método de accept, e a função que será invocada pelo visitor

    public void accept(Visitor visitor);
    public void getBuildingName();
}
