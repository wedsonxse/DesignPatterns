package org.wls.behavioral.visitor;

public class Build {

    /*
    * SuperClasse de objetos do tipo 'build'
    * Esta Classe serve para centralizar um pouco a logica de negócio e informações
    * das demais classes de 'build'
    *
    * */

    private String name;
    public Build(String name){
        this.setName(name);
    }

    private void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
