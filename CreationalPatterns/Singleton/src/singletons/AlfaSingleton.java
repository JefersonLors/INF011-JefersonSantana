package singletons;

import java.time.LocalDateTime;

public class AlfaSingleton extends Singleton {
    private LocalDateTime localDateTime;
    private static AlfaSingleton alfaSingleton;

    protected AlfaSingleton(){
        super();
    }

    public static Singleton getInstance(){
        if( alfaSingleton == null )
            alfaSingleton = new AlfaSingleton();
        return alfaSingleton;
    }

    public void setLocalDateTime(LocalDateTime localDateTime){
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime(){
        return this.localDateTime;
    }
}
