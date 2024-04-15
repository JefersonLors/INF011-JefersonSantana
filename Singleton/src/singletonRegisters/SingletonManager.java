package singletonRegisters;

import singletons.Singleton;

import java.util.HashMap;

public class SingletonManager {
    private HashMap<String, Singleton> singletons;

    public SingletonManager(){
        this.singletons = new HashMap<>();
    }

    public void insert(String tag, Singleton singleton){
        this.singletons.put(tag, singleton);
    }

    public Singleton search(String tag){
        return this.singletons.get(tag);
    }

}
