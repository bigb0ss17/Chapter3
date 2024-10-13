package Exercise2;
import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
    //list
    ArrayList<Flight> flyingObjects = new ArrayList<>();

    Airplane airplane = new Airplane("Boeing 747", 2016);
    Bird bird1 = new Bird("Eagle");
    Bird bird2 = new Bird("Hummingbird");

    //add to the list

    flyingObjects.add(airplane);
    flyingObjects.add(bird1);
    flyingObjects.add(bird2);

    //fly method

    /*airplane.fly();
    bird1.fly();
    bird2.fly();

     */

    //print
        for (Flight obj : flyingObjects) {
            System.out.println(obj.toString());
            obj.fly();
        }
    }
}
