import concretePrototypes.Button;
import concretePrototypes.LED;
import concretePrototypes.Switcher;
import concretePrototypes.Table;
import gerenciadores.PrototypesManager;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Button buttonA = new Button("start");
        LED ledA = new LED("Red");
        Switcher switcherA = new Switcher("easy", "medium", "hard");
        Table tableA =  new Table(buttonA, ledA, switcherA);

        var tableClone = (Table) tableA.clone();

        System.out.println("Table A:\n" + tableA);
        System.out.println("Table Clone:\n" + tableClone);

        PrototypesManager prototypesManager = new PrototypesManager();

        Button buttonB = new Button("Power");
        LED ledB = new LED("Blue");
        Switcher switcherB = new Switcher("sleep", "shutdown", "restore");
        Table tableB =  new Table(buttonB, ledB, switcherB);

        Button buttonC = new Button("Restart");
        LED ledC = new LED("Green");
        Switcher switcherC = new Switcher("in 5", "in 10", "in 15");
        Table tableC =  new Table(buttonC, ledC, switcherC);

        List<String> tags = new ArrayList<String>();

        tags.add("tableA");
        tags.add("tableB");
        tags.add("tableC");

        prototypesManager.insert("tableA", tableA);
        prototypesManager.insert("tableB", tableB);
        prototypesManager.insert("tableC", tableC);

        for( String tag : tags){
            System.out.println("Prototype " + tag + "\n" + prototypesManager.recover(tag));
        }
    }
}