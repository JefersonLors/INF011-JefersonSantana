package concreteCreators.parallelClassesHierarchyImplementation;

import creators.TwoDimensionalFigureCreatorD;
import products.TwoDimensionalFigureManipulator;

public class Client {
    public static void main(String[] args){
        TwoDimensionalFigureCreatorD figureCreator = new SquareCreator();
        figureCreator.view();

        new Client().adapt(figureCreator);
    }

    public void adapt(TwoDimensionalFigureCreatorD figureCreator){
        TwoDimensionalFigureManipulator manipulator = figureCreator.createManipulator();
        System.out.println("Adapting figure for the current screen resolution.");
        manipulator.cut();
        manipulator.reduce();
        manipulator.extend();
        System.out.println("Figure adapted.");
    }
}