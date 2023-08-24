package org.wls.behavioral.memento;

public class Originator {
    private String state;

    public Originator(String state){
        this.state = state;
    }

    public Memento save(){
        return new Memento(this.getStateToMemento());
    };

    public void restore(Memento memento){
        this.setInnerState(memento.getState());
    };

    private void setInnerState(String state){
        this.state = state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    private String getStateToMemento(){
        return this.state;
    }
}
