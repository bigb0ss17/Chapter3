package Exercise1;

public class Chicken extends FarmAnimal{
    private String sound;

    //constructor


    public Chicken (String name, String gender, double weight, int age){
        super(name, gender, weight, age);
        this.sound = (gender.equalsIgnoreCase("male")) ? "Cock-a-Doodle-doo" : "Cluck Cluck";
    }

    //setter

    public void setSound(String sound){this.sound = sound;}

    //getter

    public String getSound(){return this.sound;}

    //feeding
    public String feedLoadingSchedule(){
        return "8am - 4pm";
    }

    //toString

    public String toString(){
        return "Chicken " + sound + "" + super.toString();
    }



}
