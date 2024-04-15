import singletonRegisters.SingletonManager;
import singletons.AlfaSingleton;
import singletons.Singleton;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Singleton instanceA = Singleton.getInstance();
        Singleton instanceB = Singleton.getInstance();

        instanceA.setSingletonName("T");

        System.out.println("Singleton name: " + instanceA.getSingletonName());
        System.out.println("Singleton name: " + instanceB.getSingletonName());


        AlfaSingleton instanceC = (AlfaSingleton) AlfaSingleton.getInstance();
        AlfaSingleton instanceD = (AlfaSingleton) AlfaSingleton.getInstance();

        instanceC.setSingletonName("J");
        instanceC.setLocalDateTime(LocalDateTime.now());

        System.out.println("Singleton name: " + instanceC.getSingletonName());
        System.out.println("Singleton name: " + instanceC.getLocalDateTime());
        System.out.println("Singleton name: " + instanceD.getSingletonName());
        System.out.println("Singleton name: " + instanceD.getLocalDateTime());

        SingletonManager singletonManager = new SingletonManager();

        var tagList = new ArrayList<String>();

        tagList.add("instanceA");
        tagList.add("instanceB");
        tagList.add("instanceC");
        tagList.add("instanceD");

        singletonManager.insert("instanceA", instanceA);
        singletonManager.insert("instanceB", instanceB);
        singletonManager.insert("instanceC", instanceC);
        singletonManager.insert("instanceD", instanceD);

        for( String tag : tagList){
            System.out.println("from manager:" + singletonManager.search(tag).getSingletonName());
        }
    }
}