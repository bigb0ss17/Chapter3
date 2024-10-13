package Exercise3;

import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {
        //list
        ArrayList<Movement> movingThings = new ArrayList<>();

        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird bird1 = new Bird("Eagle");
        Bird bird2 = new Bird("Hummingbird");

        //add to the list

        movingThings.add(airplane);
        movingThings.add(bird1);
        movingThings.add(bird2);

        //fly method

        /*airplane.fly();
        bird1.fly();
        bird2.fly();
        
         */

        //print
        for (Movement obj : movingThings) {
            System.out.println(obj.toString());
            obj.fly();
            obj.walk();
            obj.jump();
            System.out.println();
        }
    }
}
