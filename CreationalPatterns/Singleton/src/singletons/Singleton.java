package singletons;

public class Singleton {
    private String singletonName = "Singleton";
    private static Singleton instance;

    protected Singleton(){
    }

    public static Singleton getInstance(){
        if( instance == null)
            instance = new Singleton();
        return instance;
    }

    public String getSingletonName(){
        return this.singletonName;
    }

    public String setSingletonName(String singletonName){
        return this.singletonName = singletonName;
    }
}
