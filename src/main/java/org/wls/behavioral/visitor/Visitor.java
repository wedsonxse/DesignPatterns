package org.wls.behavioral.visitor;

public class Visitor implements ElementVisitor {
    /*
     Aqui é nossa implementação de Visitor, onde de fato usamos os métodos
     Para aplicar as operações aos diferentes objetos com base no seu tipo
     Aqui, sobrecarremos as funções com base nos tipos dos parametros
     Para que diferentes comportamentos sejam invocados
     */

    @Override
    public void visit(House h) {
        h.getBuildingName();
    }

    @Override
    public void visit(Industry i) {
        i.getBuildingName();
    }

    @Override
    public void visit(Hospital hp) {
        hp.getBuildingName();
    }

    @Override
    public void visit(Commerce c) {
        c.getBuildingName();
    }
}
