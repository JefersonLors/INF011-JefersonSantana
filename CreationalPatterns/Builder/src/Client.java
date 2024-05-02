import concreteBuilders.BasicMouseBuilder;
import concreteBuilders.GamerMouseBuilder;
import concreteBuilders.OfficeMouseBuilder;
import directors.MouseDirector;
import products.BasicMouse;
import products.GamerMouse;
import products.OfficeMouse;

public class Client {
    public static void main(String[] args) {
        MouseDirector director = new MouseDirector();

        BasicMouseBuilder basicMouseBuilder = new BasicMouseBuilder();
        director.buildBasicMouse(basicMouseBuilder);
        BasicMouse basicMouse = basicMouseBuilder.build();

        System.out.println("Basic Mouse with: \n" + basicMouse);

        GamerMouseBuilder gamerMouseBuilder = new GamerMouseBuilder();
        director.buildGamerMouse(gamerMouseBuilder);
        GamerMouse gamerMouse = gamerMouseBuilder.build();

        System.out.println("\n\nGamer Mouse with: \n" + gamerMouse);

        OfficeMouseBuilder officeMouseBuilder = new OfficeMouseBuilder();
        director.buildOfficeMouse(officeMouseBuilder);
        OfficeMouse officeMouse = officeMouseBuilder.build();

        System.out.println("\n\nOffice Mouse with: \n" + officeMouse);
    }
}