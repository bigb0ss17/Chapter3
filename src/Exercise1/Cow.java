package Exercise1;

public class Cow extends FarmAnimal{
    private String sound;

    //constructor

    public Cow(String name, String gender, double weight, int age){
        super(name,gender,weight,age);
        this.sound = "Moo Moo";
    }
    //setter

    public void setSound(String sound){this.sound = sound;}

    //getter

    public String getSound(){return this.sound;}

    //feeding

    public String feedLoadingSchedule(){
        return "6am - 4pm";
    }

    //toString

    public String toString(){
        return "Cow " + sound + "" + super.toString();
    }
}
