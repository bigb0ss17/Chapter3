package Exercise3;

public class Bird implements Flight,Movement {
    private String type;

    //non parameter constructor

    public Bird(){
        this.type = "Falcon";
    }
    //constructor

    public Bird(String type){
        this.type = type;
    }

    //setter

    public void setType(String type){this.type = type;}

    //getter

    public String getType(){return this.type;}

    //toString

    public String toString(){
        return "Bird [Type: " + type + "]:";
    }

    //fly

    public void fly(){
        System.out.println("I my wings to fly.");
    }

    //walk

    public void walk() {System.out.println("I walk on my feet");}

    //jump

    public void jump(){System.out.println("I jump by leaping from my feet.");}


}
