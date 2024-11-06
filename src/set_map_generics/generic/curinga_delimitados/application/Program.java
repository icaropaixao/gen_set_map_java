package set_map_generics.generic.curinga_delimitados.application;


import java.util.ArrayList;
import java.util.List;

import set_map_generics.generic.curinga_delimitados.entities.Circle;
import set_map_generics.generic.curinga_delimitados.entities.Rectangle;
import set_map_generics.generic.curinga_delimitados.entities.Shape;

public class Program {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    //                            (qualquer tipo que seja sub-tipo de Shape)
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }

        return sum;
    }
}