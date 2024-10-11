package Exercise1;
import java.util.ArrayList;

public class MyFarm {
    public static void main(String[] args){
        ArrayList<FarmAnimal> farmAnimals = new ArrayList();

        Duck duck1 = new Duck("Donald", "male", 3.2, 5);
        Duck duck2 = new Duck("Cheese", "female", 3.6, 5);
        Cow cow = new Cow("Molly", "female", 1600.0 , 3 );
        Chicken chicken1 = new Chicken("Albert", "male", 1.6, 2);
        Chicken chicken2 = new Chicken("Amelia", "female", 1.8, 4);
        Chicken chicken3 = new Chicken("Dixie", "female", 1.7, 4);

        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(cow);
        System.out.println(chicken1);
        System.out.println(chicken2);
        System.out.println(chicken3);

        System.out.println(duck1.getName() + ": " + duck1.feedLoadingSchedule());
        System.out.println(duck2.getName() + ": " + duck2.feedLoadingSchedule());
        System.out.println(cow.getName() + ": " + cow.feedLoadingSchedule());
        System.out.println(chicken1.getName() + ": " + chicken1.feedLoadingSchedule());
        System.out.println(chicken2.getName() + ": " + chicken2.feedLoadingSchedule());
        System.out.println(chicken3.getName() + ": " + chicken3.feedLoadingSchedule());



    }
}
