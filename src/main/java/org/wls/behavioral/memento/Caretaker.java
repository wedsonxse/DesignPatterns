package org.wls.behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private Originator originator;
    private Stack<Memento> history;

    public Caretaker(Originator originator){
        this.history = new Stack<>();
        this.setOriginator(originator);
    }

    public void undo(){
        Memento lastSnapshot = this.history.pop();
        this.originator.restore(lastSnapshot);
    }

    private void setOriginator(Originator originator){
        this.originator = originator;
    }

    public void saveCurrentState(){
        this.history.push(this.originator.save());
    }
}
