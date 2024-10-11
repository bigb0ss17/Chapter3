package Exercise1;

public class Duck extends FarmAnimal{
    private String sound;

    //constructor

    public Duck (String name, String gender, double weight, int age){
        super(name,gender, weight,age);
        this.sound = "Quack Quack";
    }

    //setter
    public void setSound(String sound){this.sound = sound;}

    //getter

    public String getSound(){return this.sound;}

    //feeding

    public String feedLoadingSchedule(){
        return "8am - 12pm - 6pm";
    }

    //toString

    public String toString(){
        return "Duck " + sound + "" + super.toString();
    }
}
