package CareTaker;

import Originator.Originator;

import java.util.Stack;

public class CareTaker<M> {
    private Originator<M> file;

    private Stack<M> history;

    public CareTaker(Originator<M> file){
        this.file = file;
        this.history = new Stack<>();
    }

    public void save(){
        this.history.push(this.file.checkpoint());
    }

    public void undo(){
        if(!this.history.empty()){
            this.file.restore(this.history.pop());
        }
    }

}
