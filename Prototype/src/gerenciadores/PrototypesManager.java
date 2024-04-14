package gerenciadores;

import prototypes.Prototype;

import java.util.HashMap;

public class PrototypesManager {
    private HashMap<String, Prototype> prototypes;

    public PrototypesManager(){
        this.prototypes = new HashMap<>();
    }

    public void insert(String tag, Prototype prototype){
        this.prototypes.put(tag, prototype);
    }

    public Prototype recover(String tag){
        return this.prototypes.get(tag).clone();
    }
}
